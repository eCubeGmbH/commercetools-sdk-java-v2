package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldTimeType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldTimeTypeBuilder {
   
   
   

   public CustomFieldTimeType build() {
       return new CustomFieldTimeTypeImpl();
   }
   
   public static CustomFieldTimeTypeBuilder of() {
      return new CustomFieldTimeTypeBuilder();
   }
   
   public static CustomFieldTimeTypeBuilder of(final CustomFieldTimeType template) {
      CustomFieldTimeTypeBuilder builder = new CustomFieldTimeTypeBuilder();
      return builder;
   }
   
}