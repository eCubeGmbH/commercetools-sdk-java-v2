package com.commercetools.importer.models.products;

import com.commercetools.importer.models.products.CustomTokenizer;
import com.commercetools.importer.models.products.WhitespaceTokenizer;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.importer.models.products.CustomTokenizerImpl.class, name = "custom"),
   @JsonSubTypes.Type(value = com.commercetools.importer.models.products.WhitespaceTokenizerImpl.class, name = "whitespace")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "type"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface SuggestTokenizer  {


   


}