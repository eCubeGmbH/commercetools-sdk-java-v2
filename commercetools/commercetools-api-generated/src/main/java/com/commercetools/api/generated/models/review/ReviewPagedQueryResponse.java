package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.review.Review;
import com.commercetools.api.generated.models.review.ReviewPagedQueryResponseImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = ReviewPagedQueryResponseImpl.class)
public interface ReviewPagedQueryResponse  {

   
   @NotNull
   @JsonProperty("limit")
   public Long getLimit();
   
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
   public List<Review> getResults();

   public void setLimit(final Long limit);
   
   public void setCount(final Long count);
   
   public void setTotal(final Long total);
   
   public void setOffset(final Long offset);
   
   public void setResults(final List<Review> results);
   
   public static ReviewPagedQueryResponseImpl of(){
      return new ReviewPagedQueryResponseImpl();
   }
   

   public static ReviewPagedQueryResponseImpl of(final ReviewPagedQueryResponse template) {
      ReviewPagedQueryResponseImpl instance = new ReviewPagedQueryResponseImpl();
      instance.setTotal(template.getTotal());
      instance.setOffset(template.getOffset());
      instance.setCount(template.getCount());
      instance.setLimit(template.getLimit());
      instance.setResults(template.getResults());
      return instance;
   }

}