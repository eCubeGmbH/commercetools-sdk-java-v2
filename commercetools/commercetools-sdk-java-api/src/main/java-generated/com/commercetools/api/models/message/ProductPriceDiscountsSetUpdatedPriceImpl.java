
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Details about a Embedded Price that was updated due to a Discount. Specific to Product Price Discounts Set Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceDiscountsSetUpdatedPriceImpl implements ProductPriceDiscountsSetUpdatedPrice, ModelBase {

    private Integer variantId;

    private String variantKey;

    private String sku;

    private String priceId;

    private com.commercetools.api.models.common.DiscountedPrice discounted;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceDiscountsSetUpdatedPriceImpl(@JsonProperty("variantId") final Integer variantId,
            @JsonProperty("variantKey") final String variantKey, @JsonProperty("sku") final String sku,
            @JsonProperty("priceId") final String priceId,
            @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.variantKey = variantKey;
        this.sku = sku;
        this.priceId = priceId;
        this.discounted = discounted;
        this.staged = staged;
    }

    /**
     * create empty instance
     */
    public ProductPriceDiscountsSetUpdatedPriceImpl() {
    }

    /**
     *  <p>Unique identifier of the ProductVariant for which the Discount was set.</p>
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Key of the ProductVariant for which Discount was set.</p>
     */

    public String getVariantKey() {
        return this.variantKey;
    }

    /**
     *  <p>SKU of the ProductVariant for which Discount was set.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Unique identifier of the Price.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>Discounted Price for the ProductVariant for which Discount was set.</p>
     */

    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    /**
     *  <p>Whether the update was only applied to the staged ProductProjection.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    public void setVariantKey(final String variantKey) {
        this.variantKey = variantKey;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPriceDiscountsSetUpdatedPriceImpl that = (ProductPriceDiscountsSetUpdatedPriceImpl) o;

        return new EqualsBuilder().append(variantId, that.variantId)
                .append(variantKey, that.variantKey)
                .append(sku, that.sku)
                .append(priceId, that.priceId)
                .append(discounted, that.discounted)
                .append(staged, that.staged)
                .append(variantId, that.variantId)
                .append(variantKey, that.variantKey)
                .append(sku, that.sku)
                .append(priceId, that.priceId)
                .append(discounted, that.discounted)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(variantId)
                .append(variantKey)
                .append(sku)
                .append(priceId)
                .append(discounted)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("variantId", variantId)
                .append("variantKey", variantKey)
                .append("sku", sku)
                .append("priceId", priceId)
                .append("discounted", discounted)
                .append("staged", staged)
                .build();
    }

}
