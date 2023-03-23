
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductCatalogDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductCatalogData productCatalogData = ProductCatalogData.builder()
 *             .published(true)
 *             .current(currentBuilder -> currentBuilder)
 *             .staged(stagedBuilder -> stagedBuilder)
 *             .hasStagedChanges(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductCatalogDataBuilder implements Builder<ProductCatalogData> {

    private Boolean published;

    private com.commercetools.api.models.product.ProductData current;

    private com.commercetools.api.models.product.ProductData staged;

    private Boolean hasStagedChanges;

    /**
     *  <p><code>true</code> if the Product is published.</p>
     * @param published
     * @return Builder
     */

    public ProductCatalogDataBuilder published(final Boolean published) {
        this.published = published;
        return this;
    }

    /**
     *  <p>Current (published) data of the Product.</p>
     * @return Builder
     */

    public ProductCatalogDataBuilder current(
            Function<com.commercetools.api.models.product.ProductDataBuilder, com.commercetools.api.models.product.ProductDataBuilder> builder) {
        this.current = builder.apply(com.commercetools.api.models.product.ProductDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Current (published) data of the Product.</p>
     * @param current
     * @return Builder
     */

    public ProductCatalogDataBuilder current(final com.commercetools.api.models.product.ProductData current) {
        this.current = current;
        return this;
    }

    /**
     *  <p>Staged (unpublished) data of the Product.</p>
     * @return Builder
     */

    public ProductCatalogDataBuilder staged(
            Function<com.commercetools.api.models.product.ProductDataBuilder, com.commercetools.api.models.product.ProductDataBuilder> builder) {
        this.staged = builder.apply(com.commercetools.api.models.product.ProductDataBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Staged (unpublished) data of the Product.</p>
     * @param staged
     * @return Builder
     */

    public ProductCatalogDataBuilder staged(final com.commercetools.api.models.product.ProductData staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p><code>true</code> if the <code>staged</code> data is different from the <code>current</code> data.</p>
     * @param hasStagedChanges
     * @return Builder
     */

    public ProductCatalogDataBuilder hasStagedChanges(final Boolean hasStagedChanges) {
        this.hasStagedChanges = hasStagedChanges;
        return this;
    }

    public Boolean getPublished() {
        return this.published;
    }

    public com.commercetools.api.models.product.ProductData getCurrent() {
        return this.current;
    }

    public com.commercetools.api.models.product.ProductData getStaged() {
        return this.staged;
    }

    public Boolean getHasStagedChanges() {
        return this.hasStagedChanges;
    }

    public ProductCatalogData build() {
        Objects.requireNonNull(published, ProductCatalogData.class + ": published is missing");
        Objects.requireNonNull(current, ProductCatalogData.class + ": current is missing");
        Objects.requireNonNull(staged, ProductCatalogData.class + ": staged is missing");
        Objects.requireNonNull(hasStagedChanges, ProductCatalogData.class + ": hasStagedChanges is missing");
        return new ProductCatalogDataImpl(published, current, staged, hasStagedChanges);
    }

    /**
     * builds ProductCatalogData without checking for non null required values
     */
    public ProductCatalogData buildUnchecked() {
        return new ProductCatalogDataImpl(published, current, staged, hasStagedChanges);
    }

    public static ProductCatalogDataBuilder of() {
        return new ProductCatalogDataBuilder();
    }

    public static ProductCatalogDataBuilder of(final ProductCatalogData template) {
        ProductCatalogDataBuilder builder = new ProductCatalogDataBuilder();
        builder.published = template.getPublished();
        builder.current = template.getCurrent();
        builder.staged = template.getStaged();
        builder.hasStagedChanges = template.getHasStagedChanges();
        return builder;
    }

}
