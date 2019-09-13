package com.commercetools.models.discount_code;

import com.commercetools.models.common.Reference;
import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.discount_code.DiscountCode;
import com.commercetools.models.discount_code.DiscountCodeReferenceImpl;

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
@JsonDeserialize(as = DiscountCodeReferenceImpl.class)
public interface DiscountCodeReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public DiscountCode getObj();

   public void setObj(final DiscountCode obj);
   
   public static DiscountCodeReferenceImpl of(){
      return new DiscountCodeReferenceImpl();
   }
   

   public static DiscountCodeReferenceImpl of(final DiscountCodeReference template) {
      DiscountCodeReferenceImpl instance = new DiscountCodeReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}