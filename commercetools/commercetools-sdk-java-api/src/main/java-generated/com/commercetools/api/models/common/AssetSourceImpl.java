
package com.commercetools.api.models.common;

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
*  <p>Representation of an <a href="#asset">Asset</a> in a specific format, for example a video in a certain encoding, or an image in a certain resolution.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AssetSourceImpl implements AssetSource, ModelBase {

    private String uri;

    private String key;

    private com.commercetools.api.models.common.AssetDimensions dimensions;

    private String contentType;

    @JsonCreator
    AssetSourceImpl(@JsonProperty("uri") final String uri, @JsonProperty("key") final String key,
            @JsonProperty("dimensions") final com.commercetools.api.models.common.AssetDimensions dimensions,
            @JsonProperty("contentType") final String contentType) {
        this.uri = uri;
        this.key = key;
        this.dimensions = dimensions;
        this.contentType = contentType;
    }

    public AssetSourceImpl() {
    }

    /**
    *  <p>URI of the AssetSource.</p>
    */
    public String getUri() {
        return this.uri;
    }

    /**
    *  <p>User-defined unique identifier of the AssetSource.</p>
    */
    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Width and height of the AssetSource.</p>
    */
    public com.commercetools.api.models.common.AssetDimensions getDimensions() {
        return this.dimensions;
    }

    /**
    *  <p>Indicates the type of content, for example <code>application/pdf</code>.</p>
    */
    public String getContentType() {
        return this.contentType;
    }

    public void setUri(final String uri) {
        this.uri = uri;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setDimensions(final com.commercetools.api.models.common.AssetDimensions dimensions) {
        this.dimensions = dimensions;
    }

    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssetSourceImpl that = (AssetSourceImpl) o;

        return new EqualsBuilder().append(uri, that.uri)
                .append(key, that.key)
                .append(dimensions, that.dimensions)
                .append(contentType, that.contentType)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(uri).append(key).append(dimensions).append(contentType).toHashCode();
    }

}
