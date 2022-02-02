
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Creating a category produces the CategoryCreated message.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyCategoriesPost extends
        BodyApiMethod<ByProjectKeyCategoriesPost, com.commercetools.api.models.category.Category, com.commercetools.api.models.category.CategoryDraft>
        implements com.commercetools.api.client.ExpandableTrait<ByProjectKeyCategoriesPost>,
        com.commercetools.api.client.Deprecatable201Trait<ByProjectKeyCategoriesPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyCategoriesPost> {

    private String projectKey;

    private com.commercetools.api.models.category.CategoryDraft categoryDraft;

    public ByProjectKeyCategoriesPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.categoryDraft = categoryDraft;
    }

    public ByProjectKeyCategoriesPost(ByProjectKeyCategoriesPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.categoryDraft = t.categoryDraft;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/categories", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(categoryDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.category.Category> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.category.Category.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.category.Category>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.category.Category.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set expand with the specificied value
     */
    public ByProjectKeyCategoriesPost withExpand(final String expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     */
    public ByProjectKeyCategoriesPost addExpand(final String expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specificied values
     */
    public ByProjectKeyCategoriesPost withExpand(final List<String> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     */
    public ByProjectKeyCategoriesPost addExpand(final List<String> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.category.CategoryDraft getBody() {
        return categoryDraft;
    }

    public ByProjectKeyCategoriesPost withBody(com.commercetools.api.models.category.CategoryDraft categoryDraft) {
        ByProjectKeyCategoriesPost t = copy();
        t.categoryDraft = categoryDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCategoriesPost that = (ByProjectKeyCategoriesPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(categoryDraft, that.categoryDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(categoryDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyCategoriesPost copy() {
        return new ByProjectKeyCategoriesPost(this);
    }
}
