
package com.commercetools.api.client.resource;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

import com.commercetools.api.client.ApiRoot;
import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.error.ApiClientException;
import io.vrap.rmf.base.client.error.ApiServerException;
import io.vrap.rmf.base.client.utils.Generated;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ByProjectKeyInStoreKeyByStoreKeyProductProjectionsTest {
    private final VrapHttpClient httpClientMock = Mockito.mock(VrapHttpClient.class);
    private final String projectKey = "test_projectKey";
    private final static ApiRoot apiRoot = ApiRoot.of();
    private final ApiHttpClient client = ClientBuilder.of(httpClientMock).defaultClient("").build();

    @TestTemplate
    @UseDataProvider("requestWithMethodParameters")
    public void withMethods(ApiHttpRequest request, String httpMethod, String uri) {
        Assertions.assertThat(httpMethod).isEqualTo(request.getMethod().name().toLowerCase());
        Assertions.assertThat(uri).isEqualTo(request.getUri().toString());
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeServerException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(500, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiServerException.class);
    }

    @TestTemplate
    @UseDataProvider("executeMethodParameters")
    public void executeClientException(ClientRequestCommand<?> httpRequest) throws Exception {
        Mockito.when(httpClientMock.execute(Mockito.any()))
                .thenReturn(CompletableFuture.completedFuture(
                    new ApiHttpResponse<>(400, null, "".getBytes(StandardCharsets.UTF_8), "Oops!")));

        Assertions.assertThatThrownBy(() -> client.execute(httpRequest).toCompletableFuture().get())
                .hasCauseInstanceOf(ApiClientException.class);
    }

    @DataProvider
    public static Object[][] requestWithMethodParameters() {
        return new Object[][] {
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withStaged(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/in-store/key=test_storeKey/product-projections?staged=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withPriceCurrency("priceCurrency")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/in-store/key=test_storeKey/product-projections?priceCurrency=priceCurrency", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withPriceCountry("priceCountry")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/in-store/key=test_storeKey/product-projections?priceCountry=priceCountry", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withPriceCustomerGroup("priceCustomerGroup")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/in-store/key=test_storeKey/product-projections?priceCustomerGroup=priceCustomerGroup", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withPriceChannel("priceChannel")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/in-store/key=test_storeKey/product-projections?priceChannel=priceChannel", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withLocaleProjection("localeProjection")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/in-store/key=test_storeKey/product-projections?localeProjection=localeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withStoreProjection("storeProjection")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/in-store/key=test_storeKey/product-projections?storeProjection=storeProjection", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withExpand("expand")
                                .createHttpRequest(),
                        "get", "/test_projectKey/in-store/key=test_storeKey/product-projections?expand=expand", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withSort("sort")
                                .createHttpRequest(),
                        "get", "/test_projectKey/in-store/key=test_storeKey/product-projections?sort=sort", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withLimit(7)
                                .createHttpRequest(),
                        "get", "/test_projectKey/in-store/key=test_storeKey/product-projections?limit=7", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withOffset(3)
                                .createHttpRequest(),
                        "get", "/test_projectKey/in-store/key=test_storeKey/product-projections?offset=3", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withWithTotal(true)
                                .createHttpRequest(),
                        "get", "/test_projectKey/in-store/key=test_storeKey/product-projections?withTotal=true", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withWhere("where")
                                .createHttpRequest(),
                        "get", "/test_projectKey/in-store/key=test_storeKey/product-projections?where=where", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .withPredicateVar("varName", "var.varName")
                                .createHttpRequest(),
                        "get",
                        "/test_projectKey/in-store/key=test_storeKey/product-projections?var.varName=var.varName", },
                new Object[] {
                        apiRoot.withProjectKey("test_projectKey")
                                .inStoreKeyWithStoreKeyValue("test_storeKey")
                                .productProjections()
                                .get()
                                .createHttpRequest(),
                        "get", "/test_projectKey/in-store/key=test_storeKey/product-projections", } };
    }

    @DataProvider
    public static Object[][] executeMethodParameters() {
        return new Object[][] {
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withStaged(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withPriceCurrency("priceCurrency"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withPriceCountry("priceCountry"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withPriceCustomerGroup("priceCustomerGroup"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withPriceChannel("priceChannel"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withLocaleProjection("localeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withStoreProjection("storeProjection"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withExpand("expand"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withSort("sort"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withLimit(7), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withOffset(3), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withWithTotal(true), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withWhere("where"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get()
                        .withPredicateVar("varName", "var.varName"), },
                new Object[] { apiRoot.withProjectKey("test_projectKey")
                        .inStoreKeyWithStoreKeyValue("test_storeKey")
                        .productProjections()
                        .get(), } };
    }
}
