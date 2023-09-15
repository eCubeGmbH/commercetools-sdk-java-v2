
package com.commercetools.api.models.product_selection;

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
public class ProductSelectionResourceIdentifierTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSelectionResourceIdentifierBuilder builder) {
        ProductSelectionResourceIdentifier productSelectionResourceIdentifier = builder.buildUnchecked();
        Assertions.assertThat(productSelectionResourceIdentifier)
                .isInstanceOf(ProductSelectionResourceIdentifier.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSelectionResourceIdentifier.builder().id("id") },
                new Object[] { ProductSelectionResourceIdentifier.builder().key("key") } };
    }

    @Test
    public void id() {
        ProductSelectionResourceIdentifier value = ProductSelectionResourceIdentifier.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        ProductSelectionResourceIdentifier value = ProductSelectionResourceIdentifier.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
