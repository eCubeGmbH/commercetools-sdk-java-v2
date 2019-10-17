package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue;
import com.commercetools.api.generated.models.type.TypeUpdateAction;
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
public final class TypeChangeLocalizedEnumValueLabelActionImpl implements TypeChangeLocalizedEnumValueLabelAction {

   private String action;
   
   private String fieldName;
   
   private com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue value;

   @JsonCreator
   TypeChangeLocalizedEnumValueLabelActionImpl(@JsonProperty("fieldName") final String fieldName, @JsonProperty("value") final com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue value) {
      this.fieldName = fieldName;
      this.value = value;
      this.action = "changeLocalizedEnumValueLabel";
   }
   public TypeChangeLocalizedEnumValueLabelActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue getValue(){
      return this.value;
   }

   public void setFieldName(final String fieldName){
      this.fieldName = fieldName;
   }
   
   public void setValue(final com.commercetools.api.generated.models.type.CustomFieldLocalizedEnumValue value){
      this.value = value;
   }

}