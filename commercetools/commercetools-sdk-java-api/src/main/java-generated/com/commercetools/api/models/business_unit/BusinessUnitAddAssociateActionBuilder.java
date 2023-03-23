
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddAssociateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddAssociateAction businessUnitAddAssociateAction = BusinessUnitAddAssociateAction.builder()
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddAssociateActionBuilder implements Builder<BusinessUnitAddAssociateAction> {

    private com.commercetools.api.models.business_unit.AssociateDraft associate;

    /**
     *  <p>The Associate to add.</p>
     * @return Builder
     */

    public BusinessUnitAddAssociateActionBuilder associate(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        this.associate = builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Associate to add.</p>
     * @param associate
     * @return Builder
     */

    public BusinessUnitAddAssociateActionBuilder associate(
            final com.commercetools.api.models.business_unit.AssociateDraft associate) {
        this.associate = associate;
        return this;
    }

    public com.commercetools.api.models.business_unit.AssociateDraft getAssociate() {
        return this.associate;
    }

    public BusinessUnitAddAssociateAction build() {
        Objects.requireNonNull(associate, BusinessUnitAddAssociateAction.class + ": associate is missing");
        return new BusinessUnitAddAssociateActionImpl(associate);
    }

    /**
     * builds BusinessUnitAddAssociateAction without checking for non null required values
     */
    public BusinessUnitAddAssociateAction buildUnchecked() {
        return new BusinessUnitAddAssociateActionImpl(associate);
    }

    public static BusinessUnitAddAssociateActionBuilder of() {
        return new BusinessUnitAddAssociateActionBuilder();
    }

    public static BusinessUnitAddAssociateActionBuilder of(final BusinessUnitAddAssociateAction template) {
        BusinessUnitAddAssociateActionBuilder builder = new BusinessUnitAddAssociateActionBuilder();
        builder.associate = template.getAssociate();
        return builder;
    }

}
