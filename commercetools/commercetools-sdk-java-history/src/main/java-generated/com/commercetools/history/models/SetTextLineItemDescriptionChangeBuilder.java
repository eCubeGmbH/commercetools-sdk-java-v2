
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetTextLineItemDescriptionChangeBuilder {

    private String change;

    private com.commercetools.history.models.TextLineItemValue textLineItem;

    private com.commercetools.history.models.LocalizedString previousValue;

    private com.commercetools.history.models.LocalizedString nextValue;

    public SetTextLineItemDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetTextLineItemDescriptionChangeBuilder textLineItem(
            final com.commercetools.history.models.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
        return this;
    }

    public SetTextLineItemDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetTextLineItemDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    public com.commercetools.history.models.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public SetTextLineItemDescriptionChange build() {
        return new SetTextLineItemDescriptionChangeImpl(change, textLineItem, previousValue, nextValue);
    }

    public static SetTextLineItemDescriptionChangeBuilder of() {
        return new SetTextLineItemDescriptionChangeBuilder();
    }

    public static SetTextLineItemDescriptionChangeBuilder of(final SetTextLineItemDescriptionChange template) {
        SetTextLineItemDescriptionChangeBuilder builder = new SetTextLineItemDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.textLineItem = template.getTextLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
