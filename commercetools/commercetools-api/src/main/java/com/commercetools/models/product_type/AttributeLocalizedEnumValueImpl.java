package com.commercetools.models.product_type;

import com.commercetools.models.common.LocalizedString;
import java.lang.String;
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
public final class AttributeLocalizedEnumValueImpl implements AttributeLocalizedEnumValue {

   private com.commercetools.models.common.LocalizedString label;
   
   private java.lang.String key;

   @JsonCreator
   AttributeLocalizedEnumValueImpl(@JsonProperty("label") final com.commercetools.models.common.LocalizedString label, @JsonProperty("key") final java.lang.String key) {
      this.label = label;
      this.key = key;
   }
   public AttributeLocalizedEnumValueImpl() {
      
   }
   
   
   public com.commercetools.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setLabel(final com.commercetools.models.common.LocalizedString label){
      this.label = label;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}