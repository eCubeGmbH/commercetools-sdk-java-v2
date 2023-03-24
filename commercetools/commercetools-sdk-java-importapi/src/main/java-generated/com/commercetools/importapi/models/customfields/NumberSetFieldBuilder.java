
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NumberSetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NumberSetField numberSetField = NumberSetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NumberSetFieldBuilder implements Builder<NumberSetField> {

    private java.util.List<Double> value;

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public NumberSetFieldBuilder value(final Double... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public NumberSetFieldBuilder value(final java.util.List<Double> value) {
        this.value = value;
        return this;
    }

    /**
     *
     * @param value value to be set
     * @return Builder
     */

    public NumberSetFieldBuilder plusValue(final Double... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public java.util.List<Double> getValue() {
        return this.value;
    }

    /**
     * builds NumberSetField with checking for non-null required values
     * @return NumberSetField
     */
    public NumberSetField build() {
        Objects.requireNonNull(value, NumberSetField.class + ": value is missing");
        return new NumberSetFieldImpl(value);
    }

    /**
     * builds NumberSetField without checking for non-null required values
     * @return NumberSetField
     */
    public NumberSetField buildUnchecked() {
        return new NumberSetFieldImpl(value);
    }

    public static NumberSetFieldBuilder of() {
        return new NumberSetFieldBuilder();
    }

    public static NumberSetFieldBuilder of(final NumberSetField template) {
        NumberSetFieldBuilder builder = new NumberSetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
