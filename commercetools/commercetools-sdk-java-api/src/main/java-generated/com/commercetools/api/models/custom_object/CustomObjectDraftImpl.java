package com.commercetools.api.models.custom_object;

import com.fasterxml.jackson.databind.JsonNode;
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
public final class CustomObjectDraftImpl implements CustomObjectDraft {

    private String container;
    
    private String key;
    
    private com.fasterxml.jackson.databind.JsonNode value;
    
    private Long version;

    @JsonCreator
    CustomObjectDraftImpl(@JsonProperty("container") final String container, @JsonProperty("key") final String key, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value, @JsonProperty("version") final Long version) {
        this.container = container;
        this.key = key;
        this.value = value;
        this.version = version;
    }
    public CustomObjectDraftImpl() {
    }

    /**
    *  <p>A namespace to group custom objects.</p>
    */
    public String getContainer(){
        return this.container;
    }
    
    /**
    *  <p>A user-defined key that is unique within the given container.</p>
    */
    public String getKey(){
        return this.key;
    }
    
    
    public com.fasterxml.jackson.databind.JsonNode getValue(){
        return this.value;
    }
    
    
    public Long getVersion(){
        return this.version;
    }

    public void setContainer(final String container){
        this.container = container;
    }
    
    public void setKey(final String key){
        this.key = key;
    }
    
    public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
        this.value = value;
    }
    
    public void setVersion(final Long version){
        this.version = version;
    }

}
