
package com.commercetools.history.models.common;

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
public class SyncInfoTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SyncInfoBuilder builder) {
        SyncInfo syncInfo = builder.buildUnchecked();
        Assertions.assertThat(syncInfo).isInstanceOf(SyncInfo.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] {
                        SyncInfo.builder().channel(new com.commercetools.history.models.common.ReferenceImpl()) },
                new Object[] { SyncInfo.builder().externalId("externalId") },
                new Object[] { SyncInfo.builder().syncedAt("syncedAt") } };
    }

    @Test
    public void channel() {
        SyncInfo value = SyncInfo.of();
        value.setChannel(new com.commercetools.history.models.common.ReferenceImpl());
        Assertions.assertThat(value.getChannel())
                .isEqualTo(new com.commercetools.history.models.common.ReferenceImpl());
    }

    @Test
    public void externalId() {
        SyncInfo value = SyncInfo.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void syncedAt() {
        SyncInfo value = SyncInfo.of();
        value.setSyncedAt("syncedAt");
        Assertions.assertThat(value.getSyncedAt()).isEqualTo("syncedAt");
    }
}
