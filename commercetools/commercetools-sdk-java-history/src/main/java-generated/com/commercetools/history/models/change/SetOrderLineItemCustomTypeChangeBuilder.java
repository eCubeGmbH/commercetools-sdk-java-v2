
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderLineItemCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderLineItemCustomTypeChange setOrderLineItemCustomTypeChange = SetOrderLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderLineItemCustomTypeChangeBuilder implements Builder<SetOrderLineItemCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.CustomFields previousValue;

    /**
     *  <p>Update action for <code>setLineItemCustomType</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param lineItem value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *
     * @param variant value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getVariant() {
        return this.variant;
    }

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetOrderLineItemCustomTypeChange with checking for non-null required values
     * @return SetOrderLineItemCustomTypeChange
     */
    public SetOrderLineItemCustomTypeChange build() {
        Objects.requireNonNull(change, SetOrderLineItemCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetOrderLineItemCustomTypeChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetOrderLineItemCustomTypeChange.class + ": variant is missing");
        Objects.requireNonNull(nextValue, SetOrderLineItemCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetOrderLineItemCustomTypeChange.class + ": previousValue is missing");
        return new SetOrderLineItemCustomTypeChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    /**
     * builds SetOrderLineItemCustomTypeChange without checking for non-null required values
     * @return SetOrderLineItemCustomTypeChange
     */
    public SetOrderLineItemCustomTypeChange buildUnchecked() {
        return new SetOrderLineItemCustomTypeChangeImpl(change, lineItem, variant, nextValue, previousValue);
    }

    public static SetOrderLineItemCustomTypeChangeBuilder of() {
        return new SetOrderLineItemCustomTypeChangeBuilder();
    }

    public static SetOrderLineItemCustomTypeChangeBuilder of(final SetOrderLineItemCustomTypeChange template) {
        SetOrderLineItemCustomTypeChangeBuilder builder = new SetOrderLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
