
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerMessagePayload customerMessagePayload = CustomerMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CustomerMessagePayload extends MessagePayload {

    /**
     * factory method to create a deep copy of CustomerMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerMessagePayload deepCopy(@Nullable final CustomerMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerMessagePayloadImpl instance = new CustomerMessagePayloadImpl();
        return instance;
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerMessagePayload(Function<CustomerMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerMessagePayload>";
            }
        };
    }
}
