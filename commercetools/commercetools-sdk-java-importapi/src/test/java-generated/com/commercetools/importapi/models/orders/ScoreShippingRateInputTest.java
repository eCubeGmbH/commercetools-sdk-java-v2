
package com.commercetools.importapi.models.orders;

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
public class ScoreShippingRateInputTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ScoreShippingRateInputBuilder builder) {
        ScoreShippingRateInput scoreShippingRateInput = builder.buildUnchecked();
        Assertions.assertThat(scoreShippingRateInput).isInstanceOf(ScoreShippingRateInput.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ScoreShippingRateInput.builder().score(0.9551507) } };
    }

    @Test
    public void score() {
        ScoreShippingRateInput value = ScoreShippingRateInput.of();
        value.setScore(0.9551507);
        Assertions.assertThat(value.getScore()).isEqualTo(0.9551507);
    }
}
