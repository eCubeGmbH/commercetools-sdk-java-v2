package com.commercetools.importer.models.productvariants;

import com.commercetools.importer.models.productvariants.Attribute;
import com.commercetools.importer.models.productvariants.NumberAttribute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class NumberAttributeBuilder {
   
   @Nullable
   private String name;
   
   
   private Integer value;
   
   public NumberAttributeBuilder name(@Nullable final String name) {
      this.name = name;
      return this;
   }
   
   public NumberAttributeBuilder value( final Integer value) {
      this.value = value;
      return this;
   }
   
   @Nullable
   public String getName(){
      return this.name;
   }
   
   
   public Integer getValue(){
      return this.value;
   }

   public NumberAttribute build() {
       return new NumberAttributeImpl(name, value);
   }
   
   public static NumberAttributeBuilder of() {
      return new NumberAttributeBuilder();
   }
   
   public static NumberAttributeBuilder of(final NumberAttribute template) {
      NumberAttributeBuilder builder = new NumberAttributeBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}