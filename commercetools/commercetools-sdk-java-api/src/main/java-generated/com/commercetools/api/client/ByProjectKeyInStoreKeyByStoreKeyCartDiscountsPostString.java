
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>When using the endpoint, the Store specified in the path and the Stores specified in the payload's <code>stores</code> field are added to the CartDiscount.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.cart_discount.CartDiscount>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .inStoreKeyWithStoreKeyValue("{storeKey}")
 *            .cartDiscounts()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString extends
        StringBodyApiMethod<ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString, com.commercetools.api.models.cart_discount.CartDiscount> {

    public TypeReference<com.commercetools.api.models.cart_discount.CartDiscount> resultType() {
        return new TypeReference<com.commercetools.api.models.cart_discount.CartDiscount>() {
        };
    }

    private String projectKey;
    private String storeKey;

    private String cartDiscountDraft;

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString(final ApiHttpClient apiHttpClient, String projectKey,
            String storeKey, String cartDiscountDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.cartDiscountDraft = cartDiscountDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString(
            ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.storeKey = t.storeKey;
        this.cartDiscountDraft = t.cartDiscountDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/in-store/key=%s/cart-discounts", this.projectKey, this.storeKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            cartDiscountDraft.getBytes(StandardCharsets.UTF_8));

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

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setStoreKey(final String storeKey) {
        this.storeKey = storeKey;
    }

    public String getBody() {
        return cartDiscountDraft;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString withBody(String cartDiscountDraft) {
        ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString t = copy();
        t.cartDiscountDraft = cartDiscountDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString that = (ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(storeKey, that.storeKey)
                .append(cartDiscountDraft, that.cartDiscountDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(storeKey).append(cartDiscountDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString copy() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartDiscountsPostString(this);
    }
}
