
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
public final class SetLineItemTaxedPriceChangeImpl implements SetLineItemTaxedPriceChange {

    private String type;

    private String change;

    private com.commercetools.history.models.LocalizedString lineItem;

    private String lineItemId;

    private com.commercetools.history.models.TaxedItemPrice nextValue;

    private com.commercetools.history.models.TaxedItemPrice previousValue;

    @JsonCreator
    SetLineItemTaxedPriceChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("lineItem") final com.commercetools.history.models.LocalizedString lineItem,
            @JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("nextValue") final com.commercetools.history.models.TaxedItemPrice nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.TaxedItemPrice previousValue) {
        this.change = change;
        this.lineItem = lineItem;
        this.lineItemId = lineItemId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_LINE_ITEM_TAXED_PRICE_CHANGE;
    }

    public SetLineItemTaxedPriceChangeImpl() {
        this.type = SET_LINE_ITEM_TAXED_PRICE_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setLineItemTaxedPrice</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public com.commercetools.history.models.TaxedItemPrice getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.TaxedItemPrice getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setLineItem(final com.commercetools.history.models.LocalizedString lineItem) {
        this.lineItem = lineItem;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setNextValue(final com.commercetools.history.models.TaxedItemPrice nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.TaxedItemPrice previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetLineItemTaxedPriceChangeImpl that = (SetLineItemTaxedPriceChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(lineItem, that.lineItem)
                .append(lineItemId, that.lineItemId)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(lineItem)
                .append(lineItemId)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
