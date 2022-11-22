
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionUpdateActionsFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionUpdateActionsFailedError extensionUpdateActionsFailedError = ExtensionUpdateActionsFailedError.builder()
 *             .message("{message}")
 *             .plusExtensionErrors(extensionErrorsBuilder -> extensionErrorsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionUpdateActionsFailedErrorBuilder implements Builder<ExtensionUpdateActionsFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedMessage;

    @Nullable
    private java.lang.Object extensionExtraInfo;

    private java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors;

    /**
     *  <p><code>"The extension returned update actions that could not be executed."</code></p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>User-defined localized description of the error.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder localizedMessage(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedMessage = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined localized description of the error.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder localizedMessage(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }

    /**
     *  <p>Any information that should be returned to the API caller.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder extensionExtraInfo(
            @Nullable final java.lang.Object extensionExtraInfo) {
        this.extensionExtraInfo = extensionExtraInfo;
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder extensionErrors(
            final com.commercetools.api.models.error.ExtensionError... extensionErrors) {
        this.extensionErrors = new ArrayList<>(Arrays.asList(extensionErrors));
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder extensionErrors(
            final java.util.List<com.commercetools.api.models.error.ExtensionError> extensionErrors) {
        this.extensionErrors = extensionErrors;
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder plusExtensionErrors(
            final com.commercetools.api.models.error.ExtensionError... extensionErrors) {
        if (this.extensionErrors == null) {
            this.extensionErrors = new ArrayList<>();
        }
        this.extensionErrors.addAll(Arrays.asList(extensionErrors));
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder plusExtensionErrors(
            Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionErrorBuilder> builder) {
        if (this.extensionErrors == null) {
            this.extensionErrors = new ArrayList<>();
        }
        this.extensionErrors.add(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Additional errors related to the API Extension.</p>
     */

    public ExtensionUpdateActionsFailedErrorBuilder withExtensionErrors(
            Function<com.commercetools.api.models.error.ExtensionErrorBuilder, com.commercetools.api.models.error.ExtensionErrorBuilder> builder) {
        this.extensionErrors = new ArrayList<>();
        this.extensionErrors.add(builder.apply(com.commercetools.api.models.error.ExtensionErrorBuilder.of()).build());
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedMessage() {
        return this.localizedMessage;
    }

    @Nullable
    public java.lang.Object getExtensionExtraInfo() {
        return this.extensionExtraInfo;
    }

    public java.util.List<com.commercetools.api.models.error.ExtensionError> getExtensionErrors() {
        return this.extensionErrors;
    }

    public ExtensionUpdateActionsFailedError build() {
        Objects.requireNonNull(message, ExtensionUpdateActionsFailedError.class + ": message is missing");
        Objects.requireNonNull(values, ExtensionUpdateActionsFailedError.class + ": values are missing");
        Objects.requireNonNull(extensionErrors,
            ExtensionUpdateActionsFailedError.class + ": extensionErrors is missing");
        return new ExtensionUpdateActionsFailedErrorImpl(message, values, localizedMessage, extensionExtraInfo,
            extensionErrors);
    }

    /**
     * builds ExtensionUpdateActionsFailedError without checking for non null required values
     */
    public ExtensionUpdateActionsFailedError buildUnchecked() {
        return new ExtensionUpdateActionsFailedErrorImpl(message, values, localizedMessage, extensionExtraInfo,
            extensionErrors);
    }

    public static ExtensionUpdateActionsFailedErrorBuilder of() {
        return new ExtensionUpdateActionsFailedErrorBuilder();
    }

    public static ExtensionUpdateActionsFailedErrorBuilder of(final ExtensionUpdateActionsFailedError template) {
        ExtensionUpdateActionsFailedErrorBuilder builder = new ExtensionUpdateActionsFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.localizedMessage = template.getLocalizedMessage();
        builder.extensionExtraInfo = template.getExtensionExtraInfo();
        builder.extensionErrors = template.getExtensionErrors();
        return builder;
    }

}
