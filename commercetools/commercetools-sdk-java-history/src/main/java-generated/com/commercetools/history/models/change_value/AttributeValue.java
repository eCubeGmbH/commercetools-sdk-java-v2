
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeValue attributeValue = AttributeValue.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeValueImpl.class)
public interface AttributeValue {

    /**
     *
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of AttributeValue
     */
    public static AttributeValue of() {
        return new AttributeValueImpl();
    }

    /**
     * factory method to create a shallow copy AttributeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static AttributeValue of(final AttributeValue template) {
        AttributeValueImpl instance = new AttributeValueImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of AttributeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AttributeValue deepCopy(@Nullable final AttributeValue template) {
        if (template == null) {
            return null;
        }
        AttributeValueImpl instance = new AttributeValueImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for AttributeValue
     * @return builder
     */
    public static AttributeValueBuilder builder() {
        return AttributeValueBuilder.of();
    }

    /**
     * create builder for AttributeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeValueBuilder builder(final AttributeValue template) {
        return AttributeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAttributeValue(Function<AttributeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AttributeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeValue>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeValue>";
            }
        };
    }
}
