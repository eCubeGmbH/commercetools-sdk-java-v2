
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   AttributeNestedType attributeNestedType = AttributeNestedType.builder()
           .typeReference(typeReferenceBuilder -> typeReferenceBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeNestedTypeImpl.class)
public interface AttributeNestedType extends AttributeType {

    String NESTED = "nested";

    /**
     *  <p>Reference to a ProductType.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("typeReference")
    public ProductTypeReference getTypeReference();

    public void setTypeReference(final ProductTypeReference typeReference);

    public static AttributeNestedType of() {
        return new AttributeNestedTypeImpl();
    }

    public static AttributeNestedType of(final AttributeNestedType template) {
        AttributeNestedTypeImpl instance = new AttributeNestedTypeImpl();
        instance.setTypeReference(template.getTypeReference());
        return instance;
    }

    public static AttributeNestedTypeBuilder builder() {
        return AttributeNestedTypeBuilder.of();
    }

    public static AttributeNestedTypeBuilder builder(final AttributeNestedType template) {
        return AttributeNestedTypeBuilder.of(template);
    }

    default <T> T withAttributeNestedType(Function<AttributeNestedType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeNestedType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeNestedType>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeNestedType>";
            }
        };
    }
}
