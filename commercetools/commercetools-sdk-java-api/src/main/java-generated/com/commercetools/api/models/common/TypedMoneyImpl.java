
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TypedMoneyImpl implements TypedMoney, ModelBase {

    private Long centAmount;

    private String currencyCode;

    private com.commercetools.api.models.common.MoneyType type;

    private Integer fractionDigits;

    @JsonCreator
    TypedMoneyImpl(@JsonProperty("centAmount") final Long centAmount,
            @JsonProperty("currencyCode") final String currencyCode,
            @JsonProperty("type") final com.commercetools.api.models.common.MoneyType type,
            @JsonProperty("fractionDigits") final Integer fractionDigits) {
        this.centAmount = centAmount;
        this.currencyCode = currencyCode;
        this.type = type;
        this.fractionDigits = fractionDigits;
    }

    public TypedMoneyImpl() {
    }

    /**
    *  <p>amount in the smallest indivisible unit of a currency, such as</p>
    *  <ul>
    *  <li>cents for EUR and USD, pence for GBP, or centime for CHF (5 CHF is specified as 500).</li>
    *  <li>the value in the major unit for currencies without minor units, like JPY (5 JPY is specified as 5).</li>
    *  </ul>
    */
    public Long getCentAmount() {
        return this.centAmount;
    }

    /**
    *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
    */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
    *  <p>The platform supports two different types of Money, one for amounts in cent precision and another one for sub-cent amounts up to 12 fraction digits.</p>
    */
    public com.commercetools.api.models.common.MoneyType getType() {
        return this.type;
    }

    /**
    *  <p>number of digits after the decimal separator</p>
    *  <ul>
    *  <li>equal to the default number of fraction digits for a currency in <a href="ctp:api:type:CentPrecisionMoney">CentPrecisionMoney</a>.</li>
    *  <li>greater than the default number of fraction digits for a currency in <a href="ctp:api:type:HighPrecisionMoney">HighPrecisionMoney</a>.</li>
    *  </ul>
    */
    public Integer getFractionDigits() {
        return this.fractionDigits;
    }

    public void setCentAmount(final Long centAmount) {
        this.centAmount = centAmount;
    }

    public void setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setFractionDigits(final Integer fractionDigits) {
        this.fractionDigits = fractionDigits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TypedMoneyImpl that = (TypedMoneyImpl) o;

        return new EqualsBuilder().append(centAmount, that.centAmount)
                .append(currencyCode, that.currencyCode)
                .append(type, that.type)
                .append(fractionDigits, that.fractionDigits)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(centAmount)
                .append(currencyCode)
                .append(type)
                .append(fractionDigits)
                .toHashCode();
    }

}
