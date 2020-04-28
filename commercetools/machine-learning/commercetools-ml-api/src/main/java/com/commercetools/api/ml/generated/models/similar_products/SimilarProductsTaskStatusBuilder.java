package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.common.TaskStatusEnum;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductsPagedQueryResult;
import java.time.ZonedDateTime;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductsTaskStatus;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SimilarProductsTaskStatusBuilder {
   
   
   private com.commercetools.api.ml.generated.models.common.TaskStatusEnum state;
   
   @Nullable
   private java.time.ZonedDateTime expires;
   
   
   private com.commercetools.api.ml.generated.models.similar_products.SimilarProductsPagedQueryResult result;
   
   public SimilarProductsTaskStatusBuilder state( final com.commercetools.api.ml.generated.models.common.TaskStatusEnum state) {
      this.state = state;
      return this;
   }
   
   public SimilarProductsTaskStatusBuilder expires(@Nullable final java.time.ZonedDateTime expires) {
      this.expires = expires;
      return this;
   }
   
   public SimilarProductsTaskStatusBuilder result( final com.commercetools.api.ml.generated.models.similar_products.SimilarProductsPagedQueryResult result) {
      this.result = result;
      return this;
   }
   
   
   public com.commercetools.api.ml.generated.models.common.TaskStatusEnum getState(){
      return this.state;
   }
   
   @Nullable
   public java.time.ZonedDateTime getExpires(){
      return this.expires;
   }
   
   
   public com.commercetools.api.ml.generated.models.similar_products.SimilarProductsPagedQueryResult getResult(){
      return this.result;
   }

   public SimilarProductsTaskStatus build() {
       return new SimilarProductsTaskStatusImpl(state, expires, result);
   }
   
   public static SimilarProductsTaskStatusBuilder of() {
      return new SimilarProductsTaskStatusBuilder();
   }
   
   public static SimilarProductsTaskStatusBuilder of(final SimilarProductsTaskStatus template) {
      SimilarProductsTaskStatusBuilder builder = new SimilarProductsTaskStatusBuilder();
      builder.state = template.getState();
      builder.expires = template.getExpires();
      builder.result = template.getResult();
      return builder;
   }
   
}
