
package com.commercetools.history.models.change;

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
 *  <p>Change triggered by the Request Quote Renegotiation update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RequestQuoteRenegotiationChangeImpl implements RequestQuoteRenegotiationChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.QuoteState previousValue;

    private com.commercetools.history.models.common.QuoteState nextValue;

    private String buyerComment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RequestQuoteRenegotiationChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.QuoteState previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.QuoteState nextValue,
            @JsonProperty("buyerComment") final String buyerComment) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.buyerComment = buyerComment;
        this.type = REQUEST_QUOTE_RENEGOTIATION_CHANGE;
    }

    /**
     * create empty instance
     */
    public RequestQuoteRenegotiationChangeImpl() {
        this.type = REQUEST_QUOTE_RENEGOTIATION_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.QuoteState getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.QuoteState getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Message from the Buyer regarding the Quote renegotiation request.</p>
     */

    public String getBuyerComment() {
        return this.buyerComment;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.QuoteState previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.QuoteState nextValue) {
        this.nextValue = nextValue;
    }

    public void setBuyerComment(final String buyerComment) {
        this.buyerComment = buyerComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RequestQuoteRenegotiationChangeImpl that = (RequestQuoteRenegotiationChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(buyerComment, that.buyerComment)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(buyerComment, that.buyerComment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(buyerComment)
                .toHashCode();
    }

}
