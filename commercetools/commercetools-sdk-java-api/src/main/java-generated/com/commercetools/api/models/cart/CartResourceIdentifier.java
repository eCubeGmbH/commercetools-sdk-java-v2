
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="ctp:api:type:ResourceIdentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Cart">Cart</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartResourceIdentifierImpl.class)
public interface CartResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Cart> {

    String CART = "cart";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Cart">Cart</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:Cart">Cart</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static CartResourceIdentifier of() {
        return new CartResourceIdentifierImpl();
    }

    public static CartResourceIdentifier of(final CartResourceIdentifier template) {
        CartResourceIdentifierImpl instance = new CartResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CartResourceIdentifierBuilder builder() {
        return CartResourceIdentifierBuilder.of();
    }

    public static CartResourceIdentifierBuilder builder(final CartResourceIdentifier template) {
        return CartResourceIdentifierBuilder.of(template);
    }

    default <T> T withCartResourceIdentifier(Function<CartResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CartResourceIdentifier>";
            }
        };
    }
}
