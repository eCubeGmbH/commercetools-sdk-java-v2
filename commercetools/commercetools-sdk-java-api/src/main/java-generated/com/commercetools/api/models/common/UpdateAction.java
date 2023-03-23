
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * UpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdateAction updateAction = UpdateAction.builder()
 *             .action("{action}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UpdateActionImpl.class)
public interface UpdateAction extends com.commercetools.api.models.ResourceUpdateAction<UpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public void setAction(final String action);

    public static UpdateAction of() {
        return new UpdateActionImpl();
    }

    public static UpdateAction of(final UpdateAction template) {
        UpdateActionImpl instance = new UpdateActionImpl();
        instance.setAction(template.getAction());
        return instance;
    }

    public static UpdateActionBuilder builder() {
        return UpdateActionBuilder.of();
    }

    public static UpdateActionBuilder builder(final UpdateAction template) {
        return UpdateActionBuilder.of(template);
    }

    default <T> T withUpdateAction(Function<UpdateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<UpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<UpdateAction>";
            }
        };
    }
}
