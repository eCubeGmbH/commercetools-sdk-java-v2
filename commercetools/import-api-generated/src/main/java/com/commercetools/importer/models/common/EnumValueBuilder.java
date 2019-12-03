package com.commercetools.importer.models.common;


import com.commercetools.importer.models.common.EnumValue;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class EnumValueBuilder {
   
   
   private String label;
   
   
   private String key;
   
   public EnumValueBuilder label( final String label) {
      this.label = label;
      return this;
   }
   
   public EnumValueBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getLabel(){
      return this.label;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public EnumValue build() {
       return new EnumValueImpl(label, key);
   }
   
   public static EnumValueBuilder of() {
      return new EnumValueBuilder();
   }
   
   public static EnumValueBuilder of(final EnumValue template) {
      EnumValueBuilder builder = new EnumValueBuilder();
      builder.label = template.getLabel();
      builder.key = template.getKey();
      return builder;
   }
   
}