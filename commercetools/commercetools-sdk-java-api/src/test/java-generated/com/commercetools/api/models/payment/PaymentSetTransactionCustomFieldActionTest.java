
package com.commercetools.api.models.payment;

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
public class PaymentSetTransactionCustomFieldActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(PaymentSetTransactionCustomFieldActionBuilder builder) {
        PaymentSetTransactionCustomFieldAction paymentSetTransactionCustomFieldAction = builder.buildUnchecked();
        Assertions.assertThat(paymentSetTransactionCustomFieldAction)
                .isInstanceOf(PaymentSetTransactionCustomFieldAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { PaymentSetTransactionCustomFieldAction.builder().transactionId("transactionId") },
                new Object[] { PaymentSetTransactionCustomFieldAction.builder().name("name") },
                new Object[] { PaymentSetTransactionCustomFieldAction.builder().value("value") } };
    }

    @Test
    public void transactionId() {
        PaymentSetTransactionCustomFieldAction value = PaymentSetTransactionCustomFieldAction.of();
        value.setTransactionId("transactionId");
        Assertions.assertThat(value.getTransactionId()).isEqualTo("transactionId");
    }

    @Test
    public void name() {
        PaymentSetTransactionCustomFieldAction value = PaymentSetTransactionCustomFieldAction.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        PaymentSetTransactionCustomFieldAction value = PaymentSetTransactionCustomFieldAction.of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }
}
