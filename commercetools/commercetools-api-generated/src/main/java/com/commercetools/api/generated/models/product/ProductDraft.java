package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.category.CategoryResourceIdentifier;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.CategoryOrderHints;
import com.commercetools.api.generated.models.product.ProductVariantDraft;
import com.commercetools.api.generated.models.product.SearchKeywords;
import com.commercetools.api.generated.models.product_type.ProductTypeResourceIdentifier;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductDraftImpl;

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
@JsonDeserialize(as = ProductDraftImpl.class)
public interface ProductDraft  {

   /**
   *  <p>A predefined product type assigned to the product.
   *  All products must have a product type.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("productType")
   public ProductTypeResourceIdentifier getProductType();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>Human-readable identifiers usually used as deep-link URLs for the product.
   *  A slug must be unique across a project, but a product can have the same slug for different languages.
   *  Slugs have a maximum size of 256.
   *  Valid characters are: alphabetic characters (<code>A-Z, a-z</code>), numeric characters (<code>0-9</code>), underscores (<code>_</code>) and hyphens (<code>-</code>).</p>
   */
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   /**
   *  <p>User-specific unique identifier for the product.</p>
   */
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   *  <p>Categories assigned to the product.</p>
   */
   @Valid
   @JsonProperty("categories")
   public List<CategoryResourceIdentifier> getCategories();
   
   @Valid
   @JsonProperty("categoryOrderHints")
   public CategoryOrderHints getCategoryOrderHints();
   
   @Valid
   @JsonProperty("metaTitle")
   public LocalizedString getMetaTitle();
   
   @Valid
   @JsonProperty("metaDescription")
   public LocalizedString getMetaDescription();
   
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();
   /**
   *  <p>The master product variant.
   *  Required if the <code>variants</code> array has product variants.</p>
   */
   @Valid
   @JsonProperty("masterVariant")
   public ProductVariantDraft getMasterVariant();
   /**
   *  <p>An array of related product variants.</p>
   */
   @Valid
   @JsonProperty("variants")
   public List<ProductVariantDraft> getVariants();
   
   @Valid
   @JsonProperty("taxCategory")
   public TaxCategoryResourceIdentifier getTaxCategory();
   
   @Valid
   @JsonProperty("searchKeywords")
   public SearchKeywords getSearchKeywords();
   
   @Valid
   @JsonProperty("state")
   public StateResourceIdentifier getState();
   /**
   *  <p>If <code>true</code>, the product is published immediately.</p>
   */
   
   @JsonProperty("publish")
   public Boolean getPublish();

   public void setProductType(final ProductTypeResourceIdentifier productType);
   
   public void setName(final LocalizedString name);
   
   public void setSlug(final LocalizedString slug);
   
   public void setKey(final String key);
   
   public void setDescription(final LocalizedString description);
   
   public void setCategories(final List<CategoryResourceIdentifier> categories);
   
   public void setCategoryOrderHints(final CategoryOrderHints categoryOrderHints);
   
   public void setMetaTitle(final LocalizedString metaTitle);
   
   public void setMetaDescription(final LocalizedString metaDescription);
   
   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public void setMasterVariant(final ProductVariantDraft masterVariant);
   
   public void setVariants(final List<ProductVariantDraft> variants);
   
   public void setTaxCategory(final TaxCategoryResourceIdentifier taxCategory);
   
   public void setSearchKeywords(final SearchKeywords searchKeywords);
   
   public void setState(final StateResourceIdentifier state);
   
   public void setPublish(final Boolean publish);
   
   public static ProductDraftImpl of(){
      return new ProductDraftImpl();
   }
   

   public static ProductDraftImpl of(final ProductDraft template) {
      ProductDraftImpl instance = new ProductDraftImpl();
      instance.setSearchKeywords(template.getSearchKeywords());
      instance.setDescription(template.getDescription());
      instance.setVariants(template.getVariants());
      instance.setMetaDescription(template.getMetaDescription());
      instance.setTaxCategory(template.getTaxCategory());
      instance.setMetaKeywords(template.getMetaKeywords());
      instance.setCategoryOrderHints(template.getCategoryOrderHints());
      instance.setPublish(template.getPublish());
      instance.setMetaTitle(template.getMetaTitle());
      instance.setName(template.getName());
      instance.setState(template.getState());
      instance.setMasterVariant(template.getMasterVariant());
      instance.setCategories(template.getCategories());
      instance.setKey(template.getKey());
      instance.setSlug(template.getSlug());
      instance.setProductType(template.getProductType());
      return instance;
   }

}