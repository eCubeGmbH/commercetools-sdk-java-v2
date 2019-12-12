package com.commercetools.api.generated.models.customer_group;

import com.commercetools.api.generated.models.customer_group.CustomerGroup;
import com.commercetools.api.generated.models.customer_group.CustomerGroupPagedQueryResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupPagedQueryResponseBuilder {
   
   @Nullable
   private Long total;
   
   
   private Long offset;
   
   
   private Long count;
   
   
   private Long limit;
   
   
   private java.util.List<com.commercetools.api.generated.models.customer_group.CustomerGroup> results;
   
   public CustomerGroupPagedQueryResponseBuilder total(@Nullable final Long total) {
      this.total = total;
      return this;
   }
   
   public CustomerGroupPagedQueryResponseBuilder offset( final Long offset) {
      this.offset = offset;
      return this;
   }
   
   public CustomerGroupPagedQueryResponseBuilder count( final Long count) {
      this.count = count;
      return this;
   }
   
   public CustomerGroupPagedQueryResponseBuilder limit( final Long limit) {
      this.limit = limit;
      return this;
   }
   
   public CustomerGroupPagedQueryResponseBuilder results( final java.util.List<com.commercetools.api.generated.models.customer_group.CustomerGroup> results) {
      this.results = results;
      return this;
   }
   
   @Nullable
   public Long getTotal(){
      return this.total;
   }
   
   
   public Long getOffset(){
      return this.offset;
   }
   
   
   public Long getCount(){
      return this.count;
   }
   
   
   public Long getLimit(){
      return this.limit;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.customer_group.CustomerGroup> getResults(){
      return this.results;
   }

   public CustomerGroupPagedQueryResponse build() {
       return new CustomerGroupPagedQueryResponseImpl(total, offset, count, limit, results);
   }
   
   public static CustomerGroupPagedQueryResponseBuilder of() {
      return new CustomerGroupPagedQueryResponseBuilder();
   }
   
   public static CustomerGroupPagedQueryResponseBuilder of(final CustomerGroupPagedQueryResponse template) {
      CustomerGroupPagedQueryResponseBuilder builder = new CustomerGroupPagedQueryResponseBuilder();
      builder.total = template.getTotal();
      builder.offset = template.getOffset();
      builder.count = template.getCount();
      builder.limit = template.getLimit();
      builder.results = template.getResults();
      return builder;
   }
   
}