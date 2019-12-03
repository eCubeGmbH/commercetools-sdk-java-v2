package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.BooleanSetAttributeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>This type represents an attribute which value is set of boolean values.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = BooleanSetAttributeImpl.class)
public interface BooleanSetAttribute extends Attribute {

   
   @NotNull
   @JsonProperty("value")
   public List<Boolean> getValue();

   public void setValue(final List<Boolean> value);
   
   public static BooleanSetAttributeImpl of(){
      return new BooleanSetAttributeImpl();
   }
   

   public static BooleanSetAttributeImpl of(final BooleanSetAttribute template) {
      BooleanSetAttributeImpl instance = new BooleanSetAttributeImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}