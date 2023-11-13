
package com.commercetools.api.models.payment;

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
 * PaymentSetStatusInterfaceTextAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetStatusInterfaceTextActionImpl implements PaymentSetStatusInterfaceTextAction, ModelBase {

    private String action;

    private String interfaceText;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentSetStatusInterfaceTextActionImpl(@JsonProperty("interfaceText") final String interfaceText) {
        this.interfaceText = interfaceText;
        this.action = SET_STATUS_INTERFACE_TEXT;
    }

    /**
     * create empty instance
     */
    public PaymentSetStatusInterfaceTextActionImpl() {
        this.action = SET_STATUS_INTERFACE_TEXT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public String getInterfaceText() {
        return this.interfaceText;
    }

    public void setInterfaceText(final String interfaceText) {
        this.interfaceText = interfaceText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentSetStatusInterfaceTextActionImpl that = (PaymentSetStatusInterfaceTextActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(interfaceText, that.interfaceText)
                .append(action, that.action)
                .append(interfaceText, that.interfaceText)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(interfaceText).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("interfaceText", interfaceText)
                .build();
    }

}
