package com.commercetools.models.order_edit;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.order.OrderReference;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.OrderEditResult;
import com.commercetools.models.type.CustomFields;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class OrderEditImpl implements OrderEdit {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.common.CreatedBy createdBy;
   
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.order_edit.OrderEditResult result;
   
   private com.commercetools.models.order.OrderReference resource;
   
   private com.commercetools.models.type.CustomFields custom;
   
   private java.lang.String comment;
   
   private java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions;
   
   private java.lang.String key;

   @JsonCreator
   OrderEditImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("result") final com.commercetools.models.order_edit.OrderEditResult result, @JsonProperty("resource") final com.commercetools.models.order.OrderReference resource, @JsonProperty("custom") final com.commercetools.models.type.CustomFields custom, @JsonProperty("comment") final java.lang.String comment, @JsonProperty("stagedActions") final java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions, @JsonProperty("key") final java.lang.String key) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.result = result;
      this.resource = resource;
      this.custom = custom;
      this.comment = comment;
      this.stagedActions = stagedActions;
      this.key = key;
   }
   public OrderEditImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.order_edit.OrderEditResult getResult(){
      return this.result;
   }
   
   
   public com.commercetools.models.order.OrderReference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.lang.String getComment(){
      return this.comment;
   }
   
   
   public java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
   }
   
   public void setResult(final com.commercetools.models.order_edit.OrderEditResult result){
      this.result = result;
   }
   
   public void setResource(final com.commercetools.models.order.OrderReference resource){
      this.resource = resource;
   }
   
   public void setCustom(final com.commercetools.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setComment(final java.lang.String comment){
      this.comment = comment;
   }
   
   public void setStagedActions(final java.util.List<com.commercetools.models.order.StagedOrderUpdateAction> stagedActions){
      this.stagedActions = stagedActions;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}