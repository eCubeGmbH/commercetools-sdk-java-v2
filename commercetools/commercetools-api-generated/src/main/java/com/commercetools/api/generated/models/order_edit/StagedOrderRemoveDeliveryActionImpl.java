package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderRemoveDeliveryActionImpl implements StagedOrderRemoveDeliveryAction {

   private String action;
   
   private String deliveryId;

   @JsonCreator
   StagedOrderRemoveDeliveryActionImpl(@JsonProperty("deliveryId") final String deliveryId) {
      this.deliveryId = deliveryId;
      this.action = "removeDelivery";
   }
   public StagedOrderRemoveDeliveryActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getDeliveryId(){
      return this.deliveryId;
   }

   public void setDeliveryId(final String deliveryId){
      this.deliveryId = deliveryId;
   }

}