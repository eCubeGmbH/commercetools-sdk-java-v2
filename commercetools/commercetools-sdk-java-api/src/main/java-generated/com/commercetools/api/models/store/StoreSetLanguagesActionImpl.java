package com.commercetools.api.models.store;

import com.commercetools.api.models.store.StoreUpdateAction;
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
public final class StoreSetLanguagesActionImpl implements StoreSetLanguagesAction {

    private String action;
    
    private java.util.List<String> languages;

    @JsonCreator
    StoreSetLanguagesActionImpl(@JsonProperty("languages") final java.util.List<String> languages) {
        this.languages = languages;
        this.action = "setLanguages";
    }
    public StoreSetLanguagesActionImpl() {
        this.action = "setLanguages";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public java.util.List<String> getLanguages(){
        return this.languages;
    }

    public void setLanguages(final String ...languages){
       this.languages = new ArrayList<>(Arrays.asList(languages));
    }
    
    public void setLanguages(final java.util.List<String> languages){
       this.languages = languages;
    }

}
