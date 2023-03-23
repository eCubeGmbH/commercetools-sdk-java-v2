
package com.commercetools.api.models.store_country;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCountryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCountry storeCountry = StoreCountry.builder()
 *             .code("{code}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreCountryBuilder implements Builder<StoreCountry> {

    private String code;

    /**
     *  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>
     * @param code
     * @return Builder
     */

    public StoreCountryBuilder code(final String code) {
        this.code = code;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public StoreCountry build() {
        Objects.requireNonNull(code, StoreCountry.class + ": code is missing");
        return new StoreCountryImpl(code);
    }

    /**
     * builds StoreCountry without checking for non null required values
     */
    public StoreCountry buildUnchecked() {
        return new StoreCountryImpl(code);
    }

    public static StoreCountryBuilder of() {
        return new StoreCountryBuilder();
    }

    public static StoreCountryBuilder of(final StoreCountry template) {
        StoreCountryBuilder builder = new StoreCountryBuilder();
        builder.code = template.getCode();
        return builder;
    }

}
