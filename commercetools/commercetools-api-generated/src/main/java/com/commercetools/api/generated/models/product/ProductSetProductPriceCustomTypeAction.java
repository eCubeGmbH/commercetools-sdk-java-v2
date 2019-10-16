package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductSetProductPriceCustomTypeActionImpl;

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
@JsonDeserialize(as = ProductSetProductPriceCustomTypeActionImpl.class)
public interface ProductSetProductPriceCustomTypeAction extends ProductUpdateAction {

   
   @NotNull
   @JsonProperty("priceId")
   public String getPriceId();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();
   
   @Valid
   @JsonProperty("type")
   public TypeResourceIdentifier getType();
   
   @Valid
   @JsonProperty("fields")
   public FieldContainer getFields();

   public void setPriceId(final String priceId);
   
   public void setStaged(final Boolean staged);
   
   public void setType(final TypeResourceIdentifier type);
   
   public void setFields(final FieldContainer fields);
   
   public static ProductSetProductPriceCustomTypeActionImpl of(){
      return new ProductSetProductPriceCustomTypeActionImpl();
   }
   

   public static ProductSetProductPriceCustomTypeActionImpl of(final ProductSetProductPriceCustomTypeAction template) {
      ProductSetProductPriceCustomTypeActionImpl instance = new ProductSetProductPriceCustomTypeActionImpl();
      instance.setStaged(template.getStaged());
      instance.setFields(template.getFields());
      instance.setType(template.getType());
      instance.setPriceId(template.getPriceId());
      return instance;
   }

}