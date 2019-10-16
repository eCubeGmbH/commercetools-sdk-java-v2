package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountValueDraft;
import com.commercetools.api.generated.models.cart_discount.CartDiscountValueRelativeDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountValueRelativeDraftBuilder {
   
   
   private Long permyriad;
   
   public CartDiscountValueRelativeDraftBuilder permyriad( final Long permyriad) {
      this.permyriad = permyriad;
      return this;
   }
   
   
   public Long getPermyriad(){
      return this.permyriad;
   }

   public CartDiscountValueRelativeDraft build() {
       return new CartDiscountValueRelativeDraftImpl(permyriad);
   }
   
   public static CartDiscountValueRelativeDraftBuilder of() {
      return new CartDiscountValueRelativeDraftBuilder();
   }
   
   public static CartDiscountValueRelativeDraftBuilder of(final CartDiscountValueRelativeDraft template) {
      CartDiscountValueRelativeDraftBuilder builder = new CartDiscountValueRelativeDraftBuilder();
      builder.permyriad = template.getPermyriad();
      return builder;
   }
   
}