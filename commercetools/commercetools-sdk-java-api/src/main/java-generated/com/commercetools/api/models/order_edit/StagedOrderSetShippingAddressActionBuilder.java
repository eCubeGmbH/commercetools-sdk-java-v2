
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingAddressActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressAction stagedOrderSetShippingAddressAction = StagedOrderSetShippingAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingAddressActionBuilder implements Builder<StagedOrderSetShippingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return Builder
     */

    public StagedOrderSetShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address
     * @return Builder
     */

    public StagedOrderSetShippingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public StagedOrderSetShippingAddressAction build() {
        return new StagedOrderSetShippingAddressActionImpl(address);
    }

    /**
     * builds StagedOrderSetShippingAddressAction without checking for non null required values
     */
    public StagedOrderSetShippingAddressAction buildUnchecked() {
        return new StagedOrderSetShippingAddressActionImpl(address);
    }

    public static StagedOrderSetShippingAddressActionBuilder of() {
        return new StagedOrderSetShippingAddressActionBuilder();
    }

    public static StagedOrderSetShippingAddressActionBuilder of(final StagedOrderSetShippingAddressAction template) {
        StagedOrderSetShippingAddressActionBuilder builder = new StagedOrderSetShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
