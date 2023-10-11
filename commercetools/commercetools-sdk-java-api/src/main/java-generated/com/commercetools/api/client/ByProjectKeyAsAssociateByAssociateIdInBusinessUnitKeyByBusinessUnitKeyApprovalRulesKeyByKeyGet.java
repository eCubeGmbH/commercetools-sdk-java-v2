
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.approval_rule.ApprovalRule>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .asAssociate()
 *            .withAssociateIdValue("{associateId}")
 *            .inBusinessUnitKeyWithBusinessUnitKeyValue("{businessUnitKey}")
 *            .approvalRules()
 *            .withKey("{key}")
 *            .get()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet extends
        ApiMethod<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet, com.commercetools.api.models.approval_rule.ApprovalRule>
        implements
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet> {

    public TypeReference<com.commercetools.api.models.approval_rule.ApprovalRule> resultType() {
        return new TypeReference<com.commercetools.api.models.approval_rule.ApprovalRule>() {
        };
    }

    private String projectKey;
    private String associateId;
    private String businessUnitKey;
    private String key;

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet(
            final ApiHttpClient apiHttpClient, String projectKey, String associateId, String businessUnitKey,
            String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.associateId = associateId;
        this.businessUnitKey = businessUnitKey;
        this.key = key;
    }

    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet(
            ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet t) {
        super(t);
        this.projectKey = t.projectKey;
        this.associateId = t.associateId;
        this.businessUnitKey = t.businessUnitKey;
        this.key = t.key;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/as-associate/%s/in-business-unit/key=%s/approval-rules/key=%s",
            this.projectKey, this.associateId, this.businessUnitKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.GET, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.approval_rule.ApprovalRule> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.approval_rule.ApprovalRule.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.approval_rule.ApprovalRule>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.approval_rule.ApprovalRule.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getAssociateId() {
        return this.associateId;
    }

    public String getBusinessUnitKey() {
        return this.businessUnitKey;
    }

    public String getKey() {
        return this.key;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setAssociateId(final String associateId) {
        this.associateId = associateId;
    }

    public void setBusinessUnitKey(final String businessUnitKey) {
        this.businessUnitKey = businessUnitKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet withExpand(
            final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet addExpand(
            final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet withExpand(
            final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet addExpand(
            final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet withExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet
     */
    public ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet addExpand(
            final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet withExpand(
            final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet
     */
    public <TValue> ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet addExpand(
            final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet that = (ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(associateId, that.associateId)
                .append(businessUnitKey, that.businessUnitKey)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(associateId)
                .append(businessUnitKey)
                .append(key)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet copy() {
        return new ByProjectKeyAsAssociateByAssociateIdInBusinessUnitKeyByBusinessUnitKeyApprovalRulesKeyByKeyGet(this);
    }
}
