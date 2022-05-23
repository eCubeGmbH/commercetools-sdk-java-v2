
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CartDiscountValueRelativeDraft cartDiscountValueRelativeDraft = CartDiscountValueRelativeDraft.builder()
           .permyriad(0.3)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueRelativeDraftBuilder implements Builder<CartDiscountValueRelativeDraft> {

    private Long permyriad;

    public CartDiscountValueRelativeDraftBuilder permyriad(final Long permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    public Long getPermyriad() {
        return this.permyriad;
    }

    public CartDiscountValueRelativeDraft build() {
        Objects.requireNonNull(permyriad, CartDiscountValueRelativeDraft.class + ": permyriad is missing");
        return new CartDiscountValueRelativeDraftImpl(permyriad);
    }

    /**
     * builds CartDiscountValueRelativeDraft without checking for non null required values
     */
    public CartDiscountValueRelativeDraft buildUnchecked() {
        return new CartDiscountValueRelativeDraftImpl(permyriad);
    }

    public static CartDiscountValueRelativeDraftBuilder of() {
        return new CartDiscountValueRelativeDraftBuilder();
    }

    public static CartDiscountValueRelativeDraftBuilder of(final CartDiscountValueRelativeDraft template) {
        CartDiscountValueRelativeDraftBuilder builder = new CartDiscountValueRelativeDraftBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
