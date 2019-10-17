package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.common.Money;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExternalTaxAmountDraftImpl implements ExternalTaxAmountDraft {

   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft taxRate;
   
   private com.commercetools.api.generated.models.common.Money totalGross;

   @JsonCreator
   ExternalTaxAmountDraftImpl(@JsonProperty("taxRate") final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft taxRate, @JsonProperty("totalGross") final com.commercetools.api.generated.models.common.Money totalGross) {
      this.taxRate = taxRate;
      this.totalGross = totalGross;
   }
   public ExternalTaxAmountDraftImpl() {
      
   }
   
   
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getTaxRate(){
      return this.taxRate;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getTotalGross(){
      return this.totalGross;
   }

   public void setTaxRate(final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft taxRate){
      this.taxRate = taxRate;
   }
   
   public void setTotalGross(final com.commercetools.api.generated.models.common.Money totalGross){
      this.totalGross = totalGross;
   }

}