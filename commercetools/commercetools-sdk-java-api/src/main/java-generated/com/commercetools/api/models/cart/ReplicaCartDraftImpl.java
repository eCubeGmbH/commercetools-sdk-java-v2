package com.commercetools.api.models.cart;

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
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReplicaCartDraftImpl implements ReplicaCartDraft {

    private com.fasterxml.jackson.databind.JsonNode reference;
    
    private String key;

    @JsonCreator
    ReplicaCartDraftImpl(@JsonProperty("reference") final com.fasterxml.jackson.databind.JsonNode reference, @JsonProperty("key") final String key) {
        this.reference = reference;
        this.key = key;
    }
    public ReplicaCartDraftImpl() {
    }

    
    public com.fasterxml.jackson.databind.JsonNode getReference(){
        return this.reference;
    }
    
    /**
    *  <p>User-specific unique identifier of the cart.</p>
    */
    public String getKey(){
        return this.key;
    }

    public void setReference(final com.fasterxml.jackson.databind.JsonNode reference){
        this.reference = reference;
    }
    
    public void setKey(final String key){
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ReplicaCartDraftImpl that = (ReplicaCartDraftImpl) o;
    
        return new EqualsBuilder()
                .append(reference, that.reference)
                .append(key, that.key)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(reference)
            .append(key)
            .toHashCode();
    }

}
