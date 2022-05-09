
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategoryCreatedMessageImpl.class, name = CategoryCreatedMessage.CATEGORY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategorySlugChangedMessageImpl.class, name = CategorySlugChangedMessage.CATEGORY_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomLineItemStateTransitionMessageImpl.class, name = CustomLineItemStateTransitionMessage.CUSTOM_LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressAddedMessageImpl.class, name = CustomerAddressAddedMessage.CUSTOMER_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressChangedMessageImpl.class, name = CustomerAddressChangedMessage.CUSTOMER_ADDRESS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressRemovedMessageImpl.class, name = CustomerAddressRemovedMessage.CUSTOMER_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCompanyNameSetMessageImpl.class, name = CustomerCompanyNameSetMessage.CUSTOMER_COMPANY_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCreatedMessageImpl.class, name = CustomerCreatedMessage.CUSTOMER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDateOfBirthSetMessageImpl.class, name = CustomerDateOfBirthSetMessage.CUSTOMER_DATE_OF_BIRTH_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDeletedMessageImpl.class, name = CustomerDeletedMessage.CUSTOMER_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailChangedMessageImpl.class, name = CustomerEmailChangedMessage.CUSTOMER_EMAIL_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailVerifiedMessageImpl.class, name = CustomerEmailVerifiedMessage.CUSTOMER_EMAIL_VERIFIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerFirstNameSetMessageImpl.class, name = CustomerFirstNameSetMessage.CUSTOMER_FIRST_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupSetMessageImpl.class, name = CustomerGroupSetMessage.CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerLastNameSetMessageImpl.class, name = CustomerLastNameSetMessage.CUSTOMER_LAST_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerPasswordUpdatedMessageImpl.class, name = CustomerPasswordUpdatedMessage.CUSTOMER_PASSWORD_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerTitleSetMessageImpl.class, name = CustomerTitleSetMessage.CUSTOMER_TITLE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddedMessageImpl.class, name = DeliveryAddedMessage.DELIVERY_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddressSetMessageImpl.class, name = DeliveryAddressSetMessage.DELIVERY_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryItemsUpdatedMessageImpl.class, name = DeliveryItemsUpdatedMessage.DELIVERY_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryRemovedMessageImpl.class, name = DeliveryRemovedMessage.DELIVERY_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryCreatedMessageImpl.class, name = InventoryEntryCreatedMessage.INVENTORY_ENTRY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryDeletedMessageImpl.class, name = InventoryEntryDeletedMessage.INVENTORY_ENTRY_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryQuantitySetMessageImpl.class, name = InventoryEntryQuantitySetMessage.INVENTORY_ENTRY_QUANTITY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.LineItemStateTransitionMessageImpl.class, name = LineItemStateTransitionMessage.LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderBillingAddressSetMessageImpl.class, name = OrderBillingAddressSetMessage.ORDER_BILLING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCreatedMessageImpl.class, name = OrderCreatedMessage.ORDER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageImpl.class, name = OrderCustomLineItemDiscountSetMessage.ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerEmailSetMessageImpl.class, name = OrderCustomerEmailSetMessage.ORDER_CUSTOMER_EMAIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerGroupSetMessageImpl.class, name = OrderCustomerGroupSetMessage.ORDER_CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerSetMessageImpl.class, name = OrderCustomerSetMessage.ORDER_CUSTOMER_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDeletedMessageImpl.class, name = OrderDeletedMessage.ORDER_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeAddedMessageImpl.class, name = OrderDiscountCodeAddedMessage.ORDER_DISCOUNT_CODE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageImpl.class, name = OrderDiscountCodeRemovedMessage.ORDER_DISCOUNT_CODE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageImpl.class, name = OrderDiscountCodeStateSetMessage.ORDER_DISCOUNT_CODE_STATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderEditAppliedMessageImpl.class, name = OrderEditAppliedMessage.ORDER_EDIT_APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderImportedMessageImpl.class, name = OrderImportedMessage.ORDER_IMPORTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemAddedMessageImpl.class, name = OrderLineItemAddedMessage.ORDER_LINE_ITEM_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDiscountSetMessageImpl.class, name = OrderLineItemDiscountSetMessage.ORDER_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageImpl.class, name = OrderLineItemDistributionChannelSetMessage.ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemRemovedMessageImpl.class, name = OrderLineItemRemovedMessage.ORDER_LINE_ITEM_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentAddedMessageImpl.class, name = OrderPaymentAddedMessage.ORDER_PAYMENT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentStateChangedMessageImpl.class, name = OrderPaymentStateChangedMessage.ORDER_PAYMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnInfoAddedMessageImpl.class, name = OrderReturnInfoAddedMessage.RETURN_INFO_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnInfoSetMessageImpl.class, name = OrderReturnInfoSetMessage.RETURN_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageImpl.class, name = OrderReturnShipmentStateChangedMessage.ORDER_RETURN_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShipmentStateChangedMessageImpl.class, name = OrderShipmentStateChangedMessage.ORDER_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingAddressSetMessageImpl.class, name = OrderShippingAddressSetMessage.ORDER_SHIPPING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingInfoSetMessageImpl.class, name = OrderShippingInfoSetMessage.ORDER_SHIPPING_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingRateInputSetMessageImpl.class, name = OrderShippingRateInputSetMessage.ORDER_SHIPPING_RATE_INPUT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateChangedMessageImpl.class, name = OrderStateChangedMessage.ORDER_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateTransitionMessageImpl.class, name = OrderStateTransitionMessage.ORDER_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStoreSetMessageImpl.class, name = OrderStoreSetMessage.ORDER_STORE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelAddedToDeliveryMessageImpl.class, name = ParcelAddedToDeliveryMessage.PARCEL_ADDED_TO_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelItemsUpdatedMessageImpl.class, name = ParcelItemsUpdatedMessage.PARCEL_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageImpl.class, name = ParcelMeasurementsUpdatedMessage.PARCEL_MEASUREMENTS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageImpl.class, name = ParcelRemovedFromDeliveryMessage.PARCEL_REMOVED_FROM_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageImpl.class, name = ParcelTrackingDataUpdatedMessage.PARCEL_TRACKING_DATA_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentCreatedMessageImpl.class, name = PaymentCreatedMessage.PAYMENT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentInteractionAddedMessageImpl.class, name = PaymentInteractionAddedMessage.PAYMENT_INTERACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageImpl.class, name = PaymentStatusInterfaceCodeSetMessage.PAYMENT_STATUS_INTERFACE_CODE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusStateTransitionMessageImpl.class, name = PaymentStatusStateTransitionMessage.PAYMENT_STATUS_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionAddedMessageImpl.class, name = PaymentTransactionAddedMessage.PAYMENT_TRANSACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionStateChangedMessageImpl.class, name = PaymentTransactionStateChangedMessage.PAYMENT_TRANSACTION_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductAddedToCategoryMessageImpl.class, name = ProductAddedToCategoryMessage.PRODUCT_ADDED_TO_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductCreatedMessageImpl.class, name = ProductCreatedMessage.PRODUCT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductDeletedMessageImpl.class, name = ProductDeletedMessage.PRODUCT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductImageAddedMessageImpl.class, name = ProductImageAddedMessage.PRODUCT_IMAGE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceDiscountsSetMessageImpl.class, name = ProductPriceDiscountsSetMessage.PRODUCT_PRICE_DISCOUNTS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageImpl.class, name = ProductPriceExternalDiscountSetMessage.PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPublishedMessageImpl.class, name = ProductPublishedMessage.PRODUCT_PUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRemovedFromCategoryMessageImpl.class, name = ProductRemovedFromCategoryMessage.PRODUCT_REMOVED_FROM_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRevertedStagedChangesMessageImpl.class, name = ProductRevertedStagedChangesMessage.PRODUCT_REVERTED_STAGED_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionCreatedMessageImpl.class, name = ProductSelectionCreatedMessage.PRODUCT_SELECTION_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionDeletedMessageImpl.class, name = ProductSelectionDeletedMessage.PRODUCT_SELECTION_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductAddedMessageImpl.class, name = ProductSelectionProductAddedMessage.PRODUCT_SELECTION_PRODUCT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductRemovedMessageImpl.class, name = ProductSelectionProductRemovedMessage.PRODUCT_SELECTION_PRODUCT_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSlugChangedMessageImpl.class, name = ProductSlugChangedMessage.PRODUCT_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductStateTransitionMessageImpl.class, name = ProductStateTransitionMessage.PRODUCT_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductUnpublishedMessageImpl.class, name = ProductUnpublishedMessage.PRODUCT_UNPUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantAddedMessageImpl.class, name = ProductVariantAddedMessage.PRODUCT_VARIANT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantDeletedMessageImpl.class, name = ProductVariantDeletedMessage.PRODUCT_VARIANT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewCreatedMessageImpl.class, name = ReviewCreatedMessage.REVIEW_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewRatingSetMessageImpl.class, name = ReviewRatingSetMessage.REVIEW_RATING_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewStateTransitionMessageImpl.class, name = ReviewStateTransitionMessage.REVIEW_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreCreatedMessageImpl.class, name = StoreCreatedMessage.STORE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreDeletedMessageImpl.class, name = StoreDeletedMessage.STORE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreProductSelectionsChangedMessageImpl.class, name = StoreProductSelectionsChangedMessage.STORE_PRODUCT_SELECTIONS_CHANGED) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = MessageImpl.class, visible = true)
@JsonDeserialize(as = MessageImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Message extends BaseResource, com.commercetools.api.models.DomainResource<Message> {

    /**
    *  <p>Platform-generated unique identifier of the Message.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    @NotNull
    @JsonProperty("sequenceNumber")
    public Long getSequenceNumber();

    /**
    *  <p>A Reference represents a loose reference to another resource in the same commercetools Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like <a href="ctp:api:type:ChannelReference">ChannelReference</a>.  A referenced resource can be embedded through <a href="/general-concepts#reference-expansion">Reference Expansion</a>. The expanded reference is the value of an additional <code>obj</code> field then.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    @NotNull
    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @Valid
    @JsonProperty("resourceUserProvidedIdentifiers")
    public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setSequenceNumber(final Long sequenceNumber);

    public void setResource(final Reference resource);

    public void setResourceVersion(final Long resourceVersion);

    public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);

    public static com.commercetools.api.models.message.CategoryCreatedMessageBuilder categoryCreatedBuilder() {
        return com.commercetools.api.models.message.CategoryCreatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CategorySlugChangedMessageBuilder categorySlugChangedBuilder() {
        return com.commercetools.api.models.message.CategorySlugChangedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder customLineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder customerAddressAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder customerAddressChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder customerAddressRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder customerCompanyNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerCreatedMessageBuilder customerCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerCreatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder customerDateOfBirthSetBuilder() {
        return com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerDeletedMessageBuilder customerDeletedBuilder() {
        return com.commercetools.api.models.message.CustomerDeletedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder customerEmailChangedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder customerEmailVerifiedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder customerFirstNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerGroupSetMessageBuilder customerGroupSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder customerLastNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder customerPasswordUpdatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerTitleSetMessageBuilder customerTitleSetBuilder() {
        return com.commercetools.api.models.message.CustomerTitleSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.DeliveryAddedMessageBuilder deliveryAddedBuilder() {
        return com.commercetools.api.models.message.DeliveryAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder deliveryAddressSetBuilder() {
        return com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder deliveryItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.DeliveryRemovedMessageBuilder deliveryRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryRemovedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder inventoryEntryCreatedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder inventoryEntryDeletedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder inventoryEntryQuantitySetBuilder() {
        return com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder lineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder orderBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCreatedMessageBuilder orderCreatedBuilder() {
        return com.commercetools.api.models.message.OrderCreatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder orderCustomLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder orderCustomerEmailSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder orderCustomerGroupSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomerSetMessageBuilder orderCustomerSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderDeletedMessageBuilder orderDeletedBuilder() {
        return com.commercetools.api.models.message.OrderDeletedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder orderDiscountCodeAddedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder orderDiscountCodeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder orderDiscountCodeStateSetBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderEditAppliedMessageBuilder orderEditAppliedBuilder() {
        return com.commercetools.api.models.message.OrderEditAppliedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderImportedMessageBuilder orderImportedBuilder() {
        return com.commercetools.api.models.message.OrderImportedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder orderLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder orderLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder orderLineItemDistributionChannelSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder orderLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder orderPaymentAddedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder orderPaymentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderReturnInfoAddedMessageBuilder returnInfoAddedBuilder() {
        return com.commercetools.api.models.message.OrderReturnInfoAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderReturnInfoSetMessageBuilder returnInfoSetBuilder() {
        return com.commercetools.api.models.message.OrderReturnInfoSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder orderReturnShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder orderShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder orderShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder orderShippingInfoSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder orderShippingRateInputSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderStateChangedMessageBuilder orderStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderStateChangedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderStateTransitionMessageBuilder orderStateTransitionBuilder() {
        return com.commercetools.api.models.message.OrderStateTransitionMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderStoreSetMessageBuilder orderStoreSetBuilder() {
        return com.commercetools.api.models.message.OrderStoreSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder parcelAddedToDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder parcelItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder parcelMeasurementsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder parcelRemovedFromDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder parcelTrackingDataUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentCreatedMessageBuilder paymentCreatedBuilder() {
        return com.commercetools.api.models.message.PaymentCreatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder paymentInteractionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder paymentStatusInterfaceCodeSetBuilder() {
        return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder paymentStatusStateTransitionBuilder() {
        return com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder paymentTransactionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder paymentTransactionStateChangedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder productAddedToCategoryBuilder() {
        return com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductCreatedMessageBuilder productCreatedBuilder() {
        return com.commercetools.api.models.message.ProductCreatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductDeletedMessageBuilder productDeletedBuilder() {
        return com.commercetools.api.models.message.ProductDeletedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductImageAddedMessageBuilder productImageAddedBuilder() {
        return com.commercetools.api.models.message.ProductImageAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder productPriceDiscountsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder productPriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPublishedMessageBuilder productPublishedBuilder() {
        return com.commercetools.api.models.message.ProductPublishedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder productRemovedFromCategoryBuilder() {
        return com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder productRevertedStagedChangesBuilder() {
        return com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder productSelectionCreatedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder productSelectionDeletedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder productSelectionProductAddedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder productSelectionProductRemovedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSlugChangedMessageBuilder productSlugChangedBuilder() {
        return com.commercetools.api.models.message.ProductSlugChangedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductStateTransitionMessageBuilder productStateTransitionBuilder() {
        return com.commercetools.api.models.message.ProductStateTransitionMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductUnpublishedMessageBuilder productUnpublishedBuilder() {
        return com.commercetools.api.models.message.ProductUnpublishedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductVariantAddedMessageBuilder productVariantAddedBuilder() {
        return com.commercetools.api.models.message.ProductVariantAddedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder productVariantDeletedBuilder() {
        return com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ReviewCreatedMessageBuilder reviewCreatedBuilder() {
        return com.commercetools.api.models.message.ReviewCreatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ReviewRatingSetMessageBuilder reviewRatingSetBuilder() {
        return com.commercetools.api.models.message.ReviewRatingSetMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder reviewStateTransitionBuilder() {
        return com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreCreatedMessageBuilder storeCreatedBuilder() {
        return com.commercetools.api.models.message.StoreCreatedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreDeletedMessageBuilder storeDeletedBuilder() {
        return com.commercetools.api.models.message.StoreDeletedMessageBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder storeProductSelectionsChangedBuilder() {
        return com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder.of();
    }

    default <T> T withMessage(Function<Message, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Message> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Message>() {
            @Override
            public String toString() {
                return "TypeReference<Message>";
            }
        };
    }
}
