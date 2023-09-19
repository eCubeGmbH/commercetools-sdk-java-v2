
package com.commercetools.api.models.message;

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
public class ApprovalFlowApprovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalFlowApprovedMessagePayloadBuilder builder) {
        ApprovalFlowApprovedMessagePayload approvalFlowApprovedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(approvalFlowApprovedMessagePayload)
                .isInstanceOf(ApprovalFlowApprovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ApprovalFlowApprovedMessagePayload.builder()
                        .associate(new com.commercetools.api.models.customer.CustomerReferenceImpl()) },
                new Object[] { ApprovalFlowApprovedMessagePayload.builder()
                        .order(new com.commercetools.api.models.order.OrderReferenceImpl()) } };
    }

    @Test
    public void associate() {
        ApprovalFlowApprovedMessagePayload value = ApprovalFlowApprovedMessagePayload.of();
        value.setAssociate(new com.commercetools.api.models.customer.CustomerReferenceImpl());
        Assertions.assertThat(value.getAssociate())
                .isEqualTo(new com.commercetools.api.models.customer.CustomerReferenceImpl());
    }

    @Test
    public void order() {
        ApprovalFlowApprovedMessagePayload value = ApprovalFlowApprovedMessagePayload.of();
        value.setOrder(new com.commercetools.api.models.order.OrderReferenceImpl());
        Assertions.assertThat(value.getOrder()).isEqualTo(new com.commercetools.api.models.order.OrderReferenceImpl());
    }
}
