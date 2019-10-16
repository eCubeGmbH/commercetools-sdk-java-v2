package com.commercetools.api.generated.models.inventory;

import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.generated.models.inventory.InventoryEntryUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = InventoryEntryUpdateImpl.class)
public interface InventoryEntryUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<InventoryEntryUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<InventoryEntryUpdateAction> actions);
   
   public static InventoryEntryUpdateImpl of(){
      return new InventoryEntryUpdateImpl();
   }
   

   public static InventoryEntryUpdateImpl of(final InventoryEntryUpdate template) {
      InventoryEntryUpdateImpl instance = new InventoryEntryUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}