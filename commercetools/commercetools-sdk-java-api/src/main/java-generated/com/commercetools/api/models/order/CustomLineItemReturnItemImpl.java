
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * CustomLineItemReturnItem
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemReturnItemImpl implements CustomLineItemReturnItem, ModelBase {

    private String id;

    private String key;

    private Long quantity;

    private String type;

    private String comment;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime createdAt;

    private String customLineItemId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemReturnItemImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key,
            @JsonProperty("quantity") final Long quantity, @JsonProperty("comment") final String comment,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState,
            @JsonProperty("paymentState") final com.commercetools.api.models.order.ReturnPaymentState paymentState,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("customLineItemId") final String customLineItemId) {
        this.id = id;
        this.key = key;
        this.quantity = quantity;
        this.comment = comment;
        this.shipmentState = shipmentState;
        this.paymentState = paymentState;
        this.custom = custom;
        this.lastModifiedAt = lastModifiedAt;
        this.createdAt = createdAt;
        this.customLineItemId = customLineItemId;
        this.type = CUSTOM_LINE_ITEM_RETURN_ITEM;
    }

    /**
     * create empty instance
     */
    public CustomLineItemReturnItemImpl() {
        this.type = CUSTOM_LINE_ITEM_RETURN_ITEM;
    }

    /**
     *  <p>Unique identifier of the Return Item.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the CustomLineItemReturnItem.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Number of Custom Line Items returned.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>User-defined description for the return.</p>
     */

    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>Shipment status of the Return Item.</p>
     */

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>Payment status of the Return Item:</p>
     *  <ul>
     *   <li><code>NonRefundable</code>, for items in the <code>Advised</code> ReturnShipmentState</li>
     *   <li><code>Initial</code>, for items in the <code>Returned</code> ReturnShipmentState</li>
     *  </ul>
     */

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p>Custom Fields of the Return Item.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Date and time (UTC) the Return Item was intitially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p><code>id</code> of the returned CustomLineItem.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setPaymentState(final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemReturnItemImpl that = (CustomLineItemReturnItemImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(key, that.key)
                .append(quantity, that.quantity)
                .append(type, that.type)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(custom, that.custom)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdAt, that.createdAt)
                .append(customLineItemId, that.customLineItemId)
                .append(id, that.id)
                .append(key, that.key)
                .append(quantity, that.quantity)
                .append(type, that.type)
                .append(comment, that.comment)
                .append(shipmentState, that.shipmentState)
                .append(paymentState, that.paymentState)
                .append(custom, that.custom)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(createdAt, that.createdAt)
                .append(customLineItemId, that.customLineItemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(key)
                .append(quantity)
                .append(type)
                .append(comment)
                .append(shipmentState)
                .append(paymentState)
                .append(custom)
                .append(lastModifiedAt)
                .append(createdAt)
                .append(customLineItemId)
                .toHashCode();
    }

}
