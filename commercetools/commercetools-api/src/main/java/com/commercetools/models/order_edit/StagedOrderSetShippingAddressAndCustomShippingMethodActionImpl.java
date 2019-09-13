package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.common.Address;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.shipping_method.ShippingRateDraft;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import java.lang.String;
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
public final class StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl implements StagedOrderSetShippingAddressAndCustomShippingMethodAction {

   private java.lang.String action;
   
   private com.commercetools.models.shipping_method.ShippingRateDraft shippingRate;
   
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   private com.commercetools.models.common.Address address;
   
   private java.lang.String shippingMethodName;
   
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

   @JsonCreator
   StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl(@JsonProperty("shippingRate") final com.commercetools.models.shipping_method.ShippingRateDraft shippingRate, @JsonProperty("externalTaxRate") final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate, @JsonProperty("address") final com.commercetools.models.common.Address address, @JsonProperty("shippingMethodName") final java.lang.String shippingMethodName, @JsonProperty("taxCategory") final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.shippingRate = shippingRate;
      this.externalTaxRate = externalTaxRate;
      this.address = address;
      this.shippingMethodName = shippingMethodName;
      this.taxCategory = taxCategory;
      this.action = "setShippingAddressAndCustomShippingMethod";
   }
   public StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.shipping_method.ShippingRateDraft getShippingRate(){
      return this.shippingRate;
   }
   
   
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public com.commercetools.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public java.lang.String getShippingMethodName(){
      return this.shippingMethodName;
   }
   
   
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public void setShippingRate(final com.commercetools.models.shipping_method.ShippingRateDraft shippingRate){
      this.shippingRate = shippingRate;
   }
   
   public void setExternalTaxRate(final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate){
      this.externalTaxRate = externalTaxRate;
   }
   
   public void setAddress(final com.commercetools.models.common.Address address){
      this.address = address;
   }
   
   public void setShippingMethodName(final java.lang.String shippingMethodName){
      this.shippingMethodName = shippingMethodName;
   }
   
   public void setTaxCategory(final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
      this.taxCategory = taxCategory;
   }

}