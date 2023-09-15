
package com.commercetools.api.models.order;

import java.time.ZonedDateTime;
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
public class OrderAddReturnInfoActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(OrderAddReturnInfoActionBuilder builder) {
        OrderAddReturnInfoAction orderAddReturnInfoAction = builder.buildUnchecked();
        Assertions.assertThat(orderAddReturnInfoAction).isInstanceOf(OrderAddReturnInfoAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { OrderAddReturnInfoAction.builder().returnTrackingId("returnTrackingId") },
                new Object[] {
                        OrderAddReturnInfoAction.builder()
                                .items(Collections
                                        .singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl())) },
                new Object[] {
                        OrderAddReturnInfoAction.builder().returnDate(ZonedDateTime.parse("2023-06-01T12:00Z")) } };
    }

    @Test
    public void returnTrackingId() {
        OrderAddReturnInfoAction value = OrderAddReturnInfoAction.of();
        value.setReturnTrackingId("returnTrackingId");
        Assertions.assertThat(value.getReturnTrackingId()).isEqualTo("returnTrackingId");
    }

    @Test
    public void items() {
        OrderAddReturnInfoAction value = OrderAddReturnInfoAction.of();
        value.setItems(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
        Assertions.assertThat(value.getItems())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnItemDraftImpl()));
    }

    @Test
    public void returnDate() {
        OrderAddReturnInfoAction value = OrderAddReturnInfoAction.of();
        value.setReturnDate(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getReturnDate()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }
}
