
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetPurchaseOrderNumberActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetPurchaseOrderNumberAction stagedOrderSetPurchaseOrderNumberAction = StagedOrderSetPurchaseOrderNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetPurchaseOrderNumberActionBuilder
        implements Builder<StagedOrderSetPurchaseOrderNumberAction> {

    @Nullable
    private String purchaseOrderNumber;

    /**
     *  <p>Identifier for a purchase order, usually in a B2B context. The Purchase Order Number is typically entered by the Buyer and can also be used with Quotes.</p>
     */

    public StagedOrderSetPurchaseOrderNumberActionBuilder purchaseOrderNumber(
            @Nullable final String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
        return this;
    }

    @Nullable
    public String getPurchaseOrderNumber() {
        return this.purchaseOrderNumber;
    }

    public StagedOrderSetPurchaseOrderNumberAction build() {
        return new StagedOrderSetPurchaseOrderNumberActionImpl(purchaseOrderNumber);
    }

    /**
     * builds StagedOrderSetPurchaseOrderNumberAction without checking for non null required values
     */
    public StagedOrderSetPurchaseOrderNumberAction buildUnchecked() {
        return new StagedOrderSetPurchaseOrderNumberActionImpl(purchaseOrderNumber);
    }

    public static StagedOrderSetPurchaseOrderNumberActionBuilder of() {
        return new StagedOrderSetPurchaseOrderNumberActionBuilder();
    }

    public static StagedOrderSetPurchaseOrderNumberActionBuilder of(
            final StagedOrderSetPurchaseOrderNumberAction template) {
        StagedOrderSetPurchaseOrderNumberActionBuilder builder = new StagedOrderSetPurchaseOrderNumberActionBuilder();
        builder.purchaseOrderNumber = template.getPurchaseOrderNumber();
        return builder;
    }

}
