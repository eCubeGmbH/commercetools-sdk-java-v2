
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.CentPrecisionMoneyDraftImpl.class, name = CentPrecisionMoneyDraft.CENT_PRECISION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.common.HighPrecisionMoneyDraftImpl.class, name = HighPrecisionMoneyDraft.HIGH_PRECISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = TypedMoneyDraftImpl.class, visible = true)
@JsonDeserialize(as = TypedMoneyDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TypedMoneyDraft extends Money {

    /**
    *  <p>The commercetools Platform supports two different types of Money: one for amounts in cent precision and another one for sub-cent amounts up to 20 fraction digits.</p>
    */
    @NotNull
    @JsonProperty("type")
    public MoneyType getType();

    /**
    *  <p>Must be equal to the default number of fraction digits for the specified currency.</p>
    */

    @JsonProperty("fractionDigits")
    public Integer getFractionDigits();

    public void setFractionDigits(final Integer fractionDigits);

    public static com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder centPrecisionBuilder() {
        return com.commercetools.api.models.common.CentPrecisionMoneyDraftBuilder.of();
    }

    public static com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder highPrecisionBuilder() {
        return com.commercetools.api.models.common.HighPrecisionMoneyDraftBuilder.of();
    }

    default <T> T withTypedMoneyDraft(Function<TypedMoneyDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypedMoneyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypedMoneyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<TypedMoneyDraft>";
            }
        };
    }
}
