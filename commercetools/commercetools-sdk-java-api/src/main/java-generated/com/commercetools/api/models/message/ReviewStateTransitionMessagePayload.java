
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Transition State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewStateTransitionMessagePayload reviewStateTransitionMessagePayload = ReviewStateTransitionMessagePayload.builder()
 *             .newState(newStateBuilder -> newStateBuilder)
 *             .oldIncludedInStatistics(true)
 *             .newIncludedInStatistics(true)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewStateTransitionMessagePayloadImpl.class)
public interface ReviewStateTransitionMessagePayload extends MessagePayload {

    String REVIEW_STATE_TRANSITION = "ReviewStateTransition";

    /**
     *  <p>State of the Review before the Transition State update action.</p>
     */
    @Valid
    @JsonProperty("oldState")
    public StateReference getOldState();

    /**
     *  <p>State of the Review after the Transition State update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("newState")
    public StateReference getNewState();

    /**
     *  <p>Whether the old Review was taken into account in the rating statistics of the target before the state transition.</p>
     */
    @NotNull
    @JsonProperty("oldIncludedInStatistics")
    public Boolean getOldIncludedInStatistics();

    /**
     *  <p>Whether the new Review was taken into account in the rating statistics of the target after the state transition.</p>
     */
    @NotNull
    @JsonProperty("newIncludedInStatistics")
    public Boolean getNewIncludedInStatistics();

    /**
     *  <p>Reference to the resource that the Review belongs to.</p>
     */
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    /**
     *  <p>Whether State transition validations were turned off during the Transition State update action.</p>
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setOldState(final StateReference oldState);

    public void setNewState(final StateReference newState);

    public void setOldIncludedInStatistics(final Boolean oldIncludedInStatistics);

    public void setNewIncludedInStatistics(final Boolean newIncludedInStatistics);

    public void setTarget(final Reference target);

    public void setForce(final Boolean force);

    public static ReviewStateTransitionMessagePayload of() {
        return new ReviewStateTransitionMessagePayloadImpl();
    }

    public static ReviewStateTransitionMessagePayload of(final ReviewStateTransitionMessagePayload template) {
        ReviewStateTransitionMessagePayloadImpl instance = new ReviewStateTransitionMessagePayloadImpl();
        instance.setOldState(template.getOldState());
        instance.setNewState(template.getNewState());
        instance.setOldIncludedInStatistics(template.getOldIncludedInStatistics());
        instance.setNewIncludedInStatistics(template.getNewIncludedInStatistics());
        instance.setTarget(template.getTarget());
        instance.setForce(template.getForce());
        return instance;
    }

    public static ReviewStateTransitionMessagePayloadBuilder builder() {
        return ReviewStateTransitionMessagePayloadBuilder.of();
    }

    public static ReviewStateTransitionMessagePayloadBuilder builder(
            final ReviewStateTransitionMessagePayload template) {
        return ReviewStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withReviewStateTransitionMessagePayload(Function<ReviewStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewStateTransitionMessagePayload>";
            }
        };
    }
}
