package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.message.UserProvidedIdentifiers;
import com.commercetools.api.generated.models.subscription.MessageDelivery;
import com.commercetools.api.generated.models.subscription.ResourceCreatedDelivery;
import com.commercetools.api.generated.models.subscription.ResourceDeletedDelivery;
import com.commercetools.api.generated.models.subscription.ResourceUpdatedDelivery;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@JsonSubTypes({
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.MessageDeliveryImpl.class, name = "Message"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.ResourceCreatedDeliveryImpl.class, name = "ResourceCreated"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.ResourceDeletedDeliveryImpl.class, name = "ResourceDeleted"),
   @JsonSubTypes.Type(value = com.commercetools.api.generated.models.subscription.ResourceUpdatedDeliveryImpl.class, name = "ResourceUpdated")
})
@JsonTypeInfo(
   use = JsonTypeInfo.Id.NAME,
   include = JsonTypeInfo.As.PROPERTY,
   property = "notificationType"
)
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public interface SubscriptionDelivery  {

   
   @NotNull
   @JsonProperty("projectKey")
   public String getProjectKey();
   
   @NotNull
   @Valid
   @JsonProperty("resource")
   public Reference getResource();
   
   @Valid
   @JsonProperty("resourceUserProvidedIdentifiers")
   public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

   public void setProjectKey(final String projectKey);
   
   public void setResource(final Reference resource);
   
   public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);
   


}