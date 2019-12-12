package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.order.DeliveryItem;
import com.commercetools.api.generated.models.order.ParcelDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderAddDeliveryActionImpl implements StagedOrderAddDeliveryAction {

   private String action;
   
   private com.commercetools.api.generated.models.common.Address address;
   
   private java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items;
   
   private java.util.List<com.commercetools.api.generated.models.order.ParcelDraft> parcels;

   @JsonCreator
   StagedOrderAddDeliveryActionImpl(@JsonProperty("address") final com.commercetools.api.generated.models.common.Address address, @JsonProperty("items") final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items, @JsonProperty("parcels") final java.util.List<com.commercetools.api.generated.models.order.ParcelDraft> parcels) {
      this.address = address;
      this.items = items;
      this.parcels = parcels;
      this.action = "addDelivery";
   }
   public StagedOrderAddDeliveryActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.common.Address getAddress(){
      return this.address;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> getItems(){
      return this.items;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ParcelDraft> getParcels(){
      return this.parcels;
   }

   public void setAddress(final com.commercetools.api.generated.models.common.Address address){
      this.address = address;
   }
   
   public void setItems(final java.util.List<com.commercetools.api.generated.models.order.DeliveryItem> items){
      this.items = items;
   }
   
   public void setParcels(final java.util.List<com.commercetools.api.generated.models.order.ParcelDraft> parcels){
      this.parcels = parcels;
   }

}