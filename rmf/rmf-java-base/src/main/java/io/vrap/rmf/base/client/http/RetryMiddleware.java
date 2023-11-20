
package io.vrap.rmf.base.client.http;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.failsafe.Failsafe;
import dev.failsafe.FailsafeExecutor;
import dev.failsafe.RetryPolicy;
import dev.failsafe.event.ExecutionAttemptedEvent;
import dev.failsafe.spi.Scheduler;

/**
 * Implementation for a retry of a requests upon configured response status codes
 * @deprecated use {@link PolicyMiddleware} instead
 */
@Deprecated
public class RetryMiddleware implements RetryRequestMiddleware, AutoCloseable {
    static final String loggerName = ClientBuilder.COMMERCETOOLS + ".retry";

    private static final InternalLogger logger = InternalLogger.getLogger(loggerName);
    private static final Logger classLogger = LoggerFactory.getLogger(RetryMiddleware.class);

    private final FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor;

    RetryMiddleware(final int maxRetries, final List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        this(Scheduler.DEFAULT, maxRetries, RetryRequestMiddleware.DEFAULT_INITIAL_DELAY,
            RetryRequestMiddleware.DEFAULT_MAX_DELAY, statusCodes, failures);
    }

    RetryMiddleware(final int maxRetries, final long delay, final long maxDelay, final List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        this(Scheduler.DEFAULT, maxRetries, delay, maxDelay, RetryRequestMiddleware.handleFailures(failures)
                .andThen(RetryRequestMiddleware.handleStatusCodes(statusCodes)));
    }

    RetryMiddleware(final ExecutorService executorService, final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        this(executorService, maxRetries, delay, maxDelay, RetryRequestMiddleware.handleFailures(failures)
                .andThen(RetryRequestMiddleware.handleStatusCodes(statusCodes)));
    }

    RetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries, final long delay,
            final long maxDelay, final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        this(executorService, maxRetries, delay, maxDelay, RetryRequestMiddleware.handleFailures(failures)
                .andThen(RetryRequestMiddleware.handleStatusCodes(statusCodes)));
    }

    RetryMiddleware(final Scheduler scheduler, final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        this(scheduler, maxRetries, delay, maxDelay, RetryRequestMiddleware.handleFailures(failures)
                .andThen(RetryRequestMiddleware.handleStatusCodes(statusCodes)));
    }

    RetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        this(Scheduler.DEFAULT, maxRetries, delay, maxDelay, fn);
    }

    RetryMiddleware(final ExecutorService executorService, final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        this(Scheduler.of(executorService), maxRetries, delay, maxDelay, fn);
    }

    RetryMiddleware(final ScheduledExecutorService executorService, final int maxRetries, final long delay,
            final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        this(Scheduler.of(executorService), maxRetries, delay, maxDelay, fn);
    }

    RetryMiddleware(final Scheduler scheduler, final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        RetryPolicy<ApiHttpResponse<byte[]>> retryPolicy = fn
                .apply(RetryPolicy.<ApiHttpResponse<byte[]>> builder()
                        .withBackoff(delay, maxDelay, ChronoUnit.MILLIS)
                        .withJitter(0.25)
                        .withMaxRetries(maxRetries)
                        .onRetry(this::logEventFailure))
                .build();
        this.failsafeExecutor = Failsafe.with(retryPolicy).with(scheduler);
    }

    private void logEventFailure(ExecutionAttemptedEvent<ApiHttpResponse<byte[]>> event) {
        final int attempt = event.getAttemptCount();

        logger.info(() -> "Retry #" + attempt);
        logger.trace(() -> {
            final Throwable failure = event.getLastException();
            if (failure instanceof ApiHttpException) {
                final ApiHttpException httpException = (ApiHttpException) failure;
                final ApiHttpRequest request = httpException.getRequest();
                final ApiHttpResponse<byte[]> response = httpException.getResponse();
                if (request != null) {
                    return requestLog(attempt, request, response);
                }
            }
            return event.toString();
        });
    }

    private String requestLog(final int attempt, ApiHttpRequest request, ApiHttpResponse<?> response) {
        String output;
        final String httpMethodAndUrl = request.getMethod().name() + " " + request.getUrl().toString();
        if (request.getBody() != null) {
            final String unformattedBody = request.getSecuredBody();
            final boolean isJsonRequest = request.getHeaders()
                    .getHeaders(ApiHttpHeaders.CONTENT_TYPE)
                    .stream()
                    .findFirst()
                    .map(ct -> ct.getValue().toLowerCase().contains("json"))
                    .orElse(true);
            if (isJsonRequest) {
                String prettyPrint;
                try {
                    prettyPrint = JsonUtils.prettyPrint(unformattedBody);
                }
                catch (final JsonException e) {
                    classLogger.warn("pretty print failed", e);
                    prettyPrint = unformattedBody;
                }
                output = "Retry #" + attempt + ": " + request + "\n" + httpMethodAndUrl + "\nformatted: " + prettyPrint;
            }
            else {
                output = "Retry #" + attempt + ": " + request + "\n" + request.getMethod().name() + " "
                        + request.getUrl() + " " + unformattedBody;
            }
        }
        else {
            output = "Retry #" + attempt + ": " + request + "\n" + httpMethodAndUrl + " <no body>";
        }
        if (response != null) {
            output += "\nFailure response: " + response.getStatusCode() + "\n" + response + "\n"
                    + Optional.ofNullable(response.getBody())
                            .map(body -> JsonUtils.prettyPrint(response.getBodyAsString().orElse("")))
                            .orElse("<no body>");
        }
        return output;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return failsafeExecutor.getStageAsync(() -> next.apply(request));
    }

    @Override
    public void close() {
    }
}
