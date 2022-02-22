
package com.commercetools.api.models.project;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchIndexingConfigurationValuesImpl.class)
public interface SearchIndexingConfigurationValues {

    /**
    *  <p>Current status of resource indexing. Present on Projects from 1 February 2019.</p>
    */

    @JsonProperty("status")
    public SearchIndexingConfigurationStatus getStatus();

    /**
    *  <p>Date and time (UTC) the Project was last updated.</p>
    */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */

    @JsonProperty("lastModifiedBy")
    public String getLastModifiedBy();

    public void setStatus(final SearchIndexingConfigurationStatus status);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final String lastModifiedBy);

    public static SearchIndexingConfigurationValues of() {
        return new SearchIndexingConfigurationValuesImpl();
    }

    public static SearchIndexingConfigurationValues of(final SearchIndexingConfigurationValues template) {
        SearchIndexingConfigurationValuesImpl instance = new SearchIndexingConfigurationValuesImpl();
        instance.setStatus(template.getStatus());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        return instance;
    }

    public static SearchIndexingConfigurationValuesBuilder builder() {
        return SearchIndexingConfigurationValuesBuilder.of();
    }

    public static SearchIndexingConfigurationValuesBuilder builder(final SearchIndexingConfigurationValues template) {
        return SearchIndexingConfigurationValuesBuilder.of(template);
    }

    default <T> T withSearchIndexingConfigurationValues(Function<SearchIndexingConfigurationValues, T> helper) {
        return helper.apply(this);
    }
}
