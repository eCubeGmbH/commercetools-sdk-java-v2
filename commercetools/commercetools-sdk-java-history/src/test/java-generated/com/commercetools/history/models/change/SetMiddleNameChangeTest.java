
package com.commercetools.history.models.change;

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
public class SetMiddleNameChangeTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SetMiddleNameChangeBuilder builder) {
        SetMiddleNameChange setMiddleNameChange = builder.buildUnchecked();
        Assertions.assertThat(setMiddleNameChange).isInstanceOf(SetMiddleNameChange.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SetMiddleNameChange.builder().change("change") },
                new Object[] { SetMiddleNameChange.builder().previousValue("previousValue") },
                new Object[] { SetMiddleNameChange.builder().nextValue("nextValue") } };
    }

    @Test
    public void change() {
        SetMiddleNameChange value = SetMiddleNameChange.of();
        value.setChange("change");
        Assertions.assertThat(value.getChange()).isEqualTo("change");
    }

    @Test
    public void previousValue() {
        SetMiddleNameChange value = SetMiddleNameChange.of();
        value.setPreviousValue("previousValue");
        Assertions.assertThat(value.getPreviousValue()).isEqualTo("previousValue");
    }

    @Test
    public void nextValue() {
        SetMiddleNameChange value = SetMiddleNameChange.of();
        value.setNextValue("nextValue");
        Assertions.assertThat(value.getNextValue()).isEqualTo("nextValue");
    }
}
