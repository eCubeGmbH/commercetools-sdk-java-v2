
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the predicate defined in the ExtensionTrigger could not be evaluated due to a missing field.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionPredicateEvaluationFailedError extensionPredicateEvaluationFailedError = ExtensionPredicateEvaluationFailedError.builder()
 *             .message("{message}")
 *             .errorByExtension(errorByExtensionBuilder -> errorByExtensionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionPredicateEvaluationFailedErrorImpl.class)
public interface ExtensionPredicateEvaluationFailedError extends ErrorObject {

    String EXTENSION_PREDICATE_EVALUATION_FAILED = "ExtensionPredicateEvaluationFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The compared field $fieldName is not present."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Details about the API Extension that was involved in the error.</p>
     * @return errorByExtension
     */
    @NotNull
    @Valid
    @JsonProperty("errorByExtension")
    public ErrorByExtension getErrorByExtension();

    public void setMessage(final String message);

    public void setErrorByExtension(final ErrorByExtension errorByExtension);

    public static ExtensionPredicateEvaluationFailedError of() {
        return new ExtensionPredicateEvaluationFailedErrorImpl();
    }

    public static ExtensionPredicateEvaluationFailedError of(final ExtensionPredicateEvaluationFailedError template) {
        ExtensionPredicateEvaluationFailedErrorImpl instance = new ExtensionPredicateEvaluationFailedErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setErrorByExtension(template.getErrorByExtension());
        return instance;
    }

    public static ExtensionPredicateEvaluationFailedErrorBuilder builder() {
        return ExtensionPredicateEvaluationFailedErrorBuilder.of();
    }

    public static ExtensionPredicateEvaluationFailedErrorBuilder builder(
            final ExtensionPredicateEvaluationFailedError template) {
        return ExtensionPredicateEvaluationFailedErrorBuilder.of(template);
    }

    default <T> T withExtensionPredicateEvaluationFailedError(
            Function<ExtensionPredicateEvaluationFailedError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionPredicateEvaluationFailedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionPredicateEvaluationFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionPredicateEvaluationFailedError>";
            }
        };
    }
}
