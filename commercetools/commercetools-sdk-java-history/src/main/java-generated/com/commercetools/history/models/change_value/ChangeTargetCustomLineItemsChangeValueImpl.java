
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ChangeTargetCustomLineItemsChangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetCustomLineItemsChangeValueImpl implements ChangeTargetCustomLineItemsChangeValue, ModelBase {

    private String type;

    private String predicate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeTargetCustomLineItemsChangeValueImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.type = CUSTOM_LINE_ITEMS;
    }

    /**
     * create empty instance
     */
    public ChangeTargetCustomLineItemsChangeValueImpl() {
        this.type = CUSTOM_LINE_ITEMS;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Valid CustomLineItem target predicate.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeTargetCustomLineItemsChangeValueImpl that = (ChangeTargetCustomLineItemsChangeValueImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(predicate, that.predicate)
                .append(type, that.type)
                .append(predicate, that.predicate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(predicate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("predicate", predicate)
                .build();
    }

}
