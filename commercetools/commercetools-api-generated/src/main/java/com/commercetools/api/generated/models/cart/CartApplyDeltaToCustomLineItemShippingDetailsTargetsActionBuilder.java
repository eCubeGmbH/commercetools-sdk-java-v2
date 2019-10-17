package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ItemShippingTarget;
import com.commercetools.api.generated.models.cart.CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder {
   
   
   private String customLineItemId;
   
   
   private java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta;
   
   public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder customLineItemId( final String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder targetsDelta( final java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> targetsDelta) {
      this.targetsDelta = targetsDelta;
      return this;
   }
   
   
   public String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.cart.ItemShippingTarget> getTargetsDelta(){
      return this.targetsDelta;
   }

   public CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction build() {
       return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(customLineItemId, targetsDelta);
   }
   
   public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder of() {
      return new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder();
   }
   
   public static CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder of(final CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction template) {
      CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder builder = new CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.targetsDelta = template.getTargetsDelta();
      return builder;
   }
   
}