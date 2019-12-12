package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
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
public final class MyCartSetLineItemShippingDetailsActionImpl implements MyCartSetLineItemShippingDetailsAction {

   private String action;
   
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private String lineItemId;

   @JsonCreator
   MyCartSetLineItemShippingDetailsActionImpl(@JsonProperty("shippingDetails") final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("lineItemId") final String lineItemId) {
      this.shippingDetails = shippingDetails;
      this.lineItemId = lineItemId;
      this.action = "setLineItemShippingDetails";
   }
   public MyCartSetLineItemShippingDetailsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }

   public void setShippingDetails(final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }

}