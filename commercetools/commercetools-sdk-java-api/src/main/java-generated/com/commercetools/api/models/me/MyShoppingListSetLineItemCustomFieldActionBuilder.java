
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetLineItemCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetLineItemCustomFieldAction myShoppingListSetLineItemCustomFieldAction = MyShoppingListSetLineItemCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyShoppingListSetLineItemCustomFieldActionBuilder
        implements Builder<MyShoppingListSetLineItemCustomFieldAction> {

    @Nullable
    private String lineItemId;

    @Nullable
    private String lineItemKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Unique identifier of an the ShoppingListLineItem. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public MyShoppingListSetLineItemCustomFieldActionBuilder lineItemId(@Nullable final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @param lineItemKey value to be set
     * @return Builder
     */

    public MyShoppingListSetLineItemCustomFieldActionBuilder lineItemKey(@Nullable final String lineItemKey) {
        this.lineItemKey = lineItemKey;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public MyShoppingListSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public MyShoppingListSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Unique identifier of an the ShoppingListLineItem. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemId
     */

    @Nullable
    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>The <code>key</code> of the ShoppingListLineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     * @return lineItemKey
     */

    @Nullable
    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds MyShoppingListSetLineItemCustomFieldAction with checking for non-null required values
     * @return MyShoppingListSetLineItemCustomFieldAction
     */
    public MyShoppingListSetLineItemCustomFieldAction build() {
        Objects.requireNonNull(name, MyShoppingListSetLineItemCustomFieldAction.class + ": name is missing");
        return new MyShoppingListSetLineItemCustomFieldActionImpl(lineItemId, lineItemKey, name, value);
    }

    /**
     * builds MyShoppingListSetLineItemCustomFieldAction without checking for non-null required values
     * @return MyShoppingListSetLineItemCustomFieldAction
     */
    public MyShoppingListSetLineItemCustomFieldAction buildUnchecked() {
        return new MyShoppingListSetLineItemCustomFieldActionImpl(lineItemId, lineItemKey, name, value);
    }

    /**
     * factory method for an instance of MyShoppingListSetLineItemCustomFieldActionBuilder
     * @return builder
     */
    public static MyShoppingListSetLineItemCustomFieldActionBuilder of() {
        return new MyShoppingListSetLineItemCustomFieldActionBuilder();
    }

    /**
     * create builder for MyShoppingListSetLineItemCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyShoppingListSetLineItemCustomFieldActionBuilder of(
            final MyShoppingListSetLineItemCustomFieldAction template) {
        MyShoppingListSetLineItemCustomFieldActionBuilder builder = new MyShoppingListSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.lineItemKey = template.getLineItemKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
