
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceValueChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValueChangedMessagePayload standalonePriceValueChangedMessagePayload = StandalonePriceValueChangedMessagePayload.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValueChangedMessagePayloadBuilder
        implements Builder<StandalonePriceValueChangedMessagePayload> {

    private com.commercetools.api.models.common.Money value;

    private Boolean staged;

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     */

    public StandalonePriceValueChangedMessagePayloadBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     */

    public StandalonePriceValueChangedMessagePayloadBuilder value(
            final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     */

    public StandalonePriceValueChangedMessagePayloadBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public StandalonePriceValueChangedMessagePayload build() {
        Objects.requireNonNull(value, StandalonePriceValueChangedMessagePayload.class + ": value is missing");
        Objects.requireNonNull(staged, StandalonePriceValueChangedMessagePayload.class + ": staged is missing");
        return new StandalonePriceValueChangedMessagePayloadImpl(value, staged);
    }

    /**
     * builds StandalonePriceValueChangedMessagePayload without checking for non null required values
     */
    public StandalonePriceValueChangedMessagePayload buildUnchecked() {
        return new StandalonePriceValueChangedMessagePayloadImpl(value, staged);
    }

    public static StandalonePriceValueChangedMessagePayloadBuilder of() {
        return new StandalonePriceValueChangedMessagePayloadBuilder();
    }

    public static StandalonePriceValueChangedMessagePayloadBuilder of(
            final StandalonePriceValueChangedMessagePayload template) {
        StandalonePriceValueChangedMessagePayloadBuilder builder = new StandalonePriceValueChangedMessagePayloadBuilder();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
