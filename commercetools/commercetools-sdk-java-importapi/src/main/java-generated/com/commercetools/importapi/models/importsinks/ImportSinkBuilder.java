
package com.commercetools.importapi.models.importsinks;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ImportSink importSink = ImportSink.builder()
           .key("{key}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImportSinkBuilder implements Builder<ImportSink> {

    private String key;

    @Nullable
    private com.commercetools.importapi.models.common.ImportResourceType resourceType;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    /**
     *  <p>User-defined unique identifier for the ImportSink. Keys can only contain alphanumeric characters (a-Z, 0-9), underscores and hyphens (_, -).</p>
     */

    public ImportSinkBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The resource type the ImportSink is able to handle. If not present, the ImportSink is able to import all of the supported ImportResourceTypes.</p>
     */

    public ImportSinkBuilder resourceType(
            @Nullable final com.commercetools.importapi.models.common.ImportResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     *  <p>The version of the ImportSink.</p>
     */

    public ImportSinkBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>The time when the ImportSink was created.</p>
     */

    public ImportSinkBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>The last time when the ImportSink was modified.</p>
     */

    public ImportSinkBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.importapi.models.common.ImportResourceType getResourceType() {
        return this.resourceType;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    public ImportSink build() {
        Objects.requireNonNull(key, ImportSink.class + ": key is missing");
        Objects.requireNonNull(version, ImportSink.class + ": version is missing");
        Objects.requireNonNull(createdAt, ImportSink.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, ImportSink.class + ": lastModifiedAt is missing");
        return new ImportSinkImpl(key, resourceType, version, createdAt, lastModifiedAt);
    }

    /**
     * builds ImportSink without checking for non null required values
     */
    public ImportSink buildUnchecked() {
        return new ImportSinkImpl(key, resourceType, version, createdAt, lastModifiedAt);
    }

    public static ImportSinkBuilder of() {
        return new ImportSinkBuilder();
    }

    public static ImportSinkBuilder of(final ImportSink template) {
        ImportSinkBuilder builder = new ImportSinkBuilder();
        builder.key = template.getKey();
        builder.resourceType = template.getResourceType();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        return builder;
    }

}
