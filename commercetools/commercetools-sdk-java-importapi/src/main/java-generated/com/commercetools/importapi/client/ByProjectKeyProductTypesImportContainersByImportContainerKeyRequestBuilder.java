
package com.commercetools.importapi.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductTypesImportContainersByImportContainerKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String importContainerKey;

    public ByProjectKeyProductTypesImportContainersByImportContainerKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String importContainerKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.importContainerKey = importContainerKey;
    }

    public ByProjectKeyProductTypesImportContainersByImportContainerKeyPost post(
            com.commercetools.importapi.models.importrequests.ProductTypeImportRequest productTypeImportRequest) {
        return new ByProjectKeyProductTypesImportContainersByImportContainerKeyPost(apiHttpClient, projectKey,
            importContainerKey, productTypeImportRequest);
    }

}
