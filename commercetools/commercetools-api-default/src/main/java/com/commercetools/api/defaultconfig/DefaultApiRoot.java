package com.commercetools.api.defaultconfig;

import com.commercetools.api.generated.client.ApiRoot;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.middlewares.LoggerMiddleware;
import io.vrap.rmf.base.client.oauth2.ClientCredentialsTokenSupplier;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;

public class DefaultApiRoot {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();

    public static ApiRoot create(
            final String clientId,
            final String clientSecret,
            final String scopes,
            final String tokenEndpoint,
            final String apiEndpoint
    ) {
        return ApiRoot.fromMiddlewares(
                new HttpMiddleware(
                        apiEndpoint,
                        vrapHttpClient,
                        new ClientCredentialsTokenSupplier(
                                clientId,
                                clientSecret,
                                scopes,
                                tokenEndpoint
                                , vrapHttpClient
                        )
                ),
                new LoggerMiddleware()
        );
    }

}
