
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeGroupsChangeBuilder {

    private String change;

    private java.util.List<String> previousValue;

    private java.util.List<String> nextValue;

    public ChangeGroupsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeGroupsChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeGroupsChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeGroupsChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeGroupsChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    public ChangeGroupsChange build() {
        return new ChangeGroupsChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeGroupsChangeBuilder of() {
        return new ChangeGroupsChangeBuilder();
    }

    public static ChangeGroupsChangeBuilder of(final ChangeGroupsChange template) {
        ChangeGroupsChangeBuilder builder = new ChangeGroupsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
