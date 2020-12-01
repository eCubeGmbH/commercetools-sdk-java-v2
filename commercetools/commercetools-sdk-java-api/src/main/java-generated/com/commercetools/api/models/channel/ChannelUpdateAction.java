package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelAddRolesAction;
import com.commercetools.api.models.channel.ChannelChangeDescriptionAction;
import com.commercetools.api.models.channel.ChannelChangeKeyAction;
import com.commercetools.api.models.channel.ChannelChangeNameAction;
import com.commercetools.api.models.channel.ChannelRemoveRolesAction;
import com.commercetools.api.models.channel.ChannelSetAddressAction;
import com.commercetools.api.models.channel.ChannelSetCustomFieldAction;
import com.commercetools.api.models.channel.ChannelSetCustomTypeAction;
import com.commercetools.api.models.channel.ChannelSetGeoLocationAction;
import com.commercetools.api.models.channel.ChannelSetRolesAction;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelAddRolesActionImpl.class, name = "addRoles"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelChangeDescriptionActionImpl.class, name = "changeDescription"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelChangeKeyActionImpl.class, name = "changeKey"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelChangeNameActionImpl.class, name = "changeName"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelRemoveRolesActionImpl.class, name = "removeRoles"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetAddressActionImpl.class, name = "setAddress"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetCustomFieldActionImpl.class, name = "setCustomField"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetCustomTypeActionImpl.class, name = "setCustomType"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetGeoLocationActionImpl.class, name = "setGeoLocation"),
   @JsonSubTypes.Type(value = com.commercetools.api.models.channel.ChannelSetRolesActionImpl.class, name = "setRoles")
})
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "action",
    defaultImpl = ChannelUpdateActionImpl.class,
    visible = true
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface ChannelUpdateAction extends com.commercetools.api.models.ResourceUpdateAction<ChannelUpdateAction> {

    
    @NotNull
    @JsonProperty("action")
    public String getAction();




    default <T> T withChannelUpdateAction(Function<ChannelUpdateAction, T> helper) {
        return helper.apply(this);
    }
}
