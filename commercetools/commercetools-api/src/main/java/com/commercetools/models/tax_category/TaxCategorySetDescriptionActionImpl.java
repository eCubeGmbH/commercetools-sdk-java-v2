package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.TaxCategoryUpdateAction;
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
public final class TaxCategorySetDescriptionActionImpl implements TaxCategorySetDescriptionAction {

   private java.lang.String action;
   
   private java.lang.String description;

   @JsonCreator
   TaxCategorySetDescriptionActionImpl(@JsonProperty("description") final java.lang.String description) {
      this.description = description;
      this.action = "setDescription";
   }
   public TaxCategorySetDescriptionActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getDescription(){
      return this.description;
   }

   public void setDescription(final java.lang.String description){
      this.description = description;
   }

}