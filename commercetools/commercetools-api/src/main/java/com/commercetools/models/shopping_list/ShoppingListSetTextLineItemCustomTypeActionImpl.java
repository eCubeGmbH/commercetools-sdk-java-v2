package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
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
public final class ShoppingListSetTextLineItemCustomTypeActionImpl implements ShoppingListSetTextLineItemCustomTypeAction {

   private java.lang.String action;
   
   private com.commercetools.models.type.FieldContainer fields;
   
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   private java.lang.String textLineItemId;

   @JsonCreator
   ShoppingListSetTextLineItemCustomTypeActionImpl(@JsonProperty("fields") final com.commercetools.models.type.FieldContainer fields, @JsonProperty("type") final com.commercetools.models.type.TypeResourceIdentifier type, @JsonProperty("textLineItemId") final java.lang.String textLineItemId) {
      this.fields = fields;
      this.type = type;
      this.textLineItemId = textLineItemId;
      this.action = "setTextLineItemCustomType";
   }
   public ShoppingListSetTextLineItemCustomTypeActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   
   public java.lang.String getTextLineItemId(){
      return this.textLineItemId;
   }

   public void setFields(final com.commercetools.models.type.FieldContainer fields){
      this.fields = fields;
   }
   
   public void setType(final com.commercetools.models.type.TypeResourceIdentifier type){
      this.type = type;
   }
   
   public void setTextLineItemId(final java.lang.String textLineItemId){
      this.textLineItemId = textLineItemId;
   }

}