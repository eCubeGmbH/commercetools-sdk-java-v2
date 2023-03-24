
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeEmailChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeEmailChange changeEmailChange = ChangeEmailChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeEmailChangeBuilder implements Builder<ChangeEmailChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>changeEmail</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeEmailChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeEmailChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeEmailChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeEmailChange with checking for non-null required values
     * @return ChangeEmailChange
     */
    public ChangeEmailChange build() {
        Objects.requireNonNull(change, ChangeEmailChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeEmailChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeEmailChange.class + ": nextValue is missing");
        return new ChangeEmailChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeEmailChange without checking for non-null required values
     * @return ChangeEmailChange
     */
    public ChangeEmailChange buildUnchecked() {
        return new ChangeEmailChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeEmailChangeBuilder of() {
        return new ChangeEmailChangeBuilder();
    }

    public static ChangeEmailChangeBuilder of(final ChangeEmailChange template) {
        ChangeEmailChangeBuilder builder = new ChangeEmailChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
