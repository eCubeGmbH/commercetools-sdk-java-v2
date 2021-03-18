
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetChannelRolesChangeBuilder {

    private String change;

    private java.util.List<com.commercetools.history.models.ChannelRole> previousValue;

    private java.util.List<com.commercetools.history.models.ChannelRole> nextValue;

    public SetChannelRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetChannelRolesChangeBuilder previousValue(
            final com.commercetools.history.models.ChannelRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetChannelRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.ChannelRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetChannelRolesChangeBuilder nextValue(final com.commercetools.history.models.ChannelRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetChannelRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.ChannelRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.ChannelRole> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.ChannelRole> getNextValue() {
        return this.nextValue;
    }

    public SetChannelRolesChange build() {
        return new SetChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    public static SetChannelRolesChangeBuilder of() {
        return new SetChannelRolesChangeBuilder();
    }

    public static SetChannelRolesChangeBuilder of(final SetChannelRolesChange template) {
        SetChannelRolesChangeBuilder builder = new SetChannelRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
