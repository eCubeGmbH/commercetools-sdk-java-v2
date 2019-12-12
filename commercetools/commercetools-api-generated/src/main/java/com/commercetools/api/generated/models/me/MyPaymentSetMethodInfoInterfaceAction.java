package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyPaymentUpdateAction;
import com.commercetools.api.generated.models.me.MyPaymentSetMethodInfoInterfaceActionImpl;

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
@JsonDeserialize(as = MyPaymentSetMethodInfoInterfaceActionImpl.class)
public interface MyPaymentSetMethodInfoInterfaceAction extends MyPaymentUpdateAction {

   
   @NotNull
   @JsonProperty("interface")
   public String getInterface();

   public void setInterface(final String _interface);
   
   public static MyPaymentSetMethodInfoInterfaceActionImpl of(){
      return new MyPaymentSetMethodInfoInterfaceActionImpl();
   }
   

   public static MyPaymentSetMethodInfoInterfaceActionImpl of(final MyPaymentSetMethodInfoInterfaceAction template) {
      MyPaymentSetMethodInfoInterfaceActionImpl instance = new MyPaymentSetMethodInfoInterfaceActionImpl();
      instance.setInterface(template.getInterface());
      return instance;
   }

}