package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.Customer;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.customer.CustomerSignInResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSignInResultBuilder {
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode cart;
   
   
   private com.commercetools.api.generated.models.customer.Customer customer;
   
   public CustomerSignInResultBuilder cart(@Nullable final com.fasterxml.jackson.databind.JsonNode cart) {
      this.cart = cart;
      return this;
   }
   
   public CustomerSignInResultBuilder customer( final com.commercetools.api.generated.models.customer.Customer customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getCart(){
      return this.cart;
   }
   
   
   public com.commercetools.api.generated.models.customer.Customer getCustomer(){
      return this.customer;
   }

   public CustomerSignInResult build() {
       return new CustomerSignInResultImpl(cart, customer);
   }
   
   public static CustomerSignInResultBuilder of() {
      return new CustomerSignInResultBuilder();
   }
   
   public static CustomerSignInResultBuilder of(final CustomerSignInResult template) {
      CustomerSignInResultBuilder builder = new CustomerSignInResultBuilder();
      builder.cart = template.getCart();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}