
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * OrderUpdateSyncInfoAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderUpdateSyncInfoActionImpl implements OrderUpdateSyncInfoAction, ModelBase {

    private String action;

    private String externalId;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private java.time.ZonedDateTime syncedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderUpdateSyncInfoActionImpl(@JsonProperty("externalId") final String externalId,
            @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelResourceIdentifier channel,
            @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
        this.externalId = externalId;
        this.channel = channel;
        this.syncedAt = syncedAt;
        this.action = UPDATE_SYNC_INFO;
    }

    /**
     * create empty instance
     */
    public OrderUpdateSyncInfoActionImpl() {
        this.action = UPDATE_SYNC_INFO;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Set this to identify an external order instance, file, or other resource.</p>
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>The synchronization destination to set. Must not be empty. The referenced Channel must have the Channel Role <code>OrderExport</code> or <code>OrderImport</code>. Otherwise this update action returns an InvalidInput error.</p>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <p>If not set, it defaults to the current date and time.</p>
     */

    public java.time.ZonedDateTime getSyncedAt() {
        return this.syncedAt;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
    }

    public void setSyncedAt(final java.time.ZonedDateTime syncedAt) {
        this.syncedAt = syncedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderUpdateSyncInfoActionImpl that = (OrderUpdateSyncInfoActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(externalId, that.externalId)
                .append(channel, that.channel)
                .append(syncedAt, that.syncedAt)
                .append(action, that.action)
                .append(externalId, that.externalId)
                .append(channel, that.channel)
                .append(syncedAt, that.syncedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(externalId)
                .append(channel)
                .append(syncedAt)
                .toHashCode();
    }

}
