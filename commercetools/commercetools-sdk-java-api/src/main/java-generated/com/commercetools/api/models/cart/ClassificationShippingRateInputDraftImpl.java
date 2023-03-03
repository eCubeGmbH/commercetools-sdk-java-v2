
package com.commercetools.api.models.cart;

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
 * ClassificationShippingRateInputDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ClassificationShippingRateInputDraftImpl implements ClassificationShippingRateInputDraft, ModelBase {

    private String type;

    private String key;

    @JsonCreator
    ClassificationShippingRateInputDraftImpl(@JsonProperty("key") final String key) {
        this.key = key;
        this.type = CLASSIFICATION;
    }

    public ClassificationShippingRateInputDraftImpl() {
        this.type = CLASSIFICATION;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ClassificationShippingRateInputDraftImpl that = (ClassificationShippingRateInputDraftImpl) o;

        return new EqualsBuilder().append(type, that.type).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).toHashCode();
    }

}
