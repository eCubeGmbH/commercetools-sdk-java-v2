package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategorySetAssetCustomFieldActionImpl;

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
@JsonDeserialize(as = CategorySetAssetCustomFieldActionImpl.class)
public interface CategorySetAssetCustomFieldAction extends CategoryUpdateAction {

   
   
   @JsonProperty("assetId")
   public String getAssetId();
   
   
   @JsonProperty("assetKey")
   public String getAssetKey();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static CategorySetAssetCustomFieldActionImpl of(){
      return new CategorySetAssetCustomFieldActionImpl();
   }
   

   public static CategorySetAssetCustomFieldActionImpl of(final CategorySetAssetCustomFieldAction template) {
      CategorySetAssetCustomFieldActionImpl instance = new CategorySetAssetCustomFieldActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}