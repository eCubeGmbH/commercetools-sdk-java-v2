package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.order.OrderUpdateAction;
import com.commercetools.api.generated.models.order.OrderRemoveParcelFromDeliveryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class OrderRemoveParcelFromDeliveryActionBuilder {
   
   
   private String parcelId;
   
   public OrderRemoveParcelFromDeliveryActionBuilder parcelId( final String parcelId) {
      this.parcelId = parcelId;
      return this;
   }
   
   
   public String getParcelId(){
      return this.parcelId;
   }

   public OrderRemoveParcelFromDeliveryAction build() {
       return new OrderRemoveParcelFromDeliveryActionImpl(parcelId);
   }
   
   public static OrderRemoveParcelFromDeliveryActionBuilder of() {
      return new OrderRemoveParcelFromDeliveryActionBuilder();
   }
   
   public static OrderRemoveParcelFromDeliveryActionBuilder of(final OrderRemoveParcelFromDeliveryAction template) {
      OrderRemoveParcelFromDeliveryActionBuilder builder = new OrderRemoveParcelFromDeliveryActionBuilder();
      builder.parcelId = template.getParcelId();
      return builder;
   }
   
}