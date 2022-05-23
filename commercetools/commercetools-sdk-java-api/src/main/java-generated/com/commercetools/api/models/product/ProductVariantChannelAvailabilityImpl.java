
package com.commercetools.api.models.product;

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
public class ProductVariantChannelAvailabilityImpl implements ProductVariantChannelAvailability, ModelBase {

    private Boolean isOnStock;

    private Long restockableInDays;

    private Long availableQuantity;

    @JsonCreator
    ProductVariantChannelAvailabilityImpl(@JsonProperty("isOnStock") final Boolean isOnStock,
            @JsonProperty("restockableInDays") final Long restockableInDays,
            @JsonProperty("availableQuantity") final Long availableQuantity) {
        this.isOnStock = isOnStock;
        this.restockableInDays = restockableInDays;
        this.availableQuantity = availableQuantity;
    }

    public ProductVariantChannelAvailabilityImpl() {
    }

    public Boolean getIsOnStock() {
        return this.isOnStock;
    }

    public Long getRestockableInDays() {
        return this.restockableInDays;
    }

    public Long getAvailableQuantity() {
        return this.availableQuantity;
    }

    public void setIsOnStock(final Boolean isOnStock) {
        this.isOnStock = isOnStock;
    }

    public void setRestockableInDays(final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
    }

    public void setAvailableQuantity(final Long availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantChannelAvailabilityImpl that = (ProductVariantChannelAvailabilityImpl) o;

        return new EqualsBuilder().append(isOnStock, that.isOnStock)
                .append(restockableInDays, that.restockableInDays)
                .append(availableQuantity, that.availableQuantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(isOnStock)
                .append(restockableInDays)
                .append(availableQuantity)
                .toHashCode();
    }

}
