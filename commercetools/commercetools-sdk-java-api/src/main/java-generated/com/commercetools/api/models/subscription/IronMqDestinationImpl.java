package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
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
public final class IronMqDestinationImpl implements IronMqDestination {

    private String type;
    
    private String uri;

    @JsonCreator
    IronMqDestinationImpl(@JsonProperty("uri") final String uri) {
        this.uri = uri;
        this.type = "IronMQ";
    }
    public IronMqDestinationImpl() {
        this.type = "IronMQ";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public String getUri(){
        return this.uri;
    }

    public void setUri(final String uri){
        this.uri = uri;
    }

}
