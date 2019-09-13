package com.commercetools.models.order_edit;

import com.commercetools.models.order.ReturnPaymentState;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetReturnPaymentStateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetReturnPaymentStateActionBuilder {
   
   
   private java.lang.String returnItemId;
   
   
   private com.commercetools.models.order.ReturnPaymentState paymentState;
   
   public StagedOrderSetReturnPaymentStateActionBuilder returnItemId( final java.lang.String returnItemId) {
      this.returnItemId = returnItemId;
      return this;
   }
   
   public StagedOrderSetReturnPaymentStateActionBuilder paymentState( final com.commercetools.models.order.ReturnPaymentState paymentState) {
      this.paymentState = paymentState;
      return this;
   }
   
   
   public java.lang.String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }

   public StagedOrderSetReturnPaymentStateAction build() {
       return new StagedOrderSetReturnPaymentStateActionImpl(returnItemId, paymentState);
   }
   
   public static StagedOrderSetReturnPaymentStateActionBuilder of() {
      return new StagedOrderSetReturnPaymentStateActionBuilder();
   }
   
   public static StagedOrderSetReturnPaymentStateActionBuilder of(final StagedOrderSetReturnPaymentStateAction template) {
      StagedOrderSetReturnPaymentStateActionBuilder builder = new StagedOrderSetReturnPaymentStateActionBuilder();
      builder.returnItemId = template.getReturnItemId();
      builder.paymentState = template.getPaymentState();
      return builder;
   }
   
}