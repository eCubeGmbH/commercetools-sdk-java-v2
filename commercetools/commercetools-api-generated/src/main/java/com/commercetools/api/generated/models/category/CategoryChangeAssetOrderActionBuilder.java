package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategoryChangeAssetOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryChangeAssetOrderActionBuilder {
   
   
   private java.util.List<String> assetOrder;
   
   public CategoryChangeAssetOrderActionBuilder assetOrder( final java.util.List<String> assetOrder) {
      this.assetOrder = assetOrder;
      return this;
   }
   
   
   public java.util.List<String> getAssetOrder(){
      return this.assetOrder;
   }

   public CategoryChangeAssetOrderAction build() {
       return new CategoryChangeAssetOrderActionImpl(assetOrder);
   }
   
   public static CategoryChangeAssetOrderActionBuilder of() {
      return new CategoryChangeAssetOrderActionBuilder();
   }
   
   public static CategoryChangeAssetOrderActionBuilder of(final CategoryChangeAssetOrderAction template) {
      CategoryChangeAssetOrderActionBuilder builder = new CategoryChangeAssetOrderActionBuilder();
      builder.assetOrder = template.getAssetOrder();
      return builder;
   }
   
}