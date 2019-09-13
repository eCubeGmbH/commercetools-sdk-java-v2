package com.commercetools.models.product_type;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.product_type.ProductTypeResourceIdentifierImpl;

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
@JsonDeserialize(as = ProductTypeResourceIdentifierImpl.class)
public interface ProductTypeResourceIdentifier extends ResourceIdentifier {


   
   public static ProductTypeResourceIdentifierImpl of(){
      return new ProductTypeResourceIdentifierImpl();
   }
   

   public static ProductTypeResourceIdentifierImpl of(final ProductTypeResourceIdentifier template) {
      ProductTypeResourceIdentifierImpl instance = new ProductTypeResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}