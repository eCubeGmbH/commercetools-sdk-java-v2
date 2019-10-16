package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.generated.models.cart_discount.CartDiscountSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public CartDiscountSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public CartDiscountSetKeyAction build() {
       return new CartDiscountSetKeyActionImpl(key);
   }
   
   public static CartDiscountSetKeyActionBuilder of() {
      return new CartDiscountSetKeyActionBuilder();
   }
   
   public static CartDiscountSetKeyActionBuilder of(final CartDiscountSetKeyAction template) {
      CartDiscountSetKeyActionBuilder builder = new CartDiscountSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}