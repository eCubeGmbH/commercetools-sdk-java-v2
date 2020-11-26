package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
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
public final class InventoryEntryAddQuantityActionImpl implements InventoryEntryAddQuantityAction {

    private String action;
    
    private Long quantity;

    @JsonCreator
    InventoryEntryAddQuantityActionImpl(@JsonProperty("quantity") final Long quantity) {
        this.quantity = quantity;
        this.action = "addQuantity";
    }
    public InventoryEntryAddQuantityActionImpl() {
        this.action = "addQuantity";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Long getQuantity(){
        return this.quantity;
    }

    public void setQuantity(final Long quantity){
        this.quantity = quantity;
    }

}
