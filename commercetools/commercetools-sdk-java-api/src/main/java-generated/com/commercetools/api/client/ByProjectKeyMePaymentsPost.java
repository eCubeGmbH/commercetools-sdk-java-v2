
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 <div class=code-example>
 <pre><code class='java'>
   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyPayment>> result = apiRoot
           .withProjectKey("{projectKey}")
           .me()
           .payments()
           .post(null)
           .execute()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMePaymentsPost extends
        BodyApiMethod<ByProjectKeyMePaymentsPost, com.commercetools.api.models.me.MyPayment, com.commercetools.api.models.me.MyPaymentDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyMePaymentsPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyMePaymentsPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyMePaymentsPost> {

    private String projectKey;

    private com.commercetools.api.models.me.MyPaymentDraft myPaymentDraft;

    public ByProjectKeyMePaymentsPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.me.MyPaymentDraft myPaymentDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.myPaymentDraft = myPaymentDraft;
    }

    public ByProjectKeyMePaymentsPost(ByProjectKeyMePaymentsPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.myPaymentDraft = t.myPaymentDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/me/payments", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myPaymentDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.me.MyPayment> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.me.MyPayment.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.me.MyPayment>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.me.MyPayment.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specified value
     */
    public <TValue> ByProjectKeyMePaymentsPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public <TValue> ByProjectKeyMePaymentsPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyMePaymentsPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMePaymentsPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyMePaymentsPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyMePaymentsPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public <TValue> ByProjectKeyMePaymentsPost withExpand(final List<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public <TValue> ByProjectKeyMePaymentsPost addExpand(final List<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.me.MyPaymentDraft getBody() {
        return myPaymentDraft;
    }

    public ByProjectKeyMePaymentsPost withBody(com.commercetools.api.models.me.MyPaymentDraft myPaymentDraft) {
        ByProjectKeyMePaymentsPost t = copy();
        t.myPaymentDraft = myPaymentDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyMePaymentsPost that = (ByProjectKeyMePaymentsPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(myPaymentDraft, that.myPaymentDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(myPaymentDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyMePaymentsPost copy() {
        return new ByProjectKeyMePaymentsPost(this);
    }
}
