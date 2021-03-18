
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
public final class ChangeFieldDefinitionOrderChangeImpl implements ChangeFieldDefinitionOrderChange {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.FieldDefinitionOrderValue> previousValue;

    private java.util.List<com.commercetools.history.models.FieldDefinitionOrderValue> nextValue;

    @JsonCreator
    ChangeFieldDefinitionOrderChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.FieldDefinitionOrderValue> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.FieldDefinitionOrderValue> nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = CHANGE_FIELD_DEFINITION_ORDER_CHANGE;
    }

    public ChangeFieldDefinitionOrderChangeImpl() {
        this.type = CHANGE_FIELD_DEFINITION_ORDER_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>changeFieldDefinitionOrder</code> on types</p>
    */
    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.FieldDefinitionOrderValue> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.FieldDefinitionOrderValue> getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.FieldDefinitionOrderValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.FieldDefinitionOrderValue> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.FieldDefinitionOrderValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(
            final java.util.List<com.commercetools.history.models.FieldDefinitionOrderValue> nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeFieldDefinitionOrderChangeImpl that = (ChangeFieldDefinitionOrderChangeImpl) o;

        return new EqualsBuilder().append(type, that.type).append(change, that.change).append(previousValue,
            that.previousValue).append(nextValue, that.nextValue).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).append(previousValue).append(
            nextValue).toHashCode();
    }

}
