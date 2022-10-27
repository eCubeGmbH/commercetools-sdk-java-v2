
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchSortingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSearchSorting orderSearchSorting = OrderSearchSorting.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSearchSortingBuilder implements Builder<OrderSearchSorting> {

    public OrderSearchSorting build() {
        return new OrderSearchSortingImpl();
    }

    /**
     * builds OrderSearchSorting without checking for non null required values
     */
    public OrderSearchSorting buildUnchecked() {
        return new OrderSearchSortingImpl();
    }

    public static OrderSearchSortingBuilder of() {
        return new OrderSearchSortingBuilder();
    }

    public static OrderSearchSortingBuilder of(final OrderSearchSorting template) {
        OrderSearchSortingBuilder builder = new OrderSearchSortingBuilder();
        return builder;
    }

}
