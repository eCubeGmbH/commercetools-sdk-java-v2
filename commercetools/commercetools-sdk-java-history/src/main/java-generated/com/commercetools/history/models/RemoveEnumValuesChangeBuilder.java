
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveEnumValuesChangeBuilder {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.EnumValue previousValue;

    public RemoveEnumValuesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveEnumValuesChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public RemoveEnumValuesChangeBuilder previousValue(final com.commercetools.history.models.EnumValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.EnumValue getPreviousValue() {
        return this.previousValue;
    }

    public RemoveEnumValuesChange build() {
        return new RemoveEnumValuesChangeImpl(change, attributeName, previousValue);
    }

    public static RemoveEnumValuesChangeBuilder of() {
        return new RemoveEnumValuesChangeBuilder();
    }

    public static RemoveEnumValuesChangeBuilder of(final RemoveEnumValuesChange template) {
        RemoveEnumValuesChangeBuilder builder = new RemoveEnumValuesChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
