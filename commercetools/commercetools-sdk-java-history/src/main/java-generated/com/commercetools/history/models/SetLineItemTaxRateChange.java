
package com.commercetools.history.models;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetLineItemTaxRateChangeImpl.class)
public interface SetLineItemTaxRateChange extends Change {

    String SET_LINE_ITEM_TAX_RATE_CHANGE = "SetLineItemTaxRateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setLineItemTaxRate</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LocalizedString getLineItem();

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public TaxRate getNextValue();

    /**
    *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
    */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public TaxRate getPreviousValue();

    public void setChange(final String change);

    public void setLineItem(final LocalizedString lineItem);

    public void setNextValue(final TaxRate nextValue);

    public void setPreviousValue(final TaxRate previousValue);

    public static SetLineItemTaxRateChange of() {
        return new SetLineItemTaxRateChangeImpl();
    }

    public static SetLineItemTaxRateChange of(final SetLineItemTaxRateChange template) {
        SetLineItemTaxRateChangeImpl instance = new SetLineItemTaxRateChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItem(template.getLineItem());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetLineItemTaxRateChangeBuilder builder() {
        return SetLineItemTaxRateChangeBuilder.of();
    }

    public static SetLineItemTaxRateChangeBuilder builder(final SetLineItemTaxRateChange template) {
        return SetLineItemTaxRateChangeBuilder.of(template);
    }

    default <T> T withSetLineItemTaxRateChange(Function<SetLineItemTaxRateChange, T> helper) {
        return helper.apply(this);
    }
}
