
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * SetMaxApplicationsPerCustomerChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMaxApplicationsPerCustomerChangeImpl implements SetMaxApplicationsPerCustomerChange, ModelBase {

    private String type;

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    @JsonCreator
    SetMaxApplicationsPerCustomerChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final Integer previousValue,
            @JsonProperty("nextValue") final Integer nextValue) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_MAX_APPLICATIONS_PER_CUSTOMER_CHANGE;
    }

    public SetMaxApplicationsPerCustomerChangeImpl() {
        this.type = SET_MAX_APPLICATIONS_PER_CUSTOMER_CHANGE;
    }

    /**
     <>
     */

    public String getType() {
        return this.type;
    }

    /**
     <*  <p>Shape of the action for <code>setMaxApplicationsPerCustomer</code></p>>
     */

    public String getChange() {
        return this.change;
    }

    /**
     <>
     */

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     <>
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final Integer previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final Integer nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetMaxApplicationsPerCustomerChangeImpl that = (SetMaxApplicationsPerCustomerChangeImpl) o;

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
