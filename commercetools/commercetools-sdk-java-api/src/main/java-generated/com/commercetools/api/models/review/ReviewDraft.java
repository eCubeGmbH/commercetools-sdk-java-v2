
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>When creating a new Review, at least one of <code>title</code>, <code>text</code> or <code>rating</code> should be set.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewDraft reviewDraft = ReviewDraft.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewDraftImpl.class)
public interface ReviewDraft extends com.commercetools.api.models.CustomizableDraft<ReviewDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ReviewDraft> {

    /**
     *  <p>User-defined unique identifier for the Review.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>If set, this value must be unique among Reviews. For example, if you want to have only one Review per Customer and per Product, you can set the value to Customer <code>id</code>&nbsp;+ Product <code>id</code>.</p>
     * @return uniquenessValue
     */

    @JsonProperty("uniquenessValue")
    public String getUniquenessValue();

    /**
     *  <p>Language in which the content of the Review is written.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Name of the author.</p>
     * @return authorName
     */

    @JsonProperty("authorName")
    public String getAuthorName();

    /**
     *  <p>Title of the Review.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Content of the Review.</p>
     * @return text
     */

    @JsonProperty("text")
    public String getText();

    /**
     *  <p>Draft type to create a Reference or a KeyReference to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a CategoryDraft takes a ResourceIdentifier for its value while the value of the corresponding field of a Category is a Reference.</p>
     *  <p>Each resource type has its corresponding ResourceIdentifier, like ChannelResourceIdentifier.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public ResourceIdentifier getTarget();

    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>Rating of the targeted Product or Channel. This rating can represent the number of stars, a percentage, or a like (+1)/dislike (-1). A rating is used in the ratings statistics of the targeted object, unless the Review is in a State that does not have the role <code>ReviewIncludedInStatistics</code>.</p>
     * @return rating
     */

    @JsonProperty("rating")
    public Integer getRating();

    /**
     *  <p>Customer who created the Review.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>Custom Fields for the Review.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setUniquenessValue(final String uniquenessValue);

    public void setLocale(final String locale);

    public void setAuthorName(final String authorName);

    public void setTitle(final String title);

    public void setText(final String text);

    public void setTarget(final ResourceIdentifier target);

    public void setState(final StateResourceIdentifier state);

    public void setRating(final Integer rating);

    public void setCustomer(final CustomerResourceIdentifier customer);

    public void setCustom(final CustomFieldsDraft custom);

    public static ReviewDraft of() {
        return new ReviewDraftImpl();
    }

    public static ReviewDraft of(final ReviewDraft template) {
        ReviewDraftImpl instance = new ReviewDraftImpl();
        instance.setKey(template.getKey());
        instance.setUniquenessValue(template.getUniquenessValue());
        instance.setLocale(template.getLocale());
        instance.setAuthorName(template.getAuthorName());
        instance.setTitle(template.getTitle());
        instance.setText(template.getText());
        instance.setTarget(template.getTarget());
        instance.setState(template.getState());
        instance.setRating(template.getRating());
        instance.setCustomer(template.getCustomer());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ReviewDraftBuilder builder() {
        return ReviewDraftBuilder.of();
    }

    public static ReviewDraftBuilder builder(final ReviewDraft template) {
        return ReviewDraftBuilder.of(template);
    }

    default <T> T withReviewDraft(Function<ReviewDraft, T> helper) {
        return helper.apply(this);
    }

    @Deprecated
    @JsonIgnore
    public default void setTarget(final Object target) {
        setTarget((ResourceIdentifier) target);
    };

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewDraft>";
            }
        };
    }
}
