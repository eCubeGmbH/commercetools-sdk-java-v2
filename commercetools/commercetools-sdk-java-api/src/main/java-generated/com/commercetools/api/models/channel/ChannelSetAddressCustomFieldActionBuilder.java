
package com.commercetools.api.models.channel;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetAddressCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetAddressCustomFieldAction channelSetAddressCustomFieldAction = ChannelSetAddressCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelSetAddressCustomFieldActionBuilder implements Builder<ChannelSetAddressCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name
     * @return Builder
     */

    public ChannelSetAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Specifies the format of the value of the Custom Field defined by <code>name</code>. If <code>value</code> is absent or <code>null</code>, this field will be removed, if it exists. Removing a field that does not exist returns an InvalidOperation error.</p>
     * @param value
     * @return Builder
     */

    public ChannelSetAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public ChannelSetAddressCustomFieldAction build() {
        Objects.requireNonNull(name, ChannelSetAddressCustomFieldAction.class + ": name is missing");
        return new ChannelSetAddressCustomFieldActionImpl(name, value);
    }

    /**
     * builds ChannelSetAddressCustomFieldAction without checking for non null required values
     */
    public ChannelSetAddressCustomFieldAction buildUnchecked() {
        return new ChannelSetAddressCustomFieldActionImpl(name, value);
    }

    public static ChannelSetAddressCustomFieldActionBuilder of() {
        return new ChannelSetAddressCustomFieldActionBuilder();
    }

    public static ChannelSetAddressCustomFieldActionBuilder of(final ChannelSetAddressCustomFieldAction template) {
        ChannelSetAddressCustomFieldActionBuilder builder = new ChannelSetAddressCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
