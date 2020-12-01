package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.order_edit.OrderEditResult;
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
public final class OrderEditPreviewFailureImpl implements OrderEditPreviewFailure {

    private String type;
    
    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    @JsonCreator
    OrderEditPreviewFailureImpl(@JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        this.type = "PreviewFailure";
    }
    public OrderEditPreviewFailureImpl() {
        this.type = "PreviewFailure";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors(){
        return this.errors;
    }

    public void setErrors(final com.commercetools.api.models.error.ErrorObject ...errors){
       this.errors = new ArrayList<>(Arrays.asList(errors));
    }
    
    public void setErrors(final java.util.List<com.commercetools.api.models.error.ErrorObject> errors){
       this.errors = errors;
    }

}
