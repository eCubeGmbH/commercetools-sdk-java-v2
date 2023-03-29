
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Parcel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Parcel parcel = Parcel.builder()
 *             .id("{id}")
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ParcelImpl.class)
public interface Parcel extends ParcelMixin, com.commercetools.api.models.Customizable<Parcel> {

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *
     * @return measurements
     */
    @Valid
    @JsonProperty("measurements")
    public ParcelMeasurements getMeasurements();

    /**
     *
     * @return trackingData
     */
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    /**
     *  <p>The delivery items contained in this parcel.</p>
     * @return items
     */
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    /**
     *  <p>Custom Fields of this parcel.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set createdAt
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     * set measurements
     * @param measurements value to be set
     */

    public void setMeasurements(final ParcelMeasurements measurements);

    /**
     * set trackingData
     * @param trackingData value to be set
     */

    public void setTrackingData(final TrackingData trackingData);

    /**
     *  <p>The delivery items contained in this parcel.</p>
     * @param items values to be set
     */

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    /**
     *  <p>The delivery items contained in this parcel.</p>
     * @param items values to be set
     */

    public void setItems(final List<DeliveryItem> items);

    /**
     *  <p>Custom Fields of this parcel.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of Parcel
     */
    public static Parcel of() {
        return new ParcelImpl();
    }

    /**
     * factory method to create a shallow copy Parcel
     * @param template instance to be copied
     * @return copy instance
     */
    public static Parcel of(final Parcel template) {
        ParcelImpl instance = new ParcelImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setMeasurements(template.getMeasurements());
        instance.setTrackingData(template.getTrackingData());
        instance.setItems(template.getItems());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of Parcel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Parcel deepCopy(@Nullable final Parcel template) {
        if (template == null) {
            return null;
        }
        ParcelImpl instance = new ParcelImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setMeasurements(
            com.commercetools.api.models.order.ParcelMeasurements.deepCopy(template.getMeasurements()));
        instance.setTrackingData(com.commercetools.api.models.order.TrackingData.deepCopy(template.getTrackingData()));
        instance.setItems(Optional.ofNullable(template.getItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.DeliveryItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for Parcel
     * @return builder
     */
    public static ParcelBuilder builder() {
        return ParcelBuilder.of();
    }

    /**
     * create builder for Parcel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ParcelBuilder builder(final Parcel template) {
        return ParcelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withParcel(Function<Parcel, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Parcel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Parcel>() {
            @Override
            public String toString() {
                return "TypeReference<Parcel>";
            }
        };
    }
}
