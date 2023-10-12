
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
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.associate_role.AssociateRole>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .associateRoles()
 *            .withId("{ID}")
 *            .post(null)
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyAssociateRolesByIDPost extends
        TypeBodyApiMethod<ByProjectKeyAssociateRolesByIDPost, com.commercetools.api.models.associate_role.AssociateRole, com.commercetools.api.models.associate_role.AssociateRoleUpdate>
        implements com.commercetools.api.client.ConflictingTrait<ByProjectKeyAssociateRolesByIDPost>,
        com.commercetools.api.client.ExpandableTrait<ByProjectKeyAssociateRolesByIDPost>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyAssociateRolesByIDPost>,
        com.commercetools.api.client.ErrorableTrait<ByProjectKeyAssociateRolesByIDPost> {

    @Override
    public TypeReference<com.commercetools.api.models.associate_role.AssociateRole> resultType() {
        return new TypeReference<com.commercetools.api.models.associate_role.AssociateRole>() {
        };
    }

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.associate_role.AssociateRoleUpdate associateRoleUpdate;

    public ByProjectKeyAssociateRolesByIDPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.associate_role.AssociateRoleUpdate associateRoleUpdate) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.associateRoleUpdate = associateRoleUpdate;
    }

    public ByProjectKeyAssociateRolesByIDPost(ByProjectKeyAssociateRolesByIDPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.associateRoleUpdate = t.associateRoleUpdate;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/associate-roles/%s", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(associateRoleUpdate)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.associate_role.AssociateRole> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.associate_role.AssociateRole.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.associate_role.AssociateRole>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.associate_role.AssociateRole.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public List<String> getExpand() {
        return this.getQueryParam("expand");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    /**
     * set expand with the specified value
     * @param expand value to be set
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesByIDPost
     */
    public <TValue> ByProjectKeyAssociateRolesByIDPost withExpand(final TValue expand) {
        return copy().withQueryParam("expand", expand);
    }

    /**
     * add additional expand query parameter
     * @param expand value to be added
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesByIDPost
     */
    public <TValue> ByProjectKeyAssociateRolesByIDPost addExpand(final TValue expand) {
        return copy().addQueryParam("expand", expand);
    }

    /**
     * set expand with the specified value
     * @param supplier supplier for the value to be set
     * @return ByProjectKeyAssociateRolesByIDPost
     */
    public ByProjectKeyAssociateRolesByIDPost withExpand(final Supplier<String> supplier) {
        return copy().withQueryParam("expand", supplier.get());
    }

    /**
     * add additional expand query parameter
     * @param supplier supplier for the value to be added
     * @return ByProjectKeyAssociateRolesByIDPost
     */
    public ByProjectKeyAssociateRolesByIDPost addExpand(final Supplier<String> supplier) {
        return copy().addQueryParam("expand", supplier.get());
    }

    /**
     * set expand with the specified value
     * @param op builder for the value to be set
     * @return ByProjectKeyAssociateRolesByIDPost
     */
    public ByProjectKeyAssociateRolesByIDPost withExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().withQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * add additional expand query parameter
     * @param op builder for the value to be added
     * @return ByProjectKeyAssociateRolesByIDPost
     */
    public ByProjectKeyAssociateRolesByIDPost addExpand(final Function<StringBuilder, StringBuilder> op) {
        return copy().addQueryParam("expand", op.apply(new StringBuilder()));
    }

    /**
     * set expand with the specified values
     * @param expand values to be set
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesByIDPost
     */
    public <TValue> ByProjectKeyAssociateRolesByIDPost withExpand(final Collection<TValue> expand) {
        return copy().withoutQueryParam("expand")
                .addQueryParams(
                    expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional expand query parameters
     * @param expand values to be added
     * @param <TValue> value type
     * @return ByProjectKeyAssociateRolesByIDPost
     */
    public <TValue> ByProjectKeyAssociateRolesByIDPost addExpand(final Collection<TValue> expand) {
        return copy().addQueryParams(
            expand.stream().map(s -> new ParamEntry<>("expand", s.toString())).collect(Collectors.toList()));
    }

    public com.commercetools.api.models.associate_role.AssociateRoleUpdate getBody() {
        return associateRoleUpdate;
    }

    public ByProjectKeyAssociateRolesByIDPost withBody(
            com.commercetools.api.models.associate_role.AssociateRoleUpdate associateRoleUpdate) {
        ByProjectKeyAssociateRolesByIDPost t = copy();
        t.associateRoleUpdate = associateRoleUpdate;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyAssociateRolesByIDPost that = (ByProjectKeyAssociateRolesByIDPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(associateRoleUpdate, that.associateRoleUpdate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(associateRoleUpdate).toHashCode();
    }

    @Override
    protected ByProjectKeyAssociateRolesByIDPost copy() {
        return new ByProjectKeyAssociateRolesByIDPost(this);
    }
}
