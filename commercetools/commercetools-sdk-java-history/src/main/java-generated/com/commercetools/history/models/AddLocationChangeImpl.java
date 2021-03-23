
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
public final class AddLocationChangeImpl implements AddLocationChange {

    private String type;

    private String change;

    private com.commercetools.history.models.Location previousValue;

    private com.commercetools.history.models.Location nextValue;

    @JsonCreator
    AddLocationChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.Location previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.Location nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = ADD_LOCATION_CHANGE;
    }

    public AddLocationChangeImpl() {
        this.type = ADD_LOCATION_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>addLocation</code> on zones</p>
    */
    public String getChange() {
        return this.change;
    }

    /**
    *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
    */
    public com.commercetools.history.models.Location getPreviousValue() {
        return this.previousValue;
    }

    /**
    *  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
    */
    public com.commercetools.history.models.Location getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.Location previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.Location nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddLocationChangeImpl that = (AddLocationChangeImpl) o;

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
