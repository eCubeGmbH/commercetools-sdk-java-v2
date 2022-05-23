
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   OrderDeletedMessage orderDeletedMessage = OrderDeletedMessage.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .sequenceNumber(0.3)
           .resource(resourceBuilder -> resourceBuilder)
           .resourceVersion(0.3)
           .order(orderBuilder -> orderBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderDeletedMessageImpl.class)
public interface OrderDeletedMessage extends OrderMessage {

    String ORDER_DELETED = "OrderDeleted";

    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    public void setOrder(final Order order);

    public static OrderDeletedMessage of() {
        return new OrderDeletedMessageImpl();
    }

    public static OrderDeletedMessage of(final OrderDeletedMessage template) {
        OrderDeletedMessageImpl instance = new OrderDeletedMessageImpl();
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
        instance.setOrder(template.getOrder());
        return instance;
    }

    public static OrderDeletedMessageBuilder builder() {
        return OrderDeletedMessageBuilder.of();
    }

    public static OrderDeletedMessageBuilder builder(final OrderDeletedMessage template) {
        return OrderDeletedMessageBuilder.of(template);
    }

    default <T> T withOrderDeletedMessage(Function<OrderDeletedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderDeletedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderDeletedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderDeletedMessage>";
            }
        };
    }
}
