
package com.commercetools.api.models.review;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ReviewTransitionStateAction reviewTransitionStateAction = ReviewTransitionStateAction.builder()
           .state(stateBuilder -> stateBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewTransitionStateActionBuilder implements Builder<ReviewTransitionStateAction> {

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    @Nullable
    private Boolean force;

    public ReviewTransitionStateActionBuilder state(
            Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }

    public ReviewTransitionStateActionBuilder state(
            final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }

    public ReviewTransitionStateActionBuilder force(@Nullable final Boolean force) {
        this.force = force;
        return this;
    }

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    @Nullable
    public Boolean getForce() {
        return this.force;
    }

    public ReviewTransitionStateAction build() {
        Objects.requireNonNull(state, ReviewTransitionStateAction.class + ": state is missing");
        return new ReviewTransitionStateActionImpl(state, force);
    }

    /**
     * builds ReviewTransitionStateAction without checking for non null required values
     */
    public ReviewTransitionStateAction buildUnchecked() {
        return new ReviewTransitionStateActionImpl(state, force);
    }

    public static ReviewTransitionStateActionBuilder of() {
        return new ReviewTransitionStateActionBuilder();
    }

    public static ReviewTransitionStateActionBuilder of(final ReviewTransitionStateAction template) {
        ReviewTransitionStateActionBuilder builder = new ReviewTransitionStateActionBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
