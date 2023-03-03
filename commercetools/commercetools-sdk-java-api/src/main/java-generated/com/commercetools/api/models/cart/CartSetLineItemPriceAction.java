
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the LineItem <code>price</code> and changes the <code>priceMode</code> to <code>ExternalPrice</code> LineItemPriceMode.</p>
 *
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
@JsonDeserialize(as = CartSetLineItemPriceActionImpl.class)
public interface CartSetLineItemPriceAction extends CartUpdateAction {

    String SET_LINE_ITEM_PRICE = "setLineItemPrice";

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Value to set. If <code>externalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalPrice</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     */
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    public void setLineItemId(final String lineItemId);

    public void setExternalPrice(final Money externalPrice);

    public static CartSetLineItemPriceAction of() {
        return new CartSetLineItemPriceActionImpl();
    }

    public static CartSetLineItemPriceAction of(final CartSetLineItemPriceAction template) {
        CartSetLineItemPriceActionImpl instance = new CartSetLineItemPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalPrice(template.getExternalPrice());
        return instance;
    }

    public static CartSetLineItemPriceActionBuilder builder() {
        return CartSetLineItemPriceActionBuilder.of();
    }

    public static CartSetLineItemPriceActionBuilder builder(final CartSetLineItemPriceAction template) {
        return CartSetLineItemPriceActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemPriceAction(Function<CartSetLineItemPriceAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemPriceAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLineItemPriceAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLineItemPriceAction>";
            }
        };
    }
}
