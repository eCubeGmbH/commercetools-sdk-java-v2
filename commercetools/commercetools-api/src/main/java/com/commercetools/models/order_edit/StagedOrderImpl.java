package com.commercetools.models.order_edit;

import com.commercetools.models.order.Order;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderImpl implements StagedOrder {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.order.ShipmentState shipmentState;
   
   private java.lang.String country;
   
   private java.lang.String orderNumber;
   
   private com.commercetools.models.common.Money totalPrice;
   
   private com.commercetools.models.cart.ShippingRateInput shippingRateInput;
   
   private com.commercetools.models.cart.TaxedPrice taxedPrice;
   
   private com.commercetools.models.cart.CartOrigin origin;
   
   private com.commercetools.models.cart.ShippingInfo shippingInfo;
   
   private java.lang.String locale;
   
   private com.commercetools.models.cart.CartReference cart;
   
   private com.commercetools.models.cart.InventoryMode inventoryMode;
   
   private com.commercetools.models.order.OrderState orderState;
   
   private java.util.List<com.commercetools.models.order.ReturnInfo> returnInfo;
   
   private java.util.List<com.commercetools.models.cart.LineItem> lineItems;
   
   private java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems;
   
   private java.util.List<com.commercetools.models.common.Address> itemShippingAddresses;
   
   private java.lang.String customerEmail;
   
   private java.lang.String customerId;
   
   private com.commercetools.models.state.StateReference state;
   
   private com.commercetools.models.order.PaymentState paymentState;
   
   private java.lang.String anonymousId;
   
   private java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes;
   
   private java.time.ZonedDateTime completedAt;
   
   private com.commercetools.models.customer_group.CustomerGroupReference customerGroup;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private com.commercetools.models.cart.TaxCalculationMode taxCalculationMode;
   
   private com.commercetools.models.store.StoreKeyReference store;
   
   private java.lang.Long lastMessageSequenceNumber;
   
   private java.util.List<com.commercetools.models.order.SyncInfo> syncInfo;
   
   private com.commercetools.models.cart.RoundingMode taxRoundingMode;
   
   private com.commercetools.models.cart.TaxMode taxMode;
   
   private com.commercetools.models.common.Address shippingAddress;
   
   private com.commercetools.models.common.Address billingAddress;
   
   private com.commercetools.models.order.PaymentInfo paymentInfo;

   @JsonCreator
   StagedOrderImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("shipmentState") final com.commercetools.models.order.ShipmentState shipmentState, @JsonProperty("country") final java.lang.String country, @JsonProperty("orderNumber") final java.lang.String orderNumber, @JsonProperty("totalPrice") final com.commercetools.models.common.Money totalPrice, @JsonProperty("shippingRateInput") final com.commercetools.models.cart.ShippingRateInput shippingRateInput, @JsonProperty("taxedPrice") final com.commercetools.models.cart.TaxedPrice taxedPrice, @JsonProperty("origin") final com.commercetools.models.cart.CartOrigin origin, @JsonProperty("shippingInfo") final com.commercetools.models.cart.ShippingInfo shippingInfo, @JsonProperty("locale") final java.lang.String locale, @JsonProperty("cart") final com.commercetools.models.cart.CartReference cart, @JsonProperty("inventoryMode") final com.commercetools.models.cart.InventoryMode inventoryMode, @JsonProperty("orderState") final com.commercetools.models.order.OrderState orderState, @JsonProperty("returnInfo") final java.util.List<com.commercetools.models.order.ReturnInfo> returnInfo, @JsonProperty("lineItems") final java.util.List<com.commercetools.models.cart.LineItem> lineItems, @JsonProperty("customLineItems") final java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems, @JsonProperty("itemShippingAddresses") final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses, @JsonProperty("customerEmail") final java.lang.String customerEmail, @JsonProperty("customerId") final java.lang.String customerId, @JsonProperty("state") final com.commercetools.models.state.StateReference state, @JsonProperty("paymentState") final com.commercetools.models.order.PaymentState paymentState, @JsonProperty("anonymousId") final java.lang.String anonymousId, @JsonProperty("discountCodes") final java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes, @JsonProperty("completedAt") final java.time.ZonedDateTime completedAt, @JsonProperty("customerGroup") final com.commercetools.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("taxCalculationMode") final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode, @JsonProperty("store") final com.commercetools.models.store.StoreKeyReference store, @JsonProperty("lastMessageSequenceNumber") final java.lang.Long lastMessageSequenceNumber, @JsonProperty("syncInfo") final java.util.List<com.commercetools.models.order.SyncInfo> syncInfo, @JsonProperty("taxRoundingMode") final com.commercetools.models.cart.RoundingMode taxRoundingMode, @JsonProperty("taxMode") final com.commercetools.models.cart.TaxMode taxMode, @JsonProperty("shippingAddress") final com.commercetools.models.common.Address shippingAddress, @JsonProperty("billingAddress") final com.commercetools.models.common.Address billingAddress, @JsonProperty("paymentInfo") final com.commercetools.models.order.PaymentInfo paymentInfo) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.shipmentState = shipmentState;
      this.country = country;
      this.orderNumber = orderNumber;
      this.totalPrice = totalPrice;
      this.shippingRateInput = shippingRateInput;
      this.taxedPrice = taxedPrice;
      this.origin = origin;
      this.shippingInfo = shippingInfo;
      this.locale = locale;
      this.cart = cart;
      this.inventoryMode = inventoryMode;
      this.orderState = orderState;
      this.returnInfo = returnInfo;
      this.lineItems = lineItems;
      this.customLineItems = customLineItems;
      this.itemShippingAddresses = itemShippingAddresses;
      this.customerEmail = customerEmail;
      this.customerId = customerId;
      this.state = state;
      this.paymentState = paymentState;
      this.anonymousId = anonymousId;
      this.discountCodes = discountCodes;
      this.completedAt = completedAt;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.taxCalculationMode = taxCalculationMode;
      this.store = store;
      this.lastMessageSequenceNumber = lastMessageSequenceNumber;
      this.syncInfo = syncInfo;
      this.taxRoundingMode = taxRoundingMode;
      this.taxMode = taxMode;
      this.shippingAddress = shippingAddress;
      this.billingAddress = billingAddress;
      this.paymentInfo = paymentInfo;
   }
   public StagedOrderImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.order.ShipmentState getShipmentState(){
      return this.shipmentState;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.lang.String getOrderNumber(){
      return this.orderNumber;
   }
   
   
   public com.commercetools.models.common.Money getTotalPrice(){
      return this.totalPrice;
   }
   
   
   public com.commercetools.models.cart.ShippingRateInput getShippingRateInput(){
      return this.shippingRateInput;
   }
   
   
   public com.commercetools.models.cart.TaxedPrice getTaxedPrice(){
      return this.taxedPrice;
   }
   
   
   public com.commercetools.models.cart.CartOrigin getOrigin(){
      return this.origin;
   }
   
   
   public com.commercetools.models.cart.ShippingInfo getShippingInfo(){
      return this.shippingInfo;
   }
   
   
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   
   public com.commercetools.models.cart.CartReference getCart(){
      return this.cart;
   }
   
   
   public com.commercetools.models.cart.InventoryMode getInventoryMode(){
      return this.inventoryMode;
   }
   
   
   public com.commercetools.models.order.OrderState getOrderState(){
      return this.orderState;
   }
   
   
   public java.util.List<com.commercetools.models.order.ReturnInfo> getReturnInfo(){
      return this.returnInfo;
   }
   
   
   public java.util.List<com.commercetools.models.cart.LineItem> getLineItems(){
      return this.lineItems;
   }
   
   
   public java.util.List<com.commercetools.models.cart.CustomLineItem> getCustomLineItems(){
      return this.customLineItems;
   }
   
   
   public java.util.List<com.commercetools.models.common.Address> getItemShippingAddresses(){
      return this.itemShippingAddresses;
   }
   
   
   public java.lang.String getCustomerEmail(){
      return this.customerEmail;
   }
   
   
   public java.lang.String getCustomerId(){
      return this.customerId;
   }
   
   
   public com.commercetools.models.state.StateReference getState(){
      return this.state;
   }
   
   
   public com.commercetools.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }
   
   
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }
   
   
   public java.util.List<com.commercetools.models.cart.DiscountCodeInfo> getDiscountCodes(){
      return this.discountCodes;
   }
   
   
   public java.time.ZonedDateTime getCompletedAt(){
      return this.completedAt;
   }
   
   
   public com.commercetools.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public com.commercetools.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }
   
   
   public com.commercetools.models.store.StoreKeyReference getStore(){
      return this.store;
   }
   
   
   public java.lang.Long getLastMessageSequenceNumber(){
      return this.lastMessageSequenceNumber;
   }
   
   
   public java.util.List<com.commercetools.models.order.SyncInfo> getSyncInfo(){
      return this.syncInfo;
   }
   
   
   public com.commercetools.models.cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }
   
   
   public com.commercetools.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }
   
   
   public com.commercetools.models.common.Address getShippingAddress(){
      return this.shippingAddress;
   }
   
   
   public com.commercetools.models.common.Address getBillingAddress(){
      return this.billingAddress;
   }
   
   
   public com.commercetools.models.order.PaymentInfo getPaymentInfo(){
      return this.paymentInfo;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setShipmentState(final com.commercetools.models.order.ShipmentState shipmentState){
      this.shipmentState = shipmentState;
   }
   
   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setOrderNumber(final java.lang.String orderNumber){
      this.orderNumber = orderNumber;
   }
   
   public void setTotalPrice(final com.commercetools.models.common.Money totalPrice){
      this.totalPrice = totalPrice;
   }
   
   public void setShippingRateInput(final com.commercetools.models.cart.ShippingRateInput shippingRateInput){
      this.shippingRateInput = shippingRateInput;
   }
   
   public void setTaxedPrice(final com.commercetools.models.cart.TaxedPrice taxedPrice){
      this.taxedPrice = taxedPrice;
   }
   
   public void setOrigin(final com.commercetools.models.cart.CartOrigin origin){
      this.origin = origin;
   }
   
   public void setShippingInfo(final com.commercetools.models.cart.ShippingInfo shippingInfo){
      this.shippingInfo = shippingInfo;
   }
   
   public void setLocale(final java.lang.String locale){
      this.locale = locale;
   }
   
   public void setCart(final com.commercetools.models.cart.CartReference cart){
      this.cart = cart;
   }
   
   public void setInventoryMode(final com.commercetools.models.cart.InventoryMode inventoryMode){
      this.inventoryMode = inventoryMode;
   }
   
   public void setOrderState(final com.commercetools.models.order.OrderState orderState){
      this.orderState = orderState;
   }
   
   public void setReturnInfo(final java.util.List<com.commercetools.models.order.ReturnInfo> returnInfo){
      this.returnInfo = returnInfo;
   }
   
   public void setLineItems(final java.util.List<com.commercetools.models.cart.LineItem> lineItems){
      this.lineItems = lineItems;
   }
   
   public void setCustomLineItems(final java.util.List<com.commercetools.models.cart.CustomLineItem> customLineItems){
      this.customLineItems = customLineItems;
   }
   
   public void setItemShippingAddresses(final java.util.List<com.commercetools.models.common.Address> itemShippingAddresses){
      this.itemShippingAddresses = itemShippingAddresses;
   }
   
   public void setCustomerEmail(final java.lang.String customerEmail){
      this.customerEmail = customerEmail;
   }
   
   public void setCustomerId(final java.lang.String customerId){
      this.customerId = customerId;
   }
   
   public void setState(final com.commercetools.models.state.StateReference state){
      this.state = state;
   }
   
   public void setPaymentState(final com.commercetools.models.order.PaymentState paymentState){
      this.paymentState = paymentState;
   }
   
   public void setAnonymousId(final java.lang.String anonymousId){
      this.anonymousId = anonymousId;
   }
   
   public void setDiscountCodes(final java.util.List<com.commercetools.models.cart.DiscountCodeInfo> discountCodes){
      this.discountCodes = discountCodes;
   }
   
   public void setCompletedAt(final java.time.ZonedDateTime completedAt){
      this.completedAt = completedAt;
   }
   
   public void setCustomerGroup(final com.commercetools.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setTaxCalculationMode(final com.commercetools.models.cart.TaxCalculationMode taxCalculationMode){
      this.taxCalculationMode = taxCalculationMode;
   }
   
   public void setStore(final com.commercetools.models.store.StoreKeyReference store){
      this.store = store;
   }
   
   public void setLastMessageSequenceNumber(final java.lang.Long lastMessageSequenceNumber){
      this.lastMessageSequenceNumber = lastMessageSequenceNumber;
   }
   
   public void setSyncInfo(final java.util.List<com.commercetools.models.order.SyncInfo> syncInfo){
      this.syncInfo = syncInfo;
   }
   
   public void setTaxRoundingMode(final com.commercetools.models.cart.RoundingMode taxRoundingMode){
      this.taxRoundingMode = taxRoundingMode;
   }
   
   public void setTaxMode(final com.commercetools.models.cart.TaxMode taxMode){
      this.taxMode = taxMode;
   }
   
   public void setShippingAddress(final com.commercetools.models.common.Address shippingAddress){
      this.shippingAddress = shippingAddress;
   }
   
   public void setBillingAddress(final com.commercetools.models.common.Address billingAddress){
      this.billingAddress = billingAddress;
   }
   
   public void setPaymentInfo(final com.commercetools.models.order.PaymentInfo paymentInfo){
      this.paymentInfo = paymentInfo;
   }

}