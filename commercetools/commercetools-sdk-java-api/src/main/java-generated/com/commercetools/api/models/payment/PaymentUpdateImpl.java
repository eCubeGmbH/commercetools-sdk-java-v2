
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

/**
 * PaymentUpdate
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentUpdateImpl implements PaymentUpdate, ModelBase {

    private Long version;

    private java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions;

    @JsonCreator
    PaymentUpdateImpl(@JsonProperty("version") final Long version,
            @JsonProperty("actions") final java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions) {
        this.version = version;
        this.actions = actions;
    }

    public PaymentUpdateImpl() {
    }

    /**
     *  <p>Expected version of the Payment on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the Payment.</p>
     */

    public java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> getActions() {
        return this.actions;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setActions(final com.commercetools.api.models.payment.PaymentUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
    }

    public void setActions(final java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentUpdateImpl that = (PaymentUpdateImpl) o;

        return new EqualsBuilder().append(version, that.version).append(actions, that.actions).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(version).append(actions).toHashCode();
    }

}
