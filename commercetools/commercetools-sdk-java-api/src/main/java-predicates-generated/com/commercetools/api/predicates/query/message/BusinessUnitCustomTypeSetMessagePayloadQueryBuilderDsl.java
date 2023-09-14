
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl {
    public BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl() {
    }

    public static BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl of() {
        return new BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl> customFields(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customFields"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl> oldTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldTypeId")),
            p -> new CombinationQueryPredicate<>(p, BusinessUnitCustomTypeSetMessagePayloadQueryBuilderDsl::of));
    }

}
