
package com.commercetools.importapi.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 <p>Creates import request for creating new product types or updating existing ones.</p>

 <div class=code-example>
 <pre><code class='java'>{@code
   CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> result = apiRoot
           .withProjectKeyValue("{projectKey}")
           .productTypes()
           .importSinkKeyWithImportSinkKeyValue("{importSinkKey}")
           .post(null)
           .execute()
 }</code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost extends
        BodyApiMethod<ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost, com.commercetools.importapi.models.importrequests.ImportResponse, com.commercetools.importapi.models.importrequests.ProductTypeImportRequest>
        implements
        com.commercetools.importapi.client.Secured_by_manage_productsTrait<ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost> {

    private String projectKey;
    private String importSinkKey;

    private com.commercetools.importapi.models.importrequests.ProductTypeImportRequest productTypeImportRequest;

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost(final ApiHttpClient apiHttpClient,
            String projectKey, String importSinkKey,
            com.commercetools.importapi.models.importrequests.ProductTypeImportRequest productTypeImportRequest) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.importSinkKey = importSinkKey;
        this.productTypeImportRequest = productTypeImportRequest;
    }

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost(
            ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.importSinkKey = t.importSinkKey;
        this.productTypeImportRequest = t.productTypeImportRequest;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-types/importSinkKey=%s", this.projectKey,
            this.importSinkKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(productTypeImportRequest)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.importapi.models.importrequests.ImportResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.importapi.models.importrequests.ImportResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getImportSinkKey() {
        return this.importSinkKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setImportSinkKey(final String importSinkKey) {
        this.importSinkKey = importSinkKey;
    }

    public com.commercetools.importapi.models.importrequests.ProductTypeImportRequest getBody() {
        return productTypeImportRequest;
    }

    public ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost withBody(
            com.commercetools.importapi.models.importrequests.ProductTypeImportRequest productTypeImportRequest) {
        ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost t = copy();
        t.productTypeImportRequest = productTypeImportRequest;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost that = (ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(importSinkKey, that.importSinkKey)
                .append(productTypeImportRequest, that.productTypeImportRequest)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(importSinkKey)
                .append(productTypeImportRequest)
                .toHashCode();
    }

    @Override
    protected ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost copy() {
        return new ByProjectKeyProductTypesImportSinkKeyByImportSinkKeyPost(this);
    }
}
