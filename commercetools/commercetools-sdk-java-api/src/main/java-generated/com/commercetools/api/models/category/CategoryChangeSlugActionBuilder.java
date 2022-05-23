
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CategoryChangeSlugAction categoryChangeSlugAction = CategoryChangeSlugAction.builder()
           .slug(slugBuilder -> slugBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryChangeSlugActionBuilder implements Builder<CategoryChangeSlugAction> {

    private com.commercetools.api.models.common.LocalizedString slug;

    /**
     *  <p>Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters. Maximum size is {{ site.data.api-limits.slugLength }}.</p>
     */

    public CategoryChangeSlugActionBuilder slug(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.slug = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters. Maximum size is {{ site.data.api-limits.slugLength }}.</p>
     */

    public CategoryChangeSlugActionBuilder slug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    public CategoryChangeSlugAction build() {
        Objects.requireNonNull(slug, CategoryChangeSlugAction.class + ": slug is missing");
        return new CategoryChangeSlugActionImpl(slug);
    }

    /**
     * builds CategoryChangeSlugAction without checking for non null required values
     */
    public CategoryChangeSlugAction buildUnchecked() {
        return new CategoryChangeSlugActionImpl(slug);
    }

    public static CategoryChangeSlugActionBuilder of() {
        return new CategoryChangeSlugActionBuilder();
    }

    public static CategoryChangeSlugActionBuilder of(final CategoryChangeSlugAction template) {
        CategoryChangeSlugActionBuilder builder = new CategoryChangeSlugActionBuilder();
        builder.slug = template.getSlug();
        return builder;
    }

}
