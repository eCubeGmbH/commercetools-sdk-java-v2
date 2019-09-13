package com.commercetools.models.shopping_list;

import com.commercetools.models.shopping_list.ShoppingList;
import java.lang.Long;
import com.commercetools.models.shopping_list.ShoppingListPagedQueryResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListPagedQueryResponseImpl.class)
public interface ShoppingListPagedQueryResponse  {

   
   @NotNull
   @JsonProperty("count")
   public Long getCount();
   
   
   @JsonProperty("total")
   public Long getTotal();
   
   @NotNull
   @JsonProperty("offset")
   public Long getOffset();
   
   @NotNull
   @Valid
   @JsonProperty("results")
   public List<ShoppingList> getResults();

   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<ShoppingList> results);
   
   public static ShoppingListPagedQueryResponseImpl of(){
      return new ShoppingListPagedQueryResponseImpl();
   }
   

   public static ShoppingListPagedQueryResponseImpl of(final ShoppingListPagedQueryResponse template) {
      ShoppingListPagedQueryResponseImpl instance = new ShoppingListPagedQueryResponseImpl();
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setCount(template.getCount());
      instance.setResults(template.getResults());
      return instance;
   }

}