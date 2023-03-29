
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryAddressCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryAddressCustomTypeAction stagedOrderSetDeliveryAddressCustomTypeAction = StagedOrderSetDeliveryAddressCustomTypeAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetDeliveryAddressCustomTypeActionImpl.class)
public interface StagedOrderSetDeliveryAddressCustomTypeAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetDeliveryAddressCustomTypeAction
     */
    String SET_DELIVERY_ADDRESS_CUSTOM_TYPE = "setDeliveryAddressCustomType";

    /**
     *
     * @return deliveryId
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Defines the Type that extends the <code>address</code> in a Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code> in a Delivery.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code> in a Delivery.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     * set deliveryId
     * @param deliveryId value to be set
     */

    public void setDeliveryId(final String deliveryId);

    /**
     *  <p>Defines the Type that extends the <code>address</code> in a Delivery with Custom Fields. If absent, any existing Type and Custom Fields are removed from the <code>address</code> in a Delivery.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the <code>address</code> in a Delivery.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of StagedOrderSetDeliveryAddressCustomTypeAction
     */
    public static StagedOrderSetDeliveryAddressCustomTypeAction of() {
        return new StagedOrderSetDeliveryAddressCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetDeliveryAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetDeliveryAddressCustomTypeAction of(
            final StagedOrderSetDeliveryAddressCustomTypeAction template) {
        StagedOrderSetDeliveryAddressCustomTypeActionImpl instance = new StagedOrderSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetDeliveryAddressCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetDeliveryAddressCustomTypeAction deepCopy(
            @Nullable final StagedOrderSetDeliveryAddressCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetDeliveryAddressCustomTypeActionImpl instance = new StagedOrderSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetDeliveryAddressCustomTypeAction
     * @return builder
     */
    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder builder() {
        return StagedOrderSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetDeliveryAddressCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryAddressCustomTypeActionBuilder builder(
            final StagedOrderSetDeliveryAddressCustomTypeAction template) {
        return StagedOrderSetDeliveryAddressCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetDeliveryAddressCustomTypeAction(
            Function<StagedOrderSetDeliveryAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetDeliveryAddressCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetDeliveryAddressCustomTypeAction>";
            }
        };
    }
}
