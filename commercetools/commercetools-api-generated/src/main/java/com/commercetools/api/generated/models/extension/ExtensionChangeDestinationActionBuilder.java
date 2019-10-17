package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionDestination;
import com.commercetools.api.generated.models.extension.ExtensionUpdateAction;
import com.commercetools.api.generated.models.extension.ExtensionChangeDestinationAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionChangeDestinationActionBuilder {
   
   
   private com.commercetools.api.generated.models.extension.ExtensionDestination destination;
   
   public ExtensionChangeDestinationActionBuilder destination( final com.commercetools.api.generated.models.extension.ExtensionDestination destination) {
      this.destination = destination;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.extension.ExtensionDestination getDestination(){
      return this.destination;
   }

   public ExtensionChangeDestinationAction build() {
       return new ExtensionChangeDestinationActionImpl(destination);
   }
   
   public static ExtensionChangeDestinationActionBuilder of() {
      return new ExtensionChangeDestinationActionBuilder();
   }
   
   public static ExtensionChangeDestinationActionBuilder of(final ExtensionChangeDestinationAction template) {
      ExtensionChangeDestinationActionBuilder builder = new ExtensionChangeDestinationActionBuilder();
      builder.destination = template.getDestination();
      return builder;
   }
   
}