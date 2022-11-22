
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ShoppingListSetTextLineItemCustomTypeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetTextLineItemCustomTypeActionImpl
        implements ShoppingListSetTextLineItemCustomTypeAction, ModelBase {

    private String action;

    private String textLineItemId;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    ShoppingListSetTextLineItemCustomTypeActionImpl(@JsonProperty("textLineItemId") final String textLineItemId,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.textLineItemId = textLineItemId;
        this.type = type;
        this.fields = fields;
        this.action = SET_TEXT_LINE_ITEM_CUSTOM_TYPE;
    }

    public ShoppingListSetTextLineItemCustomTypeActionImpl() {
        this.action = SET_TEXT_LINE_ITEM_CUSTOM_TYPE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     */

    public String getTextLineItemId() {
        return this.textLineItemId;
    }

    /**
     *  <p>Defines the Type that extends the TextLineItem with Custom Fields. If absent, any existing Type and Custom Fields are removed from the TextLineItem.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the TextLineItem.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setTextLineItemId(final String textLineItemId) {
        this.textLineItemId = textLineItemId;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListSetTextLineItemCustomTypeActionImpl that = (ShoppingListSetTextLineItemCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(textLineItemId, that.textLineItemId)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(textLineItemId)
                .append(type)
                .append(fields)
                .toHashCode();
    }

}
