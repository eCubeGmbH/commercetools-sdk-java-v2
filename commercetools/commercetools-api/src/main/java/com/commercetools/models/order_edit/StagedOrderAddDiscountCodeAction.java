package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderAddDiscountCodeActionImpl;

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
@JsonDeserialize(as = StagedOrderAddDiscountCodeActionImpl.class)
public interface StagedOrderAddDiscountCodeAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("code")
   public String getCode();

   public void setCode(final String code);
   
   public static StagedOrderAddDiscountCodeActionImpl of(){
      return new StagedOrderAddDiscountCodeActionImpl();
   }
   

   public static StagedOrderAddDiscountCodeActionImpl of(final StagedOrderAddDiscountCodeAction template) {
      StagedOrderAddDiscountCodeActionImpl instance = new StagedOrderAddDiscountCodeActionImpl();
      instance.setCode(template.getCode());
      return instance;
   }

}