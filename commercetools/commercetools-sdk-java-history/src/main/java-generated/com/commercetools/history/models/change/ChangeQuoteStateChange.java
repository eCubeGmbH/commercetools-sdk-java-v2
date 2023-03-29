
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.QuoteState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Update action for <code>changeQuoteState</code> on <code>quote</code></p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeQuoteStateChange changeQuoteStateChange = ChangeQuoteStateChange.builder()
 *             .change("{change}")
 *             .nextValue(QuoteState.PENDING)
 *             .previousValue(QuoteState.PENDING)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeQuoteStateChangeImpl.class)
public interface ChangeQuoteStateChange extends Change {

    /**
     * discriminator value for ChangeQuoteStateChange
     */
    String CHANGE_QUOTE_STATE_CHANGE = "ChangeQuoteStateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public QuoteState getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public QuoteState getPreviousValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final QuoteState nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final QuoteState previousValue);

    /**
     * factory method
     * @return instance of ChangeQuoteStateChange
     */
    public static ChangeQuoteStateChange of() {
        return new ChangeQuoteStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeQuoteStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeQuoteStateChange of(final ChangeQuoteStateChange template) {
        ChangeQuoteStateChangeImpl instance = new ChangeQuoteStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeQuoteStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeQuoteStateChange deepCopy(@Nullable final ChangeQuoteStateChange template) {
        if (template == null) {
            return null;
        }
        ChangeQuoteStateChangeImpl instance = new ChangeQuoteStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for ChangeQuoteStateChange
     * @return builder
     */
    public static ChangeQuoteStateChangeBuilder builder() {
        return ChangeQuoteStateChangeBuilder.of();
    }

    /**
     * create builder for ChangeQuoteStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeQuoteStateChangeBuilder builder(final ChangeQuoteStateChange template) {
        return ChangeQuoteStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeQuoteStateChange(Function<ChangeQuoteStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeQuoteStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeQuoteStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeQuoteStateChange>";
            }
        };
    }
}
