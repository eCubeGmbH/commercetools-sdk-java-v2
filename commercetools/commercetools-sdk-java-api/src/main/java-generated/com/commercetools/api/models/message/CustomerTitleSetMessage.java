
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerTitleSetMessage customerTitleSetMessage = CustomerTitleSetMessage.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .sequenceNumber(0.3)
           .resource(resourceBuilder -> resourceBuilder)
           .resourceVersion(0.3)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerTitleSetMessageImpl.class)
public interface CustomerTitleSetMessage extends Message {

    String CUSTOMER_TITLE_SET = "CustomerTitleSet";

    @JsonProperty("title")
    public String getTitle();

    public void setTitle(final String title);

    public static CustomerTitleSetMessage of() {
        return new CustomerTitleSetMessageImpl();
    }

    public static CustomerTitleSetMessage of(final CustomerTitleSetMessage template) {
        CustomerTitleSetMessageImpl instance = new CustomerTitleSetMessageImpl();
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
        instance.setTitle(template.getTitle());
        return instance;
    }

    public static CustomerTitleSetMessageBuilder builder() {
        return CustomerTitleSetMessageBuilder.of();
    }

    public static CustomerTitleSetMessageBuilder builder(final CustomerTitleSetMessage template) {
        return CustomerTitleSetMessageBuilder.of(template);
    }

    default <T> T withCustomerTitleSetMessage(Function<CustomerTitleSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerTitleSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerTitleSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerTitleSetMessage>";
            }
        };
    }
}
