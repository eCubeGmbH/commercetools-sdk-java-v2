
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemoveCustomLineItemActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemoveCustomLineItemAction stagedOrderRemoveCustomLineItemAction = StagedOrderRemoveCustomLineItemAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderRemoveCustomLineItemActionBuilder implements Builder<StagedOrderRemoveCustomLineItemAction> {

    private String customLineItemId;

    /**
     *
     * @param customLineItemId value to be set
     * @return Builder
     */

    public StagedOrderRemoveCustomLineItemActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     * builds StagedOrderRemoveCustomLineItemAction with checking for non-null required values
     * @return StagedOrderRemoveCustomLineItemAction
     */
    public StagedOrderRemoveCustomLineItemAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderRemoveCustomLineItemAction.class + ": customLineItemId is missing");
        return new StagedOrderRemoveCustomLineItemActionImpl(customLineItemId);
    }

    /**
     * builds StagedOrderRemoveCustomLineItemAction without checking for non-null required values
     * @return StagedOrderRemoveCustomLineItemAction
     */
    public StagedOrderRemoveCustomLineItemAction buildUnchecked() {
        return new StagedOrderRemoveCustomLineItemActionImpl(customLineItemId);
    }

    public static StagedOrderRemoveCustomLineItemActionBuilder of() {
        return new StagedOrderRemoveCustomLineItemActionBuilder();
    }

    public static StagedOrderRemoveCustomLineItemActionBuilder of(
            final StagedOrderRemoveCustomLineItemAction template) {
        StagedOrderRemoveCustomLineItemActionBuilder builder = new StagedOrderRemoveCustomLineItemActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        return builder;
    }

}
