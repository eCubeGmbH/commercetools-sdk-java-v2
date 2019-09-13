package com.commercetools.models.discount_code;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.discount_code.DiscountCodeResourceIdentifierImpl;

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
@JsonDeserialize(as = DiscountCodeResourceIdentifierImpl.class)
public interface DiscountCodeResourceIdentifier extends ResourceIdentifier {


   
   public static DiscountCodeResourceIdentifierImpl of(){
      return new DiscountCodeResourceIdentifierImpl();
   }
   

   public static DiscountCodeResourceIdentifierImpl of(final DiscountCodeResourceIdentifier template) {
      DiscountCodeResourceIdentifierImpl instance = new DiscountCodeResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}