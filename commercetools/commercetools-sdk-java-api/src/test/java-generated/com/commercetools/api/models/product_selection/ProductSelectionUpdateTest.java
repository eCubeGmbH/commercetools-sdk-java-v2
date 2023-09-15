
package com.commercetools.api.models.product_selection;

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
public class ProductSelectionUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionUpdateBuilder builder) {
        ProductSelectionUpdate productSelectionUpdate = builder.buildUnchecked();
        Assertions.assertThat(productSelectionUpdate).isInstanceOf(ProductSelectionUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionUpdate.builder().version(2L) },
                new Object[] { ProductSelectionUpdate.builder()
                        .actions(Collections.singletonList(
                            new com.commercetools.api.models.product_selection.ProductSelectionUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        ProductSelectionUpdate value = ProductSelectionUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        ProductSelectionUpdate value = ProductSelectionUpdate.of();
        value.setActions(Collections
                .singletonList(new com.commercetools.api.models.product_selection.ProductSelectionUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.api.models.product_selection.ProductSelectionUpdateActionImpl()));
    }
}
