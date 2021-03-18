
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetImageLabelChangeBuilder {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.Image previousValue;

    private com.commercetools.history.models.Image nextValue;

    public SetImageLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetImageLabelChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetImageLabelChangeBuilder previousValue(final com.commercetools.history.models.Image previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetImageLabelChangeBuilder nextValue(final com.commercetools.history.models.Image nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.Image getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.Image getNextValue() {
        return this.nextValue;
    }

    public SetImageLabelChange build() {
        return new SetImageLabelChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetImageLabelChangeBuilder of() {
        return new SetImageLabelChangeBuilder();
    }

    public static SetImageLabelChangeBuilder of(final SetImageLabelChange template) {
        SetImageLabelChangeBuilder builder = new SetImageLabelChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
