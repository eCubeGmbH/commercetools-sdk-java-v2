
package com.commercetools.history.models.change_value;

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
public class TextLineItemValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(TextLineItemValueBuilder builder) {
        TextLineItemValue textLineItemValue = builder.buildUnchecked();
        Assertions.assertThat(textLineItemValue).isInstanceOf(TextLineItemValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { TextLineItemValue.builder().id("id") }, new Object[] {
                TextLineItemValue.builder().name(new com.commercetools.history.models.common.LocalizedStringImpl()) } };
    }

    @Test
    public void id() {
        TextLineItemValue value = TextLineItemValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void name() {
        TextLineItemValue value = TextLineItemValue.of();
        value.setName(new com.commercetools.history.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName())
                .isEqualTo(new com.commercetools.history.models.common.LocalizedStringImpl());
    }
}
