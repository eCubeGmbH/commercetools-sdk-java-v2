
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ZoneRateDraft zoneRateDraft = ZoneRateDraft.builder()
           .zone(zoneBuilder -> zoneBuilder)
           .plusShippingRates(shippingRatesBuilder -> shippingRatesBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneRateDraftBuilder implements Builder<ZoneRateDraft> {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates;

    public ZoneRateDraftBuilder zone(
            Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }

    public ZoneRateDraftBuilder zone(final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    /**
     *  <p>The array must not contain two shipping rates with the same currency.</p>
     */

    public ZoneRateDraftBuilder shippingRates(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft... shippingRates) {
        this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
        return this;
    }

    /**
     *  <p>The array must not contain two shipping rates with the same currency.</p>
     */

    public ZoneRateDraftBuilder shippingRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates) {
        this.shippingRates = shippingRates;
        return this;
    }

    /**
     *  <p>The array must not contain two shipping rates with the same currency.</p>
     */

    public ZoneRateDraftBuilder plusShippingRates(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft... shippingRates) {
        if (this.shippingRates == null) {
            this.shippingRates = new ArrayList<>();
        }
        this.shippingRates.addAll(Arrays.asList(shippingRates));
        return this;
    }

    /**
     *  <p>The array must not contain two shipping rates with the same currency.</p>
     */

    public ZoneRateDraftBuilder plusShippingRates(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        if (this.shippingRates == null) {
            this.shippingRates = new ArrayList<>();
        }
        this.shippingRates
                .add(builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The array must not contain two shipping rates with the same currency.</p>
     */

    public ZoneRateDraftBuilder withShippingRates(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRates = new ArrayList<>();
        this.shippingRates
                .add(builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> getShippingRates() {
        return this.shippingRates;
    }

    public ZoneRateDraft build() {
        Objects.requireNonNull(zone, ZoneRateDraft.class + ": zone is missing");
        Objects.requireNonNull(shippingRates, ZoneRateDraft.class + ": shippingRates is missing");
        return new ZoneRateDraftImpl(zone, shippingRates);
    }

    /**
     * builds ZoneRateDraft without checking for non null required values
     */
    public ZoneRateDraft buildUnchecked() {
        return new ZoneRateDraftImpl(zone, shippingRates);
    }

    public static ZoneRateDraftBuilder of() {
        return new ZoneRateDraftBuilder();
    }

    public static ZoneRateDraftBuilder of(final ZoneRateDraft template) {
        ZoneRateDraftBuilder builder = new ZoneRateDraftBuilder();
        builder.zone = template.getZone();
        builder.shippingRates = template.getShippingRates();
        return builder;
    }

}
