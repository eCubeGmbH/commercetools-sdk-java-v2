package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderAddCustomLineItemActionImpl implements StagedOrderAddCustomLineItemAction {

    private String action;
    
    private com.commercetools.api.models.common.Money money;
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    private Double quantity;
    
    private String slug;
    
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
    
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    StagedOrderAddCustomLineItemActionImpl(@JsonProperty("money") final com.commercetools.api.models.common.Money money, @JsonProperty("name") final com.commercetools.api.models.common.LocalizedString name, @JsonProperty("quantity") final Double quantity, @JsonProperty("slug") final String slug, @JsonProperty("taxCategory") final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.money = money;
        this.name = name;
        this.quantity = quantity;
        this.slug = slug;
        this.taxCategory = taxCategory;
        this.custom = custom;
        this.externalTaxRate = externalTaxRate;
        this.action = "addCustomLineItem";
    }
    public StagedOrderAddCustomLineItemActionImpl() {
        this.action = "addCustomLineItem";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public com.commercetools.api.models.common.Money getMoney(){
        return this.money;
    }
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    
    public Double getQuantity(){
        return this.quantity;
    }
    
    
    public String getSlug(){
        return this.slug;
    }
    
    
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }
    
    
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    public void setMoney(final com.commercetools.api.models.common.Money money){
        this.money = money;
    }
    
    public void setName(final com.commercetools.api.models.common.LocalizedString name){
        this.name = name;
    }
    
    public void setQuantity(final Double quantity){
        this.quantity = quantity;
    }
    
    public void setSlug(final String slug){
        this.slug = slug;
    }
    
    public void setTaxCategory(final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory){
        this.taxCategory = taxCategory;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
        this.custom = custom;
    }
    
    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate){
        this.externalTaxRate = externalTaxRate;
    }

}
