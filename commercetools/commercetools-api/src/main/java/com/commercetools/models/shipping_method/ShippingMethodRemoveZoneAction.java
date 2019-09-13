package com.commercetools.models.shipping_method;

import com.commercetools.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.models.zone.ZoneResourceIdentifier;
import java.lang.String;
import com.commercetools.models.shipping_method.ShippingMethodRemoveZoneActionImpl;

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
@JsonDeserialize(as = ShippingMethodRemoveZoneActionImpl.class)
public interface ShippingMethodRemoveZoneAction extends ShippingMethodUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("zone")
   public ZoneResourceIdentifier getZone();

   public void setZone(final ZoneResourceIdentifier zone);
   
   public static ShippingMethodRemoveZoneActionImpl of(){
      return new ShippingMethodRemoveZoneActionImpl();
   }
   

   public static ShippingMethodRemoveZoneActionImpl of(final ShippingMethodRemoveZoneAction template) {
      ShippingMethodRemoveZoneActionImpl instance = new ShippingMethodRemoveZoneActionImpl();
      instance.setZone(template.getZone());
      return instance;
   }

}