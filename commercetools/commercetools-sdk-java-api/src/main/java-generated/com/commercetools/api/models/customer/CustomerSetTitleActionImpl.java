package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
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
public final class CustomerSetTitleActionImpl implements CustomerSetTitleAction {

    private String action;
    
    private String title;

    @JsonCreator
    CustomerSetTitleActionImpl(@JsonProperty("title") final String title) {
        this.title = title;
        this.action = "setTitle";
    }
    public CustomerSetTitleActionImpl() {
        this.action = "setTitle";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getTitle(){
        return this.title;
    }

    public void setTitle(final String title){
        this.title = title;
    }

}
