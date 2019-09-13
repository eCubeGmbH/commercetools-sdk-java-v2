package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeType;
import java.lang.String;
import com.commercetools.models.product_type.AttributeMoneyType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeMoneyTypeBuilder {
   
   
   

   public AttributeMoneyType build() {
       return new AttributeMoneyTypeImpl();
   }
   
   public static AttributeMoneyTypeBuilder of() {
      return new AttributeMoneyTypeBuilder();
   }
   
   public static AttributeMoneyTypeBuilder of(final AttributeMoneyType template) {
      AttributeMoneyTypeBuilder builder = new AttributeMoneyTypeBuilder();
      return builder;
   }
   
}