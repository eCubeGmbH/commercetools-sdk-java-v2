
package com.commercetools.importapi.models.errors;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResourceDeletionErrorImpl implements ResourceDeletionError {

    private String code;

    private String message;

    private java.lang.Object resource;

    @JsonCreator
    ResourceDeletionErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("resource") final java.lang.Object resource) {
        this.message = message;
        this.resource = resource;
        this.code = RESOURCE_DELETION;
    }

    public ResourceDeletionErrorImpl() {
        this.code = RESOURCE_DELETION;
    }

    public String getCode() {
        return this.code;
    }

    /**
    *  <p>This is a placeholder for an actual platform error message.</p>
    */
    public String getMessage() {
        return this.message;
    }

    public java.lang.Object getResource() {
        return this.resource;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setResource(final java.lang.Object resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ResourceDeletionErrorImpl that = (ResourceDeletionErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(resource, that.resource)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(resource).toHashCode();
    }

}
