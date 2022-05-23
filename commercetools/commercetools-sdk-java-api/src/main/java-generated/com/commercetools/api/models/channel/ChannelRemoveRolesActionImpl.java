
package com.commercetools.api.models.channel;

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
public class ChannelRemoveRolesActionImpl implements ChannelRemoveRolesAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    @JsonCreator
    ChannelRemoveRolesActionImpl(
            @JsonProperty("roles") final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        this.action = REMOVE_ROLES;
    }

    public ChannelRemoveRolesActionImpl() {
        this.action = REMOVE_ROLES;
    }

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to remove from the array.</p>
     */
    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles() {
        return this.roles;
    }

    public void setRoles(final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    public void setRoles(final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChannelRemoveRolesActionImpl that = (ChannelRemoveRolesActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(roles, that.roles).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(roles).toHashCode();
    }

}
