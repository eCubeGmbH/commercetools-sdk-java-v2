
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetFirstNameChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetFirstNameChange setFirstNameChange = SetFirstNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetFirstNameChangeBuilder implements Builder<SetFirstNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Shape of the action for <code>setFirstName</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetFirstNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetFirstNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetFirstNameChangeBuilder nextValue(final String nextValue) {
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
     * builds SetFirstNameChange with checking for non-null required values
     * @return SetFirstNameChange
     */
    public SetFirstNameChange build() {
        Objects.requireNonNull(change, SetFirstNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetFirstNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetFirstNameChange.class + ": nextValue is missing");
        return new SetFirstNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetFirstNameChange without checking for non-null required values
     * @return SetFirstNameChange
     */
    public SetFirstNameChange buildUnchecked() {
        return new SetFirstNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetFirstNameChangeBuilder of() {
        return new SetFirstNameChangeBuilder();
    }

    public static SetFirstNameChangeBuilder of(final SetFirstNameChange template) {
        SetFirstNameChangeBuilder builder = new SetFirstNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
