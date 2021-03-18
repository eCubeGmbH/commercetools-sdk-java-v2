
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetStatusInterfaceCodeChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetStatusInterfaceCodeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetStatusInterfaceCodeChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetStatusInterfaceCodeChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public SetStatusInterfaceCodeChange build() {
        return new SetStatusInterfaceCodeChangeImpl(change, previousValue, nextValue);
    }

    public static SetStatusInterfaceCodeChangeBuilder of() {
        return new SetStatusInterfaceCodeChangeBuilder();
    }

    public static SetStatusInterfaceCodeChangeBuilder of(final SetStatusInterfaceCodeChange template) {
        SetStatusInterfaceCodeChangeBuilder builder = new SetStatusInterfaceCodeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
