
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
public final class SetValidFromAndUntilChangeImpl implements SetValidFromAndUntilChange {

    private String type;

    private String change;

    private com.commercetools.history.models.ValidFromAndUntilValue previousValue;

    private com.commercetools.history.models.ValidFromAndUntilValue nextValue;

    @JsonCreator
    SetValidFromAndUntilChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.ValidFromAndUntilValue previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.ValidFromAndUntilValue nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_VALID_FROM_AND_UNTIL_CHANGE;
    }

    public SetValidFromAndUntilChangeImpl() {
        this.type = SET_VALID_FROM_AND_UNTIL_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    public String getChange() {
        return this.change;
    }

    /**
    *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
    */
    public com.commercetools.history.models.ValidFromAndUntilValue getPreviousValue() {
        return this.previousValue;
    }

    /**
    *  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
    */
    public com.commercetools.history.models.ValidFromAndUntilValue getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.ValidFromAndUntilValue previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.ValidFromAndUntilValue nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetValidFromAndUntilChangeImpl that = (SetValidFromAndUntilChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

}
