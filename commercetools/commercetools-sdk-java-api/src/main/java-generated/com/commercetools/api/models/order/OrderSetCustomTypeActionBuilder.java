
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetCustomTypeActionBuilder implements Builder<OrderSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
    *  <p>Defines the Type that extends the Order with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Order.</p>
    */

    public OrderSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
    *  <p>Defines the Type that extends the Order with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Order.</p>
    */

    public OrderSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
    *  <p>Sets the Custom Fields fields for the Order.</p>
    */

    public OrderSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
    *  <p>Sets the Custom Fields fields for the Order.</p>
    */

    public OrderSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public OrderSetCustomTypeAction build() {
        return new OrderSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds OrderSetCustomTypeAction without checking for non null required values
     */
    public OrderSetCustomTypeAction buildUnchecked() {
        return new OrderSetCustomTypeActionImpl(type, fields);
    }

    public static OrderSetCustomTypeActionBuilder of() {
        return new OrderSetCustomTypeActionBuilder();
    }

    public static OrderSetCustomTypeActionBuilder of(final OrderSetCustomTypeAction template) {
        OrderSetCustomTypeActionBuilder builder = new OrderSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
