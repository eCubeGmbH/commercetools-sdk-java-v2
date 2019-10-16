package com.commercetools.api.generated.models.cart_discount;

import com.commercetools.api.generated.models.cart_discount.CartDiscountTarget;
import com.commercetools.api.generated.models.cart_discount.CartDiscountShippingCostTargetImpl;

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
@JsonDeserialize(as = CartDiscountShippingCostTargetImpl.class)
public interface CartDiscountShippingCostTarget extends CartDiscountTarget {


   
   public static CartDiscountShippingCostTargetImpl of(){
      return new CartDiscountShippingCostTargetImpl();
   }
   

   public static CartDiscountShippingCostTargetImpl of(final CartDiscountShippingCostTarget template) {
      CartDiscountShippingCostTargetImpl instance = new CartDiscountShippingCostTargetImpl();
      return instance;
   }

}