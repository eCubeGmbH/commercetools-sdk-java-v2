package com.commercetools.api.generated.models.state;

import com.commercetools.api.generated.models.state.StateUpdateAction;
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
public final class StateChangeKeyActionImpl implements StateChangeKeyAction {

   private String action;
   
   private String key;

   @JsonCreator
   StateChangeKeyActionImpl(@JsonProperty("key") final String key) {
      this.key = key;
      this.action = "changeKey";
   }
   public StateChangeKeyActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public void setKey(final String key){
      this.key = key;
   }

}