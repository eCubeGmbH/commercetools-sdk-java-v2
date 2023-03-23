
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxPortion
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxPortion taxPortion = TaxPortion.builder()
 *             .rate(0.3)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxPortionImpl.class)
public interface TaxPortion {

    /**
     *
     * @return name
     */

    @JsonProperty("name")
    public String getName();

    /**
     *
     * @return rate
     */
    @NotNull
    @JsonProperty("rate")
    public Double getRate();

    /**
     *
     * @return amount
     */
    @NotNull
    @Valid
    @JsonProperty("amount")
    public TypedMoney getAmount();

    public void setName(final String name);

    public void setRate(final Double rate);

    public void setAmount(final TypedMoney amount);

    public static TaxPortion of() {
        return new TaxPortionImpl();
    }

    public static TaxPortion of(final TaxPortion template) {
        TaxPortionImpl instance = new TaxPortionImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static TaxPortionBuilder builder() {
        return TaxPortionBuilder.of();
    }

    public static TaxPortionBuilder builder(final TaxPortion template) {
        return TaxPortionBuilder.of(template);
    }

    default <T> T withTaxPortion(Function<TaxPortion, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TaxPortion> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxPortion>() {
            @Override
            public String toString() {
                return "TypeReference<TaxPortion>";
            }
        };
    }
}
