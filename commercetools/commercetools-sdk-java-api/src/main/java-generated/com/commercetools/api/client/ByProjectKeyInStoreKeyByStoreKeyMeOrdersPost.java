
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost extends
        BodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost, com.commercetools.api.models.order.Order, com.commercetools.api.models.me.MyOrderFromCartDraft>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost> {

    private String projectKey;
    private String storeKey;

    private com.commercetools.api.models.me.MyOrderFromCartDraft myOrderFromCartDraft;

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, com.commercetools.api.models.me.MyOrderFromCartDraft myOrderFromCartDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.myOrderFromCartDraft = myOrderFromCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost(ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.myOrderFromCartDraft = t.myOrderFromCartDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/in-store/key=%s/me/orders", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(myOrderFromCartDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.order.Order.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.order.Order.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.me.MyOrderFromCartDraft getBody() {
        return myOrderFromCartDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost withBody(
            com.commercetools.api.models.me.MyOrderFromCartDraft myOrderFromCartDraft) {
        ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost t = copy();
        t.myOrderFromCartDraft = myOrderFromCartDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost that = (ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(myOrderFromCartDraft, that.myOrderFromCartDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(myOrderFromCartDraft)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost(this);
    }
}
