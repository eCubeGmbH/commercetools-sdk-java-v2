package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
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
public final class OrderEditResourceIdentifierImpl implements OrderEditResourceIdentifier {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;
    
    private String id;
    
    private String key;

    @JsonCreator
    OrderEditResourceIdentifierImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.id = id;
        this.key = key;
        this.typeId = ReferenceTypeId.findEnum("order-edit");
    }
    public OrderEditResourceIdentifierImpl() {
        this.typeId = ReferenceTypeId.findEnum("order-edit");
    }

    
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId(){
        return this.typeId;
    }
    
    
    public String getId(){
        return this.id;
    }
    
    
    public String getKey(){
        return this.key;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setKey(final String key){
        this.key = key;
    }

}
