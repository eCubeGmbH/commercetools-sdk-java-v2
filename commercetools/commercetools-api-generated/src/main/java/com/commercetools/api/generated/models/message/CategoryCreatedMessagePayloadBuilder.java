package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.category.Category;
import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.message.CategoryCreatedMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryCreatedMessagePayloadBuilder {
   
   
   private com.commercetools.api.generated.models.category.Category category;
   
   public CategoryCreatedMessagePayloadBuilder category( final com.commercetools.api.generated.models.category.Category category) {
      this.category = category;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.category.Category getCategory(){
      return this.category;
   }

   public CategoryCreatedMessagePayload build() {
       return new CategoryCreatedMessagePayloadImpl(category);
   }
   
   public static CategoryCreatedMessagePayloadBuilder of() {
      return new CategoryCreatedMessagePayloadBuilder();
   }
   
   public static CategoryCreatedMessagePayloadBuilder of(final CategoryCreatedMessagePayload template) {
      CategoryCreatedMessagePayloadBuilder builder = new CategoryCreatedMessagePayloadBuilder();
      builder.category = template.getCategory();
      return builder;
   }
   
}