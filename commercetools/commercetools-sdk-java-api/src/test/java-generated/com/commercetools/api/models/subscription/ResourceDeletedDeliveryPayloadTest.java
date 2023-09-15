
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;

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
public class ResourceDeletedDeliveryPayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ResourceDeletedDeliveryPayloadBuilder builder) {
        ResourceDeletedDeliveryPayload resourceDeletedDeliveryPayload = builder.buildUnchecked();
        Assertions.assertThat(resourceDeletedDeliveryPayload).isInstanceOf(ResourceDeletedDeliveryPayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ResourceDeletedDeliveryPayload.builder().version(2L) },
                new Object[] {
                        ResourceDeletedDeliveryPayload.builder().modifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ResourceDeletedDeliveryPayload.builder().dataErasure(true) } };
    }

    @Test
    public void version() {
        ResourceDeletedDeliveryPayload value = ResourceDeletedDeliveryPayload.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void modifiedAt() {
        ResourceDeletedDeliveryPayload value = ResourceDeletedDeliveryPayload.of();
        value.setModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void dataErasure() {
        ResourceDeletedDeliveryPayload value = ResourceDeletedDeliveryPayload.of();
        value.setDataErasure(true);
        Assertions.assertThat(value.getDataErasure()).isEqualTo(true);
    }
}
