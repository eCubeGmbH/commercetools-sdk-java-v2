
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the API Extension does not respond within the time limit, or could not be reached.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionNoResponseError extensionNoResponseError = ExtensionNoResponseError.builder()
 *             .message("{message}")
 *             .extensionId("{extensionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionNoResponseErrorImpl.class)
public interface ExtensionNoResponseError extends ErrorObject {

    String EXTENSION_NO_RESPONSE = "ExtensionNoResponse";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Extension did not respond in time."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Unique identifier of the API Extension.</p>
     */
    @NotNull
    @JsonProperty("extensionId")
    public String getExtensionId();

    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     */

    @JsonProperty("extensionKey")
    public String getExtensionKey();

    public void setMessage(final String message);

    public void setExtensionId(final String extensionId);

    public void setExtensionKey(final String extensionKey);

    public static ExtensionNoResponseError of() {
        return new ExtensionNoResponseErrorImpl();
    }

    public static ExtensionNoResponseError of(final ExtensionNoResponseError template) {
        ExtensionNoResponseErrorImpl instance = new ExtensionNoResponseErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setExtensionId(template.getExtensionId());
        instance.setExtensionKey(template.getExtensionKey());
        return instance;
    }

    public static ExtensionNoResponseErrorBuilder builder() {
        return ExtensionNoResponseErrorBuilder.of();
    }

    public static ExtensionNoResponseErrorBuilder builder(final ExtensionNoResponseError template) {
        return ExtensionNoResponseErrorBuilder.of(template);
    }

    default <T> T withExtensionNoResponseError(Function<ExtensionNoResponseError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionNoResponseError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionNoResponseError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionNoResponseError>";
            }
        };
    }
}
