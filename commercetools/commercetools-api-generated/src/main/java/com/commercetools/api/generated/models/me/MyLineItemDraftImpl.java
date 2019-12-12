package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.generated.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyLineItemDraftImpl implements MyLineItemDraft {

   private Integer quantity;
   
   private com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails;
   
   private String productId;
   
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel;
   
   private Long variantId;
   
   private String sku;
   
   private com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel;

   @JsonCreator
   MyLineItemDraftImpl(@JsonProperty("quantity") final Integer quantity, @JsonProperty("shippingDetails") final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails, @JsonProperty("productId") final String productId, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFieldsDraft custom, @JsonProperty("supplyChannel") final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("distributionChannel") final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel) {
      this.quantity = quantity;
      this.shippingDetails = shippingDetails;
      this.productId = productId;
      this.custom = custom;
      this.supplyChannel = supplyChannel;
      this.variantId = variantId;
      this.sku = sku;
      this.distributionChannel = distributionChannel;
   }
   public MyLineItemDraftImpl() {
      
   }
   
   
   public Integer getQuantity(){
      return this.quantity;
   }
   
   /**
   *  <p>Container for line item specific address(es).</p>
   */
   public com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft getShippingDetails(){
      return this.shippingDetails;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   /**
   *  <p>By providing supply channel information, you can unique identify
   *  inventory entries that should be reserved.
   *  The provided channel should have the InventorySupply role.</p>
   */
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getSupplyChannel(){
      return this.supplyChannel;
   }
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   /**
   *  <p>The channel is used to select a ProductPrice.
   *  The provided channel should have the ProductDistribution role.</p>
   */
   public com.commercetools.api.generated.models.channel.ChannelResourceIdentifier getDistributionChannel(){
      return this.distributionChannel;
   }

   public void setQuantity(final Integer quantity){
      this.quantity = quantity;
   }
   
   public void setShippingDetails(final com.commercetools.api.generated.models.cart.ItemShippingDetailsDraft shippingDetails){
      this.shippingDetails = shippingDetails;
   }
   
   public void setProductId(final String productId){
      this.productId = productId;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }
   
   public void setSupplyChannel(final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier supplyChannel){
      this.supplyChannel = supplyChannel;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setDistributionChannel(final com.commercetools.api.generated.models.channel.ChannelResourceIdentifier distributionChannel){
      this.distributionChannel = distributionChannel;
   }

}