
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDeletedMessagePayload productDeletedMessagePayload = ProductDeletedMessagePayload.builder()
 *             .plusRemovedImageUrls(removedImageUrlsBuilder -> removedImageUrlsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDeletedMessagePayloadBuilder implements Builder<ProductDeletedMessagePayload> {

    private java.util.List<String> removedImageUrls;

    @Nullable
    private com.commercetools.api.models.product.ProductProjection currentProjection;

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     */

    public ProductDeletedMessagePayloadBuilder removedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     */

    public ProductDeletedMessagePayloadBuilder removedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        return this;
    }

    /**
     *  <p>List of image URLs that were removed during the Delete Product request.</p>
     */

    public ProductDeletedMessagePayloadBuilder plusRemovedImageUrls(final String... removedImageUrls) {
        if (this.removedImageUrls == null) {
            this.removedImageUrls = new ArrayList<>();
        }
        this.removedImageUrls.addAll(Arrays.asList(removedImageUrls));
        return this;
    }

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     */

    public ProductDeletedMessagePayloadBuilder currentProjection(
            Function<com.commercetools.api.models.product.ProductProjectionBuilder, com.commercetools.api.models.product.ProductProjectionBuilder> builder) {
        this.currentProjection = builder.apply(com.commercetools.api.models.product.ProductProjectionBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Current Product Projection of the deleted Product.</p>
     */

    public ProductDeletedMessagePayloadBuilder currentProjection(
            @Nullable final com.commercetools.api.models.product.ProductProjection currentProjection) {
        this.currentProjection = currentProjection;
        return this;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    @Nullable
    public com.commercetools.api.models.product.ProductProjection getCurrentProjection() {
        return this.currentProjection;
    }

    public ProductDeletedMessagePayload build() {
        Objects.requireNonNull(removedImageUrls, ProductDeletedMessagePayload.class + ": removedImageUrls is missing");
        return new ProductDeletedMessagePayloadImpl(removedImageUrls, currentProjection);
    }

    /**
     * builds ProductDeletedMessagePayload without checking for non null required values
     */
    public ProductDeletedMessagePayload buildUnchecked() {
        return new ProductDeletedMessagePayloadImpl(removedImageUrls, currentProjection);
    }

    public static ProductDeletedMessagePayloadBuilder of() {
        return new ProductDeletedMessagePayloadBuilder();
    }

    public static ProductDeletedMessagePayloadBuilder of(final ProductDeletedMessagePayload template) {
        ProductDeletedMessagePayloadBuilder builder = new ProductDeletedMessagePayloadBuilder();
        builder.removedImageUrls = template.getRemovedImageUrls();
        builder.currentProjection = template.getCurrentProjection();
        return builder;
    }

}
