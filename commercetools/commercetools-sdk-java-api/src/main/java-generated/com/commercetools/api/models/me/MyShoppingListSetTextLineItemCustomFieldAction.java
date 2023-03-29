
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetTextLineItemCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetTextLineItemCustomFieldAction myShoppingListSetTextLineItemCustomFieldAction = MyShoppingListSetTextLineItemCustomFieldAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetTextLineItemCustomFieldActionImpl.class)
public interface MyShoppingListSetTextLineItemCustomFieldAction extends MyShoppingListUpdateAction {

    /**
     * discriminator value for MyShoppingListSetTextLineItemCustomFieldAction
     */
    String SET_TEXT_LINE_ITEM_CUSTOM_FIELD = "setTextLineItemCustomField";

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @return textLineItemId
     */
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>The <code>id</code> of the TextLineItem to update.</p>
     * @param textLineItemId value to be set
     */

    public void setTextLineItemId(final String textLineItemId);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of MyShoppingListSetTextLineItemCustomFieldAction
     */
    public static MyShoppingListSetTextLineItemCustomFieldAction of() {
        return new MyShoppingListSetTextLineItemCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy MyShoppingListSetTextLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyShoppingListSetTextLineItemCustomFieldAction of(
            final MyShoppingListSetTextLineItemCustomFieldAction template) {
        MyShoppingListSetTextLineItemCustomFieldActionImpl instance = new MyShoppingListSetTextLineItemCustomFieldActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyShoppingListSetTextLineItemCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyShoppingListSetTextLineItemCustomFieldAction deepCopy(
            @Nullable final MyShoppingListSetTextLineItemCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        MyShoppingListSetTextLineItemCustomFieldActionImpl instance = new MyShoppingListSetTextLineItemCustomFieldActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for MyShoppingListSetTextLineItemCustomFieldAction
     * @return builder
     */
    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder builder() {
        return MyShoppingListSetTextLineItemCustomFieldActionBuilder.of();
    }

    /**
     * create builder for MyShoppingListSetTextLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetTextLineItemCustomFieldActionBuilder builder(
            final MyShoppingListSetTextLineItemCustomFieldAction template) {
        return MyShoppingListSetTextLineItemCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyShoppingListSetTextLineItemCustomFieldAction(
            Function<MyShoppingListSetTextLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetTextLineItemCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetTextLineItemCustomFieldAction>";
            }
        };
    }
}
