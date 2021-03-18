
package com.commercetools.history.models;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPortionImpl implements DiscountedLineItemPortion {

    private com.commercetools.history.models.Reference discount;

    private com.commercetools.history.models.Money discountedAmount;

    @JsonCreator
    DiscountedLineItemPortionImpl(@JsonProperty("discount") final com.commercetools.history.models.Reference discount,
            @JsonProperty("discountedAmount") final com.commercetools.history.models.Money discountedAmount) {
        this.discount = discount;
        this.discountedAmount = discountedAmount;
    }

    public DiscountedLineItemPortionImpl() {
    }

    public com.commercetools.history.models.Reference getDiscount() {
        return this.discount;
    }

    public com.commercetools.history.models.Money getDiscountedAmount() {
        return this.discountedAmount;
    }

    public void setDiscount(final com.commercetools.history.models.Reference discount) {
        this.discount = discount;
    }

    public void setDiscountedAmount(final com.commercetools.history.models.Money discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedLineItemPortionImpl that = (DiscountedLineItemPortionImpl) o;

        return new EqualsBuilder().append(discount, that.discount).append(discountedAmount,
            that.discountedAmount).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(discount).append(discountedAmount).toHashCode();
    }

}
