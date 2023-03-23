
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.DiscountCodeInfo;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.Shipping;
import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.cart.ShippingMode;
import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.quote.QuoteReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Order
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Order order = Order.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .shippingMode(ShippingMode.SINGLE)
 *             .plusShipping(shippingBuilder -> shippingBuilder)
 *             .orderState(OrderState.OPEN)
 *             .plusSyncInfo(syncInfoBuilder -> syncInfoBuilder)
 *             .origin(CartOrigin.CUSTOMER)
 *             .plusRefusedGifts(refusedGiftsBuilder -> refusedGiftsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderImpl.class)
public interface Order extends BaseResource, OrderMixin, com.commercetools.api.models.DomainResource<Order>,
        com.commercetools.api.models.Referencable<Order>, com.commercetools.api.models.ResourceIdentifiable<Order>,
        com.commercetools.api.models.Customizable<Order>, com.commercetools.api.models.order.OrderLike<Order> {

    /**
     *  <p>Unique identifier of the Order.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>The current version of the order.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>This field will only be present if it was set for Order Import</p>
     * @return completedAt
     */

    @JsonProperty("completedAt")
    public ZonedDateTime getCompletedAt();

    /**
     *  <p>String that uniquely identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique across a project. Once it's set it cannot be changed.</p>
     * @return orderNumber
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *
     * @return customerId
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *
     * @return customerEmail
     */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
     *  <p>Identifies carts and orders belonging to an anonymous session (the customer has not signed up/in yet).</p>
     * @return anonymousId
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>The Business Unit the Order belongs to.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitKeyReference getBusinessUnit();

    /**
     *
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *
     * @return lineItems
     */
    @NotNull
    @Valid
    @JsonProperty("lineItems")
    public List<LineItem> getLineItems();

    /**
     *
     * @return customLineItems
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItem> getCustomLineItems();

    /**
     *
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
     *  <p>The taxes are calculated based on the shipping address.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    /**
     *  <p>Sum of <code>taxedPrice</code> of ShippingInfo across all Shipping Methods. For <code>Platform</code> TaxMode, it is set automatically only if shipping address is set or Shipping Method is added to the Cart.</p>
     * @return taxedShippingPrice
     */
    @Valid
    @JsonProperty("taxedShippingPrice")
    public TaxedPrice getTaxedShippingPrice();

    /**
     *  <p>Holds all shipping-related information per Shipping Method.</p>
     *  <p>For <code>Multi</code> ShippingMode, it is updated automatically after the Shipping Methods are added.</p>
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();

    /**
     *
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();

    /**
     *  <p>Indicates whether one or multiple Shipping Methods are added to the Cart.</p>
     * @return shippingMode
     */
    @NotNull
    @JsonProperty("shippingMode")
    public ShippingMode getShippingMode();

    /**
     *  <p>Holds all shipping-related information per Shipping Method for <code>Multi</code> ShippingMode.</p>
     *  <p>It is updated automatically after the Shipping Method is added.</p>
     * @return shipping
     */
    @NotNull
    @Valid
    @JsonProperty("shipping")
    public List<Shipping> getShipping();

    /**
     *
     * @return taxMode
     */

    @JsonProperty("taxMode")
    public TaxMode getTaxMode();

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rouding.</p>
     * @return taxRoundingMode
     */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>Set when the customer is set and the customer is a member of a customer group. Used for product variant price selection.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2. Used for product variant price selection.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>One of the four predefined OrderStates.</p>
     * @return orderState
     */
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>This reference can point to a state in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *
     * @return shipmentState
     */

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *
     * @return paymentState
     */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     *  <p>Set if the ShippingMethod is set.</p>
     * @return shippingInfo
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();

    /**
     *
     * @return syncInfo
     */
    @NotNull
    @Valid
    @JsonProperty("syncInfo")
    public List<SyncInfo> getSyncInfo();

    /**
     *
     * @return returnInfo
     */
    @Valid
    @JsonProperty("returnInfo")
    public List<ReturnInfo> getReturnInfo();

    /**
     *  <p>The Purchase Order Number is typically set by the Buyer on a QuoteRequest to track the purchase order during the quote and order flow.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *
     * @return discountCodes
     */
    @Valid
    @JsonProperty("discountCodes")
    public List<DiscountCodeInfo> getDiscountCodes();

    /**
     *  <p>Internal-only field.</p>
     * @return lastMessageSequenceNumber
     */
    @Deprecated
    @JsonProperty("lastMessageSequenceNumber")
    public Long getLastMessageSequenceNumber();

    /**
     *  <p>Set when this order was created from a cart. The cart will have the state <code>Ordered</code>.</p>
     * @return cart
     */
    @Valid
    @JsonProperty("cart")
    public CartReference getCart();

    /**
     *  <p>Set when this order was created from a quote.</p>
     * @return quote
     */
    @Valid
    @JsonProperty("quote")
    public QuoteReference getQuote();

    /**
     *
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *
     * @return paymentInfo
     */
    @Valid
    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo();

    /**
     *
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *
     * @return origin
     */
    @NotNull
    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
     *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with LineItemLevel (horizontally) or UnitPriceLevel (vertically) calculation mode.</p>
     * @return taxCalculationMode
     */

    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @return shippingRateInput
     */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @return itemShippingAddresses
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();

    /**
     *  <p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from this order.</p>
     * @return refusedGifts
     */
    @NotNull
    @Valid
    @JsonProperty("refusedGifts")
    public List<CartDiscountReference> getRefusedGifts();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setCompletedAt(final ZonedDateTime completedAt);

    public void setOrderNumber(final String orderNumber);

    public void setCustomerId(final String customerId);

    public void setCustomerEmail(final String customerEmail);

    public void setAnonymousId(final String anonymousId);

    public void setBusinessUnit(final BusinessUnitKeyReference businessUnit);

    public void setStore(final StoreKeyReference store);

    @JsonIgnore
    public void setLineItems(final LineItem... lineItems);

    public void setLineItems(final List<LineItem> lineItems);

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItem... customLineItems);

    public void setCustomLineItems(final List<CustomLineItem> customLineItems);

    public void setTotalPrice(final TypedMoney totalPrice);

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    public void setTaxedShippingPrice(final TaxedPrice taxedShippingPrice);

    public void setShippingAddress(final Address shippingAddress);

    public void setBillingAddress(final Address billingAddress);

    public void setShippingMode(final ShippingMode shippingMode);

    @JsonIgnore
    public void setShipping(final Shipping... shipping);

    public void setShipping(final List<Shipping> shipping);

    public void setTaxMode(final TaxMode taxMode);

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setCountry(final String country);

    public void setOrderState(final OrderState orderState);

    public void setState(final StateReference state);

    public void setShipmentState(final ShipmentState shipmentState);

    public void setPaymentState(final PaymentState paymentState);

    public void setShippingInfo(final ShippingInfo shippingInfo);

    @JsonIgnore
    public void setSyncInfo(final SyncInfo... syncInfo);

    public void setSyncInfo(final List<SyncInfo> syncInfo);

    @JsonIgnore
    public void setReturnInfo(final ReturnInfo... returnInfo);

    public void setReturnInfo(final List<ReturnInfo> returnInfo);

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    @JsonIgnore
    public void setDiscountCodes(final DiscountCodeInfo... discountCodes);

    public void setDiscountCodes(final List<DiscountCodeInfo> discountCodes);

    @Deprecated
    public void setLastMessageSequenceNumber(final Long lastMessageSequenceNumber);

    public void setCart(final CartReference cart);

    public void setQuote(final QuoteReference quote);

    public void setCustom(final CustomFields custom);

    public void setPaymentInfo(final PaymentInfo paymentInfo);

    public void setLocale(final String locale);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setOrigin(final CartOrigin origin);

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public void setShippingRateInput(final ShippingRateInput shippingRateInput);

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    @JsonIgnore
    public void setRefusedGifts(final CartDiscountReference... refusedGifts);

    public void setRefusedGifts(final List<CartDiscountReference> refusedGifts);

    public static Order of() {
        return new OrderImpl();
    }

    public static Order of(final Order template) {
        OrderImpl instance = new OrderImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setCompletedAt(template.getCompletedAt());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxedShippingPrice(template.getTaxedShippingPrice());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingMode(template.getShippingMode());
        instance.setShipping(template.getShipping());
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCountry(template.getCountry());
        instance.setOrderState(template.getOrderState());
        instance.setState(template.getState());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setSyncInfo(template.getSyncInfo());
        instance.setReturnInfo(template.getReturnInfo());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setDiscountCodes(template.getDiscountCodes());
        instance.setLastMessageSequenceNumber(template.getLastMessageSequenceNumber());
        instance.setCart(template.getCart());
        instance.setQuote(template.getQuote());
        instance.setCustom(template.getCustom());
        instance.setPaymentInfo(template.getPaymentInfo());
        instance.setLocale(template.getLocale());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setOrigin(template.getOrigin());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setRefusedGifts(template.getRefusedGifts());
        return instance;
    }

    public static OrderBuilder builder() {
        return OrderBuilder.of();
    }

    public static OrderBuilder builder(final Order template) {
        return OrderBuilder.of(template);
    }

    default <T> T withOrder(Function<Order, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.ORDER;
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Order> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Order>() {
            @Override
            public String toString() {
                return "TypeReference<Order>";
            }
        };
    }
}
