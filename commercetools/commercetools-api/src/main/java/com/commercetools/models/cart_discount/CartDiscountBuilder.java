package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountTarget;
import com.commercetools.models.cart_discount.CartDiscountValue;
import com.commercetools.models.cart_discount.StackingMode;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.common.Reference;
import com.commercetools.models.type.CustomFields;
import java.lang.Boolean;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.cart_discount.CartDiscount;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   
   private java.lang.Boolean requiresDiscountCode;
   
   
   private java.util.List<com.commercetools.models.common.Reference> references;
   
   
   private java.lang.String cartPredicate;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   
   private java.lang.Boolean isActive;
   
   @Nullable
   private com.commercetools.models.cart_discount.CartDiscountTarget target;
   
   
   private com.commercetools.models.cart_discount.StackingMode stackingMode;
   
   
   private java.lang.String sortOrder;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   
   private com.commercetools.models.cart_discount.CartDiscountValue value;
   
   @Nullable
   private java.lang.String key;
   
   public CartDiscountBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CartDiscountBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CartDiscountBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CartDiscountBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CartDiscountBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CartDiscountBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CartDiscountBuilder requiresDiscountCode( final java.lang.Boolean requiresDiscountCode) {
      this.requiresDiscountCode = requiresDiscountCode;
      return this;
   }
   
   public CartDiscountBuilder references( final java.util.List<com.commercetools.models.common.Reference> references) {
      this.references = references;
      return this;
   }
   
   public CartDiscountBuilder cartPredicate( final java.lang.String cartPredicate) {
      this.cartPredicate = cartPredicate;
      return this;
   }
   
   public CartDiscountBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CartDiscountBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public CartDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public CartDiscountBuilder isActive( final java.lang.Boolean isActive) {
      this.isActive = isActive;
      return this;
   }
   
   public CartDiscountBuilder target(@Nullable final com.commercetools.models.cart_discount.CartDiscountTarget target) {
      this.target = target;
      return this;
   }
   
   public CartDiscountBuilder stackingMode( final com.commercetools.models.cart_discount.StackingMode stackingMode) {
      this.stackingMode = stackingMode;
      return this;
   }
   
   public CartDiscountBuilder sortOrder( final java.lang.String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   public CartDiscountBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public CartDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   public CartDiscountBuilder value( final com.commercetools.models.cart_discount.CartDiscountValue value) {
      this.value = value;
      return this;
   }
   
   public CartDiscountBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.lang.Boolean getRequiresDiscountCode(){
      return this.requiresDiscountCode;
   }
   
   
   public java.util.List<com.commercetools.models.common.Reference> getReferences(){
      return this.references;
   }
   
   
   public java.lang.String getCartPredicate(){
      return this.cartPredicate;
   }
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   
   public java.lang.Boolean getIsActive(){
      return this.isActive;
   }
   
   @Nullable
   public com.commercetools.models.cart_discount.CartDiscountTarget getTarget(){
      return this.target;
   }
   
   
   public com.commercetools.models.cart_discount.StackingMode getStackingMode(){
      return this.stackingMode;
   }
   
   
   public java.lang.String getSortOrder(){
      return this.sortOrder;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }
   
   
   public com.commercetools.models.cart_discount.CartDiscountValue getValue(){
      return this.value;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public CartDiscount build() {
       return new CartDiscountImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, requiresDiscountCode, references, cartPredicate, custom, description, validFrom, isActive, target, stackingMode, sortOrder, name, validUntil, value, key);
   }
   
   public static CartDiscountBuilder of() {
      return new CartDiscountBuilder();
   }
   
   public static CartDiscountBuilder of(final CartDiscount template) {
      CartDiscountBuilder builder = new CartDiscountBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.requiresDiscountCode = template.getRequiresDiscountCode();
      builder.references = template.getReferences();
      builder.cartPredicate = template.getCartPredicate();
      builder.custom = template.getCustom();
      builder.description = template.getDescription();
      builder.validFrom = template.getValidFrom();
      builder.isActive = template.getIsActive();
      builder.target = template.getTarget();
      builder.stackingMode = template.getStackingMode();
      builder.sortOrder = template.getSortOrder();
      builder.name = template.getName();
      builder.validUntil = template.getValidUntil();
      builder.value = template.getValue();
      builder.key = template.getKey();
      return builder;
   }
   
}