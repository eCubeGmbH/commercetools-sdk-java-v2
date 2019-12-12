package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ReturnPaymentState;
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
public final class StagedOrderSetReturnPaymentStateActionImpl implements StagedOrderSetReturnPaymentStateAction {

   private String action;
   
   private String returnItemId;
   
   private com.commercetools.api.generated.models.order.ReturnPaymentState paymentState;

   @JsonCreator
   StagedOrderSetReturnPaymentStateActionImpl(@JsonProperty("returnItemId") final String returnItemId, @JsonProperty("paymentState") final com.commercetools.api.generated.models.order.ReturnPaymentState paymentState) {
      this.returnItemId = returnItemId;
      this.paymentState = paymentState;
      this.action = "setReturnPaymentState";
   }
   public StagedOrderSetReturnPaymentStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.api.generated.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setReturnItemId(final String returnItemId){
      this.returnItemId = returnItemId;
   }
   
   public void setPaymentState(final com.commercetools.api.generated.models.order.ReturnPaymentState paymentState){
      this.paymentState = paymentState;
   }

}