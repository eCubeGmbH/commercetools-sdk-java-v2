
package com.commercetools.api.models.business_unit;

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
 *  <p>Adding a shipping address to a Business Unit generates a BusinessUnitShippingAddressAdded Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddShippingAddressIdActionImpl implements BusinessUnitAddShippingAddressIdAction, ModelBase {

    private String action;

    private String addressId;

    private String addressKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAddShippingAddressIdActionImpl(@JsonProperty("addressId") final String addressId,
            @JsonProperty("addressKey") final String addressKey) {
        this.addressId = addressId;
        this.addressKey = addressKey;
        this.action = ADD_SHIPPING_ADDRESS_ID;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAddShippingAddressIdActionImpl() {
        this.action = ADD_SHIPPING_ADDRESS_ID;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>ID of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     *  <p>Key of the address to add as a shipping address. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     */

    public String getAddressKey() {
        return this.addressKey;
    }

    public void setAddressId(final String addressId) {
        this.addressId = addressId;
    }

    public void setAddressKey(final String addressKey) {
        this.addressKey = addressKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAddShippingAddressIdActionImpl that = (BusinessUnitAddShippingAddressIdActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(addressId, that.addressId)
                .append(addressKey, that.addressKey)
                .append(action, that.action)
                .append(addressId, that.addressId)
                .append(addressKey, that.addressKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(addressId).append(addressKey).toHashCode();
    }

}
