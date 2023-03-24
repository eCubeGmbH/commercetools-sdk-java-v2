
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomLineItemTaxRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomLineItemTaxRateAction cartSetCustomLineItemTaxRateAction = CartSetCustomLineItemTaxRateAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomLineItemTaxRateActionBuilder implements Builder<CartSetCustomLineItemTaxRateAction> {

    private String customLineItemId;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public CartSetCustomLineItemTaxRateActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CartSetCustomLineItemTaxRateActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public CartSetCustomLineItemTaxRateActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     * builds CartSetCustomLineItemTaxRateAction with checking for non-null required values
     * @return CartSetCustomLineItemTaxRateAction
     */
    public CartSetCustomLineItemTaxRateAction build() {
        Objects.requireNonNull(customLineItemId,
            CartSetCustomLineItemTaxRateAction.class + ": customLineItemId is missing");
        return new CartSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
    }

    /**
     * builds CartSetCustomLineItemTaxRateAction without checking for non-null required values
     * @return CartSetCustomLineItemTaxRateAction
     */
    public CartSetCustomLineItemTaxRateAction buildUnchecked() {
        return new CartSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
    }

    public static CartSetCustomLineItemTaxRateActionBuilder of() {
        return new CartSetCustomLineItemTaxRateActionBuilder();
    }

    public static CartSetCustomLineItemTaxRateActionBuilder of(final CartSetCustomLineItemTaxRateAction template) {
        CartSetCustomLineItemTaxRateActionBuilder builder = new CartSetCustomLineItemTaxRateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
