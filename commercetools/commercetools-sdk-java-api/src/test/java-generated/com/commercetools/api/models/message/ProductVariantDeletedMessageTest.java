
package com.commercetools.api.models.message;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ProductVariantDeletedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantDeletedMessageBuilder builder) {
        ProductVariantDeletedMessage productVariantDeletedMessage = builder.buildUnchecked();
        Assertions.assertThat(productVariantDeletedMessage).isInstanceOf(ProductVariantDeletedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProductVariantDeletedMessage.builder()
                        .variant(new com.commercetools.api.models.product.ProductVariantImpl()) },
                new Object[] { ProductVariantDeletedMessage.builder()
                        .removedImageUrls(Collections.singletonList("removedImageUrls")) } };
    }

    @Test
    public void variant() {
        ProductVariantDeletedMessage value = ProductVariantDeletedMessage.of();
        value.setVariant(new com.commercetools.api.models.product.ProductVariantImpl());
        Assertions.assertThat(value.getVariant())
                .isEqualTo(new com.commercetools.api.models.product.ProductVariantImpl());
    }

    @Test
    public void removedImageUrls() {
        ProductVariantDeletedMessage value = ProductVariantDeletedMessage.of();
        value.setRemovedImageUrls(Collections.singletonList("removedImageUrls"));
        Assertions.assertThat(value.getRemovedImageUrls()).isEqualTo(Collections.singletonList("removedImageUrls"));
    }
}
