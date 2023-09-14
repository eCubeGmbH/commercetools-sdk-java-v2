
package com.commercetools.api.models.message;

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
 *  <p>Generated after removing a Custom Type from an address of a Business Unit using the Set Custom Type in Address update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl
        implements BusinessUnitAddressCustomTypeRemovedMessagePayload, ModelBase {

    private String type;

    private String oldTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl(@JsonProperty("oldTypeId") final String oldTypeId) {
        this.oldTypeId = oldTypeId;
        this.type = BUSINESS_UNIT_ADDRESS_CUSTOM_TYPE_REMOVED;
    }

    /**
     * create empty instance
     */
    public BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl() {
        this.type = BUSINESS_UNIT_ADDRESS_CUSTOM_TYPE_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     */

    public String getOldTypeId() {
        return this.oldTypeId;
    }

    public void setOldTypeId(final String oldTypeId) {
        this.oldTypeId = oldTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl that = (BusinessUnitAddressCustomTypeRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(oldTypeId, that.oldTypeId)
                .append(type, that.type)
                .append(oldTypeId, that.oldTypeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(oldTypeId).toHashCode();
    }

}
