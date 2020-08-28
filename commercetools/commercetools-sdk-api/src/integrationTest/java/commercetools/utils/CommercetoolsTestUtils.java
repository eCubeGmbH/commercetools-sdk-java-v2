package commercetools.utils;

import com.commercetools.api.client.ByProjectKeyRequestBuilder;
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.client.ApiRoot;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LocalizedStringImpl;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.middlewares.LoggerMiddleware;
import io.vrap.rmf.impl.okhttp.VrapOkhttpClient;

import java.util.UUID;

public class CommercetoolsTestUtils {

    private static final VrapHttpClient vrapHttpClient = new VrapOkhttpClient();
    private static final ByProjectKeyRequestBuilder projectRoot;
    static{
        String logLevel = System.getenv("CTP_JVM_SDK_LOG_LEVEL");
        if("OFF".equals(logLevel)){
            projectRoot = ApiFactory.create(
                    getProjectKey(),
                    getClientId(),
                    getClientSecret(),
                    getScopes(),
                    "https://auth.europe-west1.gcp.commercetools.com/oauth/token",
                    "https://api.europe-west1.gcp.commercetools.com");
        }else{
            projectRoot = ApiFactory.create(
                    getProjectKey(),
                    getClientId(),
                    getClientSecret(),
                    getScopes(),
                    "https://auth.europe-west1.gcp.commercetools.com/oauth/token",
                    "https://api.europe-west1.gcp.commercetools.com",
                    LoggerMiddleware.LogLevel.INFO);
        }
    }

    public static String randomString() {
        return "random-string-" + UUID.randomUUID().toString();
    }

    public static String randomId() {
        return "random-id-" + UUID.randomUUID().toString();
    }

    public static String randomKey() {
        return "random-key-" + UUID.randomUUID().toString();
    }

    public static LocalizedString randomLocalizedString() {
        LocalizedString localizedString = new LocalizedStringImpl();
        localizedString.setValue(randomString(), randomString());
        return localizedString;
    }

    public static String getProjectKey() {
        return System.getenv("CTP_PROJECT_KEY");
    }

    public static String getClientId() {
        return System.getenv("CTP_CLIENT_ID");
    }

    public static String getClientSecret() {
        return System.getenv("CTP_CLIENT_SECRET");
    }

    public static String getScopes() {
        return "manage_project:" + getProjectKey() + " manage_api_clients:" + getProjectKey();
    }

    public static ByProjectKeyRequestBuilder getProjectRoot() {
        return projectRoot;
    }
}
