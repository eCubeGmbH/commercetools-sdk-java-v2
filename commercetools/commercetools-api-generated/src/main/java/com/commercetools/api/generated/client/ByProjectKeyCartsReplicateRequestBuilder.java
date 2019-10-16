package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCartsReplicateRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCartsReplicateRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCartsReplicatePost post(com.commercetools.api.generated.models.cart.ReplicaCartDraft replicaCartDraft) {
      return new ByProjectKeyCartsReplicatePost(apiHttpClient, projectKey, replicaCartDraft);
   }
   
}
