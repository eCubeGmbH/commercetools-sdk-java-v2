package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.InvalidSubjectError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class InvalidSubjectErrorBuilder {
   
   
   private String message;
   
   public InvalidSubjectErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }

   public InvalidSubjectError build() {
       return new InvalidSubjectErrorImpl(message);
   }
   
   public static InvalidSubjectErrorBuilder of() {
      return new InvalidSubjectErrorBuilder();
   }
   
   public static InvalidSubjectErrorBuilder of(final InvalidSubjectError template) {
      InvalidSubjectErrorBuilder builder = new InvalidSubjectErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}