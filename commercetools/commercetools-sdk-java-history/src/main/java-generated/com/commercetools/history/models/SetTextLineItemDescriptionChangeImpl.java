
package com.commercetools.history.models;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetTextLineItemDescriptionChangeImpl implements SetTextLineItemDescriptionChange {

    private String type;

    private String change;

    private com.commercetools.history.models.TextLineItemValue textLineItem;

    private com.commercetools.history.models.LocalizedString previousValue;

    private com.commercetools.history.models.LocalizedString nextValue;

    @JsonCreator
    SetTextLineItemDescriptionChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("textLineItem") final com.commercetools.history.models.TextLineItemValue textLineItem,
            @JsonProperty("previousValue") final com.commercetools.history.models.LocalizedString previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.LocalizedString nextValue) {
        this.change = change;
        this.textLineItem = textLineItem;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_TEXT_LINE_ITEM_DESCRIPTION_CHANGE;
    }

    public SetTextLineItemDescriptionChangeImpl() {
        this.type = SET_TEXT_LINE_ITEM_DESCRIPTION_CHANGE;
    }

    public String getType() {
        return this.type;
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

    public void setChange(final String change) {
        this.change = change;
    }

    public void setTextLineItem(final com.commercetools.history.models.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
    }

    public void setPreviousValue(final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.LocalizedString nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetTextLineItemDescriptionChangeImpl that = (SetTextLineItemDescriptionChangeImpl) o;

        return new EqualsBuilder().append(type, that.type).append(change, that.change).append(textLineItem,
            that.textLineItem).append(previousValue, that.previousValue).append(nextValue, that.nextValue).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(textLineItem).append(
            previousValue).append(nextValue).toHashCode();
    }

}
