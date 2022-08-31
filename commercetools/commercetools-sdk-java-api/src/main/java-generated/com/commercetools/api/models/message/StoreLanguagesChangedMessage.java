
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Languages update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreLanguagesChangedMessage storeLanguagesChangedMessage = StoreLanguagesChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreLanguagesChangedMessageImpl.class)
public interface StoreLanguagesChangedMessage extends Message {

    String STORE_LANGUAGES_CHANGED = "StoreLanguagesChanged";

    /**
     *  <p>Locales added to the Store after the Set Languages update action.</p>
     */

    @JsonProperty("addedLanguages")
    public List<String> getAddedLanguages();

    /**
     *  <p>Locales removed from the Store during the Set Languages update action.</p>
     */

    @JsonProperty("removedLanguages")
    public List<String> getRemovedLanguages();

    @JsonIgnore
    public void setAddedLanguages(final String... addedLanguages);

    public void setAddedLanguages(final List<String> addedLanguages);

    @JsonIgnore
    public void setRemovedLanguages(final String... removedLanguages);

    public void setRemovedLanguages(final List<String> removedLanguages);

    public static StoreLanguagesChangedMessage of() {
        return new StoreLanguagesChangedMessageImpl();
    }

    public static StoreLanguagesChangedMessage of(final StoreLanguagesChangedMessage template) {
        StoreLanguagesChangedMessageImpl instance = new StoreLanguagesChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setAddedLanguages(template.getAddedLanguages());
        instance.setRemovedLanguages(template.getRemovedLanguages());
        return instance;
    }

    public static StoreLanguagesChangedMessageBuilder builder() {
        return StoreLanguagesChangedMessageBuilder.of();
    }

    public static StoreLanguagesChangedMessageBuilder builder(final StoreLanguagesChangedMessage template) {
        return StoreLanguagesChangedMessageBuilder.of(template);
    }

    default <T> T withStoreLanguagesChangedMessage(Function<StoreLanguagesChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreLanguagesChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreLanguagesChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<StoreLanguagesChangedMessage>";
            }
        };
    }
}
