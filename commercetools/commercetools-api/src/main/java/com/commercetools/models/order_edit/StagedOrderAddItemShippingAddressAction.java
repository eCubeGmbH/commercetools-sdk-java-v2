package com.commercetools.models.order_edit;

import com.commercetools.models.common.Address;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderAddItemShippingAddressActionImpl;

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
@JsonDeserialize(as = StagedOrderAddItemShippingAddressActionImpl.class)
public interface StagedOrderAddItemShippingAddressAction extends StagedOrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static StagedOrderAddItemShippingAddressActionImpl of(){
      return new StagedOrderAddItemShippingAddressActionImpl();
   }
   

   public static StagedOrderAddItemShippingAddressActionImpl of(final StagedOrderAddItemShippingAddressAction template) {
      StagedOrderAddItemShippingAddressActionImpl instance = new StagedOrderAddItemShippingAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}