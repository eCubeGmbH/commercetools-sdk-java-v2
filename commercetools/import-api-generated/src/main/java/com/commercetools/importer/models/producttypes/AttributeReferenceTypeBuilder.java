package com.commercetools.importer.models.producttypes;

import com.commercetools.importer.models.common.ReferenceType;
import com.commercetools.importer.models.producttypes.AttributeType;
import com.commercetools.importer.models.producttypes.AttributeReferenceType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeReferenceTypeBuilder {
   
   
   private com.commercetools.importer.models.common.ReferenceType referenceTypeId;
   
   public AttributeReferenceTypeBuilder referenceTypeId( final com.commercetools.importer.models.common.ReferenceType referenceTypeId) {
      this.referenceTypeId = referenceTypeId;
      return this;
   }
   
   
   public com.commercetools.importer.models.common.ReferenceType getReferenceTypeId(){
      return this.referenceTypeId;
   }

   public AttributeReferenceType build() {
       return new AttributeReferenceTypeImpl(referenceTypeId);
   }
   
   public static AttributeReferenceTypeBuilder of() {
      return new AttributeReferenceTypeBuilder();
   }
   
   public static AttributeReferenceTypeBuilder of(final AttributeReferenceType template) {
      AttributeReferenceTypeBuilder builder = new AttributeReferenceTypeBuilder();
      builder.referenceTypeId = template.getReferenceTypeId();
      return builder;
   }
   
}