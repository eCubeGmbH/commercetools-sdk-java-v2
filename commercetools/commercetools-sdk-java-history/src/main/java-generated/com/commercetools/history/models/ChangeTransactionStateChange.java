
package com.commercetools.history.models;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeTransactionStateChangeImpl.class)
public interface ChangeTransactionStateChange extends Change {

    String CHANGE_TRANSACTION_STATE_CHANGE = "ChangeTransactionStateChange";

    /**
    *  <p>Update action for <code>changeTransactionState</code> on payments</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("transaction")
    public TransactionChangeValue getTransaction();

    @NotNull
    @JsonProperty("nextValue")
    public TransactionState getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public TransactionState getPreviousValue();

    public void setChange(final String change);

    public void setTransaction(final TransactionChangeValue transaction);

    public void setNextValue(final TransactionState nextValue);

    public void setPreviousValue(final TransactionState previousValue);

    public static ChangeTransactionStateChange of() {
        return new ChangeTransactionStateChangeImpl();
    }

    public static ChangeTransactionStateChange of(final ChangeTransactionStateChange template) {
        ChangeTransactionStateChangeImpl instance = new ChangeTransactionStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setTransaction(template.getTransaction());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeTransactionStateChangeBuilder builder() {
        return ChangeTransactionStateChangeBuilder.of();
    }

    public static ChangeTransactionStateChangeBuilder builder(final ChangeTransactionStateChange template) {
        return ChangeTransactionStateChangeBuilder.of(template);
    }

    default <T> T withChangeTransactionStateChange(Function<ChangeTransactionStateChange, T> helper) {
        return helper.apply(this);
    }
}
