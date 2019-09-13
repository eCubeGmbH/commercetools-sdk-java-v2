package com.commercetools.models.product_type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product_type.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.product_type.ProductTypeChangeLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeLabelActionBuilder {
   
   
   private java.lang.String attributeName;
   
   
   private com.commercetools.models.common.LocalizedString label;
   
   public ProductTypeChangeLabelActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   public ProductTypeChangeLabelActionBuilder label( final com.commercetools.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }
   
   
   public com.commercetools.models.common.LocalizedString getLabel(){
      return this.label;
   }

   public ProductTypeChangeLabelAction build() {
       return new ProductTypeChangeLabelActionImpl(attributeName, label);
   }
   
   public static ProductTypeChangeLabelActionBuilder of() {
      return new ProductTypeChangeLabelActionBuilder();
   }
   
   public static ProductTypeChangeLabelActionBuilder of(final ProductTypeChangeLabelAction template) {
      ProductTypeChangeLabelActionBuilder builder = new ProductTypeChangeLabelActionBuilder();
      builder.attributeName = template.getAttributeName();
      builder.label = template.getLabel();
      return builder;
   }
   
}