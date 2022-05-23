
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.TaskStatusEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 <p>Represents a URL path to poll to get the results of an Asynchronous Request.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MissingPricesTaskStatus missingPricesTaskStatus = MissingPricesTaskStatus.builder()
           .state(TaskStatusEnum.PENDING)
           .expires(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .result(resultBuilder -> resultBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingPricesTaskStatusImpl.class)
public interface MissingPricesTaskStatus {

    @NotNull
    @JsonProperty("state")
    public TaskStatusEnum getState();

    /**
     *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
     */
    @NotNull
    @JsonProperty("expires")
    public ZonedDateTime getExpires();

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("result")
    public MissingPricesPagedQueryResult getResult();

    public void setState(final TaskStatusEnum state);

    public void setExpires(final ZonedDateTime expires);

    public void setResult(final MissingPricesPagedQueryResult result);

    public static MissingPricesTaskStatus of() {
        return new MissingPricesTaskStatusImpl();
    }

    public static MissingPricesTaskStatus of(final MissingPricesTaskStatus template) {
        MissingPricesTaskStatusImpl instance = new MissingPricesTaskStatusImpl();
        instance.setState(template.getState());
        instance.setExpires(template.getExpires());
        instance.setResult(template.getResult());
        return instance;
    }

    public static MissingPricesTaskStatusBuilder builder() {
        return MissingPricesTaskStatusBuilder.of();
    }

    public static MissingPricesTaskStatusBuilder builder(final MissingPricesTaskStatus template) {
        return MissingPricesTaskStatusBuilder.of(template);
    }

    default <T> T withMissingPricesTaskStatus(Function<MissingPricesTaskStatus, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingPricesTaskStatus> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingPricesTaskStatus>() {
            @Override
            public String toString() {
                return "TypeReference<MissingPricesTaskStatus>";
            }
        };
    }
}
