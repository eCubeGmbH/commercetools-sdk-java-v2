package com.commercetools.api.generated.models.cart;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.cart.ReplicaCartDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ReplicaCartDraftImpl.class)
public interface ReplicaCartDraft  {

   
   @NotNull
   @JsonProperty("reference")
   public JsonNode getReference();

   public void setReference(final JsonNode reference);
   
   public static ReplicaCartDraftImpl of(){
      return new ReplicaCartDraftImpl();
   }
   

   public static ReplicaCartDraftImpl of(final ReplicaCartDraft template) {
      ReplicaCartDraftImpl instance = new ReplicaCartDraftImpl();
      instance.setReference(template.getReference());
      return instance;
   }

}