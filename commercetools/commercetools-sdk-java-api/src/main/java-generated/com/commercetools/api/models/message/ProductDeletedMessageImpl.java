package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.product.ProductProjection;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDeletedMessageImpl implements ProductDeletedMessage {

    private String id;
    
    private Long version;
    
    private java.time.ZonedDateTime createdAt;
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    private Long sequenceNumber;
    
    private com.commercetools.api.models.common.Reference resource;
    
    private Long resourceVersion;
    
    private String type;
    
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    private java.util.List<String> removedImageUrls;
    
    private com.commercetools.api.models.product.ProductProjection currentProjection;

    @JsonCreator
    ProductDeletedMessageImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("sequenceNumber") final Long sequenceNumber, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceVersion") final Long resourceVersion, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls, @JsonProperty("currentProjection") final com.commercetools.api.models.product.ProductProjection currentProjection) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.sequenceNumber = sequenceNumber;
        this.resource = resource;
        this.resourceVersion = resourceVersion;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.removedImageUrls = removedImageUrls;
        this.currentProjection = currentProjection;
        this.type = "ProductDeleted";
    }
    public ProductDeletedMessageImpl() {
        this.type = "ProductDeleted";
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public Long getVersion(){
        return this.version;
    }
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }
    
    
    public java.util.List<String> getRemovedImageUrls(){
        return this.removedImageUrls;
    }
    
    
    public com.commercetools.api.models.product.ProductProjection getCurrentProjection(){
        return this.currentProjection;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    public void setSequenceNumber(final Long sequenceNumber){
        this.sequenceNumber = sequenceNumber;
    }
    
    public void setResource(final com.commercetools.api.models.common.Reference resource){
        this.resource = resource;
    }
    
    public void setResourceVersion(final Long resourceVersion){
        this.resourceVersion = resourceVersion;
    }
    
    public void setResourceUserProvidedIdentifiers(final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }
    
    public void setRemovedImageUrls(final String ...removedImageUrls){
       this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
    }
    
    public void setRemovedImageUrls(final java.util.List<String> removedImageUrls){
       this.removedImageUrls = removedImageUrls;
    }
    
    public void setCurrentProjection(final com.commercetools.api.models.product.ProductProjection currentProjection){
        this.currentProjection = currentProjection;
    }

}
