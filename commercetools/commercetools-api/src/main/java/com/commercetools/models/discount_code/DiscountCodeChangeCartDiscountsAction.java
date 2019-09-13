package com.commercetools.models.discount_code;

import com.commercetools.models.cart_discount.CartDiscountResourceIdentifier;
import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import java.lang.String;
import com.commercetools.models.discount_code.DiscountCodeChangeCartDiscountsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = DiscountCodeChangeCartDiscountsActionImpl.class)
public interface DiscountCodeChangeCartDiscountsAction extends DiscountCodeUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("cartDiscounts")
   public List<CartDiscountResourceIdentifier> getCartDiscounts();

   public void setCartDiscounts(final List<CartDiscountResourceIdentifier> cartDiscounts);
   
   public static DiscountCodeChangeCartDiscountsActionImpl of(){
      return new DiscountCodeChangeCartDiscountsActionImpl();
   }
   

   public static DiscountCodeChangeCartDiscountsActionImpl of(final DiscountCodeChangeCartDiscountsAction template) {
      DiscountCodeChangeCartDiscountsActionImpl instance = new DiscountCodeChangeCartDiscountsActionImpl();
      instance.setCartDiscounts(template.getCartDiscounts());
      return instance;
   }

}