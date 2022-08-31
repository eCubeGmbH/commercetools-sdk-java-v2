
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.TrackingData;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Parcel TrackingData update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelTrackingDataUpdatedMessagePayload parcelTrackingDataUpdatedMessagePayload = ParcelTrackingDataUpdatedMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelTrackingDataUpdatedMessagePayloadImpl.class)
public interface ParcelTrackingDataUpdatedMessagePayload extends OrderMessagePayload {

    String PARCEL_TRACKING_DATA_UPDATED = "ParcelTrackingDataUpdated";

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    /**
     *  <p>Unique identifier of the Parcel.</p>
     */
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    /**
     *  <p>The Tracking Data that was added to the Parcel.</p>
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    @JsonProperty("shippingKey")
    public String getShippingKey();

    public void setDeliveryId(final String deliveryId);

    public void setParcelId(final String parcelId);

    public void setTrackingData(final TrackingData trackingData);

    public void setShippingKey(final String shippingKey);

    public static ParcelTrackingDataUpdatedMessagePayload of() {
        return new ParcelTrackingDataUpdatedMessagePayloadImpl();
    }

    public static ParcelTrackingDataUpdatedMessagePayload of(final ParcelTrackingDataUpdatedMessagePayload template) {
        ParcelTrackingDataUpdatedMessagePayloadImpl instance = new ParcelTrackingDataUpdatedMessagePayloadImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public static ParcelTrackingDataUpdatedMessagePayloadBuilder builder() {
        return ParcelTrackingDataUpdatedMessagePayloadBuilder.of();
    }

    public static ParcelTrackingDataUpdatedMessagePayloadBuilder builder(
            final ParcelTrackingDataUpdatedMessagePayload template) {
        return ParcelTrackingDataUpdatedMessagePayloadBuilder.of(template);
    }

    default <T> T withParcelTrackingDataUpdatedMessagePayload(
            Function<ParcelTrackingDataUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingDataUpdatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelTrackingDataUpdatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelTrackingDataUpdatedMessagePayload>";
            }
        };
    }
}
