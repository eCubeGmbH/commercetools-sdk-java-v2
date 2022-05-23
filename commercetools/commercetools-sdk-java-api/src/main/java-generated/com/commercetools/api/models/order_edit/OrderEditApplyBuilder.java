
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   OrderEditApply orderEditApply = OrderEditApply.builder()
           .editVersion(1)
           .resourceVersion(1)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditApplyBuilder implements Builder<OrderEditApply> {

    private Integer editVersion;

    private Integer resourceVersion;

    public OrderEditApplyBuilder editVersion(final Integer editVersion) {
        this.editVersion = editVersion;
        return this;
    }

    public OrderEditApplyBuilder resourceVersion(final Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public Integer getEditVersion() {
        return this.editVersion;
    }

    public Integer getResourceVersion() {
        return this.resourceVersion;
    }

    public OrderEditApply build() {
        Objects.requireNonNull(editVersion, OrderEditApply.class + ": editVersion is missing");
        Objects.requireNonNull(resourceVersion, OrderEditApply.class + ": resourceVersion is missing");
        return new OrderEditApplyImpl(editVersion, resourceVersion);
    }

    /**
     * builds OrderEditApply without checking for non null required values
     */
    public OrderEditApply buildUnchecked() {
        return new OrderEditApplyImpl(editVersion, resourceVersion);
    }

    public static OrderEditApplyBuilder of() {
        return new OrderEditApplyBuilder();
    }

    public static OrderEditApplyBuilder of(final OrderEditApply template) {
        OrderEditApplyBuilder builder = new OrderEditApplyBuilder();
        builder.editVersion = template.getEditVersion();
        builder.resourceVersion = template.getResourceVersion();
        return builder;
    }

}
