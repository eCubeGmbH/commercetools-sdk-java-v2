
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>To update a CartDiscount, you must have permissions for all Stores the CartDiscount is associated with, except when removing a Store.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .cartDiscounts()
 *            .withKey("{key}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost extends
        TypeBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost, com.commercetools.api.models.cart_discount.CartDiscount, com.commercetools.api.models.cart_discount.CartDiscountUpdate>
        implements
        com.commercetools.api.client.ConflictingTrait<ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost> {

    @Override
    public TypeReference<com.commercetools.api.models.cart_discount.CartDiscount> resultType() {
        return new TypeReference<com.commercetools.api.models.cart_discount.CartDiscount>() {
        };
    }

    private String projectKey;
    private String storeKey;
    private String key;

    private com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate;

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost(final ApiHttpClient apiHttpClient,
            String projectKey, String storeKey, String key,
            com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
        this.cartDiscountUpdate = cartDiscountUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost(
            ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.key = t.key;
        this.cartDiscountUpdate = t.cartDiscountUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/cart-discounts/key=%s", this.projectKey,
            this.storeKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(cartDiscountUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.cart_discount.CartDiscount.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.cart_discount.CartDiscount.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getStoreKey() {
        return this.storeKey;
    }

    public String getKey() {
        return this.key;
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

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost
     */
    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost
     */
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.cart_discount.CartDiscountUpdate getBody() {
        return cartDiscountUpdate;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost withBody(
            com.commercetools.api.models.cart_discount.CartDiscountUpdate cartDiscountUpdate) {
        ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost t = copy();
        t.cartDiscountUpdate = cartDiscountUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost that = (ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(key, that.key)
                .append(cartDiscountUpdate, that.cartDiscountUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(storeKey)
                .append(key)
                .append(cartDiscountUpdate)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsKeyByKeyPost(this);
    }
}
