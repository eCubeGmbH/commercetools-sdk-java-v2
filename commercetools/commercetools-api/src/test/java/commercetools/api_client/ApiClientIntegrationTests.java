package commercetools.api_client;

import com.commercetools.models.api_client.ApiClient;
import com.commercetools.models.api_client.ApiClientPagedQueryResponse;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;
import org.junit.Test;

public class ApiClientIntegrationTests {
    
    @Test
    public void createAndDeleteById() {
        ApiClient apiClient = ApiClientFixtures.createApiClient();
        ApiClient deletedApiClient = ApiClientFixtures.deleteApiClient(apiClient.getId());

        Assert.assertEquals(apiClient.getId(), deletedApiClient.getId());
    }
    
    @Test
    public void getById() {
        ApiClientFixtures.withApiClient(apiClient -> {
            ApiClient queriedApiClient = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .apiClients()
                    .withId(apiClient.getId())
                    .get()
                    .executeBlocking().getBody();
            
            Assert.assertNotNull(queriedApiClient);
            Assert.assertEquals(queriedApiClient.getId(), apiClient.getId());
        });
    }
    
    @Test
    public void query() {
        ApiClientFixtures.withApiClient(apiClient -> {
            ApiClientPagedQueryResponse response = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                    .apiClients()
                    .get()
                    .addWhere("id=" + "\"" + apiClient.getId() + "\"")
                    .executeBlocking().getBody();

            Assert.assertNotNull(response);
            Assert.assertEquals(response.getResults().get(0).getId(), apiClient.getId());
        });
    }
}
