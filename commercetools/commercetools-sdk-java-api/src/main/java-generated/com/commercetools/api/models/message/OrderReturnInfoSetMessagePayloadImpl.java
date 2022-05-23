
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

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderReturnInfoSetMessagePayloadImpl implements OrderReturnInfoSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo;

    @JsonCreator
    OrderReturnInfoSetMessagePayloadImpl(
            @JsonProperty("returnInfo") final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
        this.type = RETURN_INFO_SET;
    }

    public OrderReturnInfoSetMessagePayloadImpl() {
        this.type = RETURN_INFO_SET;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<com.commercetools.api.models.order.ReturnInfo> getReturnInfo() {
        return this.returnInfo;
    }

    public void setReturnInfo(final com.commercetools.api.models.order.ReturnInfo... returnInfo) {
        this.returnInfo = new ArrayList<>(Arrays.asList(returnInfo));
    }

    public void setReturnInfo(final java.util.List<com.commercetools.api.models.order.ReturnInfo> returnInfo) {
        this.returnInfo = returnInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderReturnInfoSetMessagePayloadImpl that = (OrderReturnInfoSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(returnInfo, that.returnInfo).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(returnInfo).toHashCode();
    }

}
