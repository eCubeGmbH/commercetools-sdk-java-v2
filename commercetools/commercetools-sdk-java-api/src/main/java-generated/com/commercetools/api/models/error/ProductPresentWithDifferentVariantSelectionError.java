
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a Product is already assigned to a Product Selection, but the Product Selection has either a different Product Variant Selection or a different Product Variant Exclusion.</p>
 *  <p>The error is returned as a failed response either to the Add Product or to the Exclude Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPresentWithDifferentVariantSelectionError productPresentWithDifferentVariantSelectionError = ProductPresentWithDifferentVariantSelectionError.builder()
 *             .message("{message}")
 *             .product(productBuilder -> productBuilder)
 *             .existingVariantSelection(existingVariantSelectionBuilder -> existingVariantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPresentWithDifferentVariantSelectionErrorImpl.class)
public interface ProductPresentWithDifferentVariantSelectionError extends ErrorObject {

    String PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION = "ProductPresentWithDifferentVariantSelection";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Product is already present with the following different $variantSelections."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("existingVariantSelection")
    public ProductVariantSelection getExistingVariantSelection();

    public void setMessage(final String message);

    public void setProduct(final ProductReference product);

    public void setExistingVariantSelection(final ProductVariantSelection existingVariantSelection);

    public static ProductPresentWithDifferentVariantSelectionError of() {
        return new ProductPresentWithDifferentVariantSelectionErrorImpl();
    }

    public static ProductPresentWithDifferentVariantSelectionError of(
            final ProductPresentWithDifferentVariantSelectionError template) {
        ProductPresentWithDifferentVariantSelectionErrorImpl instance = new ProductPresentWithDifferentVariantSelectionErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setProduct(template.getProduct());
        instance.setExistingVariantSelection(template.getExistingVariantSelection());
        return instance;
    }

    public static ProductPresentWithDifferentVariantSelectionErrorBuilder builder() {
        return ProductPresentWithDifferentVariantSelectionErrorBuilder.of();
    }

    public static ProductPresentWithDifferentVariantSelectionErrorBuilder builder(
            final ProductPresentWithDifferentVariantSelectionError template) {
        return ProductPresentWithDifferentVariantSelectionErrorBuilder.of(template);
    }

    default <T> T withProductPresentWithDifferentVariantSelectionError(
            Function<ProductPresentWithDifferentVariantSelectionError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPresentWithDifferentVariantSelectionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPresentWithDifferentVariantSelectionError>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPresentWithDifferentVariantSelectionError>";
            }
        };
    }
}
