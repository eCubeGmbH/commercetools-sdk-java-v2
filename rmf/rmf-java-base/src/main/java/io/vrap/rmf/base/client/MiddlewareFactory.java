
package io.vrap.rmf.base.client;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.http.*;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.apache.commons.lang3.SystemUtils;
import org.slf4j.Logger;

public class MiddlewareFactory {
    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory) {
        return createDefault(tokenSupplier, internalLoggerFactory, MiddlewareFactory::buildUserAgent);
    }

    public static List<Middleware> createDefault(final TokenSupplier tokenSupplier,
            final InternalLoggerFactory internalLoggerFactory, final Supplier<String> userAgent) {
        final OAuthHandler oAuthHandler = new OAuthHandler(tokenSupplier);
        return asList(
            (request,
                    next) -> next.apply(request.withHeader(ApiHttpHeaders.USER_AGENT, userAgent.get()).withHeader(
                        ApiHttpHeaders.ACCEPT_ENCODING, "gzip")),
            new ErrorMiddleware(), new InternalLoggerMiddleware(internalLoggerFactory),
            new OAuthMiddleware(oAuthHandler));
    }

    public static String buildUserAgent() {
        String runtimeVersion = SystemUtils.JAVA_RUNTIME_VERSION;
        String osName = SystemUtils.OS_NAME;
        String osArch = SystemUtils.OS_ARCH;
        String sdkVersion = BuildInfo.VERSION;
        return "commercetools-java-sdks/" + sdkVersion + " " + " Java/" + runtimeVersion + " (" + osName + "; " + osArch
                + ")";
    }
}
