package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyOrdersEditsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyOrdersEditsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyOrdersEditsKeyByKeyGet get() {
      return new ByProjectKeyOrdersEditsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyOrdersEditsKeyByKeyPost post(com.commercetools.api.generated.models.order_edit.OrderEditUpdate orderEditUpdate) {
      return new ByProjectKeyOrdersEditsKeyByKeyPost(apiHttpClient, projectKey, key, orderEditUpdate);
   }
   
   public ByProjectKeyOrdersEditsKeyByKeyDelete delete() {
      return new ByProjectKeyOrdersEditsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
