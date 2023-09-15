
package com.commercetools.api.models.me;

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
public class MyPaymentSetMethodInfoMethodActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(MyPaymentSetMethodInfoMethodActionBuilder builder) {
        MyPaymentSetMethodInfoMethodAction myPaymentSetMethodInfoMethodAction = builder.buildUnchecked();
        Assertions.assertThat(myPaymentSetMethodInfoMethodAction)
                .isInstanceOf(MyPaymentSetMethodInfoMethodAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { MyPaymentSetMethodInfoMethodAction.builder().method("method") } };
    }

    @Test
    public void method() {
        MyPaymentSetMethodInfoMethodAction value = MyPaymentSetMethodInfoMethodAction.of();
        value.setMethod("method");
        Assertions.assertThat(value.getMethod()).isEqualTo("method");
    }
}
