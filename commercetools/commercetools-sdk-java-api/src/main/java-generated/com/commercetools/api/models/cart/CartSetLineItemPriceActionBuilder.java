
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLineItemPriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLineItemPriceAction cartSetLineItemPriceAction = CartSetLineItemPriceAction.builder()
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemPriceActionBuilder implements Builder<CartSetLineItemPriceAction> {

    private String lineItemId;

    @Nullable
    private com.commercetools.api.models.common.Money externalPrice;

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     * @param lineItemId
     * @return Builder
     */

    public CartSetLineItemPriceActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Value to set. If <code>externalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalPrice</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     * @return Builder
     */

    public CartSetLineItemPriceActionBuilder externalPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.externalPrice = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If <code>externalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalPrice</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     * @param externalPrice
     * @return Builder
     */

    public CartSetLineItemPriceActionBuilder externalPrice(
            @Nullable final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    public CartSetLineItemPriceAction build() {
        Objects.requireNonNull(lineItemId, CartSetLineItemPriceAction.class + ": lineItemId is missing");
        return new CartSetLineItemPriceActionImpl(lineItemId, externalPrice);
    }

    /**
     * builds CartSetLineItemPriceAction without checking for non null required values
     */
    public CartSetLineItemPriceAction buildUnchecked() {
        return new CartSetLineItemPriceActionImpl(lineItemId, externalPrice);
    }

    public static CartSetLineItemPriceActionBuilder of() {
        return new CartSetLineItemPriceActionBuilder();
    }

    public static CartSetLineItemPriceActionBuilder of(final CartSetLineItemPriceAction template) {
        CartSetLineItemPriceActionBuilder builder = new CartSetLineItemPriceActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.externalPrice = template.getExternalPrice();
        return builder;
    }

}
