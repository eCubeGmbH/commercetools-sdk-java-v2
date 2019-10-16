package com.commercetools.api.generated.models.project;

import com.commercetools.api.generated.models.project.ShippingRateInputType;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
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
public final class CartValueTypeImpl implements CartValueType {

   private com.commercetools.api.generated.models.shipping_method.ShippingRateTierType type;

   @JsonCreator
   CartValueTypeImpl() {
      this.type = ShippingRateTierType.findEnumViaJsonName("CartValue").get();
   }
   
   
   
   public com.commercetools.api.generated.models.shipping_method.ShippingRateTierType getType(){
      return this.type;
   }


}