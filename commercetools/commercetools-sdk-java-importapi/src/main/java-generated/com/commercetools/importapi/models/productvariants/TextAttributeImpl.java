package com.commercetools.importapi.models.productvariants;

import com.commercetools.importapi.models.productvariants.Attribute;
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


/**
*  <p>This type represents an attribute which value is a string.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TextAttributeImpl implements TextAttribute {

    private String name;
    
    private String type;
    
    private String value;

    @JsonCreator
    TextAttributeImpl(@JsonProperty("name") final String name, @JsonProperty("value") final String value) {
        this.name = name;
        this.value = value;
        this.type = "text";
    }
    public TextAttributeImpl() {
        this.type = "text";
    }

    /**
    *  <p>The name of this attribute must match a name of the product types attribute definitions.
    *  The name is required if this type is used in a product variant and must not be set when
    *  used in a product variant patch.</p>
    */
    public String getName(){
        return this.name;
    }
    
    
    public String getType(){
        return this.type;
    }
    
    
    public String getValue(){
        return this.value;
    }

    public void setName(final String name){
        this.name = name;
    }
    
    public void setValue(final String value){
        this.value = value;
    }

}
