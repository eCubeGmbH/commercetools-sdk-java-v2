
package com.commercetools.api.models.cart;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates the current status of a Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartState {

    /**
    	<p>The default state where a Cart can be updated and ordered.</p>

    */
    CartState ACTIVE = CartStateEnum.ACTIVE;
    /**
    	<p>An anonymous Cart was merged into a Customer's Cart on <a href="/../api/projects/customers#authenticate-sign-in-customer">sign-in</a>, and no further operations are allowed on the Cart.</p>

    */
    CartState MERGED = CartStateEnum.MERGED;
    /**
    	<p>A Cart was <a href="/../api/projects/orders#create-order-from-cart">ordered</a>, and no further operations are allowed on the Cart.</p>

    */
    CartState ORDERED = CartStateEnum.ORDERED;
    /**
    	<p>A Cart is <a href="ctp:api:type:FrozenCarts">frozen</a>. Update actions that can change the price of (Custom) Line Items are not allowed.</p>
    	<ul>
    	<li><a href="ctp:api:type:CartAddLineItemAction">Add LineItem</a></li>
    	<li><a href="ctp:api:type:CartChangeLineItemQuantityAction">Change LineItem Quantity</a></li>
    	<li><a href="ctp:api:type:CartRemoveLineItemAction">Remove LineItem</a></li>
    	<li><a href="ctp:api:type:CartSetLineItemDistributionChannelAction">Set LineItem DistributionChannel</a></li>
    	<li><a href="ctp:api:type:CartSetLineItemSupplyChannelAction">Set LineItem SupplyChannel</a></li>
    	<li><a href="ctp:api:type:CartAddCustomLineItemAction">Add CustomLineItem</a></li>
    	<li><a href="ctp:api:type:CartChangeCustomLineItemQuantityAction">Change CustomLineItem Quantity</a></li>
    	<li><a href="ctp:api:type:CartRemoveCustomLineItemAction">Remove CustomLineItem</a></li>
    	<li><a href="ctp:api:type:CartChangeTaxModeAction">Change TaxMode</a></li>
    	<li><a href="ctp:api:type:CartSetLineItemPriceAction">Set LineItem Price</a></li>
    	<li><a href="ctp:api:type:CartSetLineItemTotalPriceAction">Set LineItem TotalPrice</a></li>
    	</ul>

    */
    CartState FROZEN = CartStateEnum.FROZEN;

    enum CartStateEnum implements CartState {
        ACTIVE("Active"),

        MERGED("Merged"),

        ORDERED("Ordered"),

        FROZEN("Frozen");
        private final String jsonName;

        private CartStateEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static CartState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new CartState() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    public static Optional<CartState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static CartState[] values() {
        return CartStateEnum.values();
    }
}
