
package com.commercetools.importapi.models.order_patches;

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
 * DeliveryAddressDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryAddressDraftImpl implements DeliveryAddressDraft, ModelBase {

    private String deliveryId;

    private com.commercetools.importapi.models.common.Address address;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryAddressDraftImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("address") final com.commercetools.importapi.models.common.Address address) {
        this.deliveryId = deliveryId;
        this.address = address;
    }

    /**
     * create empty instance
     */
    public DeliveryAddressDraftImpl() {
    }

    /**
     *
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *
     */

    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setAddress(final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DeliveryAddressDraftImpl that = (DeliveryAddressDraftImpl) o;

        return new EqualsBuilder().append(deliveryId, that.deliveryId)
                .append(address, that.address)
                .append(deliveryId, that.deliveryId)
                .append(address, that.address)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(deliveryId).append(address).toHashCode();
    }

}
