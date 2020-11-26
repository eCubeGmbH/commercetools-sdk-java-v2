package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice;
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
public final class ProductPriceDiscountsSetMessagePayloadImpl implements ProductPriceDiscountsSetMessagePayload {

    private String type;
    
    private java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices;

    @JsonCreator
    ProductPriceDiscountsSetMessagePayloadImpl(@JsonProperty("updatedPrices") final java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices) {
        this.updatedPrices = updatedPrices;
        this.type = "ProductPriceDiscountsSet";
    }
    public ProductPriceDiscountsSetMessagePayloadImpl() {
        this.type = "ProductPriceDiscountsSet";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> getUpdatedPrices(){
        return this.updatedPrices;
    }

    public void setUpdatedPrices(final com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice ...updatedPrices){
       this.updatedPrices = new ArrayList<>(Arrays.asList(updatedPrices));
    }
    
    public void setUpdatedPrices(final java.util.List<com.commercetools.api.models.message.ProductPriceDiscountsSetUpdatedPrice> updatedPrices){
       this.updatedPrices = updatedPrices;
    }

}
