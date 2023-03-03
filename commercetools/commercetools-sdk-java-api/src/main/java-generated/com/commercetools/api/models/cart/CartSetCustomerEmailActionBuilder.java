
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomerEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomerEmailAction cartSetCustomerEmailAction = CartSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomerEmailActionBuilder implements Builder<CartSetCustomerEmailAction> {

    @Nullable
    private String email;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public CartSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public CartSetCustomerEmailAction build() {
        return new CartSetCustomerEmailActionImpl(email);
    }

    /**
     * builds CartSetCustomerEmailAction without checking for non null required values
     */
    public CartSetCustomerEmailAction buildUnchecked() {
        return new CartSetCustomerEmailActionImpl(email);
    }

    public static CartSetCustomerEmailActionBuilder of() {
        return new CartSetCustomerEmailActionBuilder();
    }

    public static CartSetCustomerEmailActionBuilder of(final CartSetCustomerEmailAction template) {
        CartSetCustomerEmailActionBuilder builder = new CartSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
