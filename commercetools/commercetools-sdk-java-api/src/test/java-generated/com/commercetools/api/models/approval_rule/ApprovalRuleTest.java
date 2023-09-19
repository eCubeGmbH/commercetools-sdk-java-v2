
package com.commercetools.api.models.approval_rule;

import java.time.ZonedDateTime;
import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class ApprovalRuleTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ApprovalRuleBuilder builder) {
        ApprovalRule approvalRule = builder.buildUnchecked();
        Assertions.assertThat(approvalRule).isInstanceOf(ApprovalRule.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ApprovalRule.builder().id("id") },
                new Object[] { ApprovalRule.builder().version(2L) },
                new Object[] { ApprovalRule.builder().createdAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] {
                        ApprovalRule.builder().createdBy(new com.commercetools.api.models.common.CreatedByImpl()) },
                new Object[] { ApprovalRule.builder().lastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z")) },
                new Object[] { ApprovalRule.builder()
                        .lastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl()) },
                new Object[] { ApprovalRule.builder().key("key") },
                new Object[] { ApprovalRule.builder().name("name") },
                new Object[] { ApprovalRule.builder().description("description") },
                new Object[] { ApprovalRule.builder()
                        .status(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active")) },
                new Object[] { ApprovalRule.builder().predicate("predicate") },
                new Object[] { ApprovalRule.builder()
                        .approvers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl()) },
                new Object[] { ApprovalRule.builder()
                        .requesters(Collections
                                .singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl())) },
                new Object[] { ApprovalRule.builder()
                        .businessUnit(
                            new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl()) } };
    }

    @Test
    public void id() {
        ApprovalRule value = ApprovalRule.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void version() {
        ApprovalRule value = ApprovalRule.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void createdAt() {
        ApprovalRule value = ApprovalRule.of();
        value.setCreatedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getCreatedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void createdBy() {
        ApprovalRule value = ApprovalRule.of();
        value.setCreatedBy(new com.commercetools.api.models.common.CreatedByImpl());
        Assertions.assertThat(value.getCreatedBy()).isEqualTo(new com.commercetools.api.models.common.CreatedByImpl());
    }

    @Test
    public void lastModifiedAt() {
        ApprovalRule value = ApprovalRule.of();
        value.setLastModifiedAt(ZonedDateTime.parse("2023-06-01T12:00Z"));
        Assertions.assertThat(value.getLastModifiedAt()).isEqualTo(ZonedDateTime.parse("2023-06-01T12:00Z"));
    }

    @Test
    public void lastModifiedBy() {
        ApprovalRule value = ApprovalRule.of();
        value.setLastModifiedBy(new com.commercetools.api.models.common.LastModifiedByImpl());
        Assertions.assertThat(value.getLastModifiedBy())
                .isEqualTo(new com.commercetools.api.models.common.LastModifiedByImpl());
    }

    @Test
    public void key() {
        ApprovalRule value = ApprovalRule.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void name() {
        ApprovalRule value = ApprovalRule.of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void description() {
        ApprovalRule value = ApprovalRule.of();
        value.setDescription("description");
        Assertions.assertThat(value.getDescription()).isEqualTo("description");
    }

    @Test
    public void status() {
        ApprovalRule value = ApprovalRule.of();
        value.setStatus(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
        Assertions.assertThat(value.getStatus())
                .isEqualTo(com.commercetools.api.models.approval_rule.ApprovalRuleStatus.findEnum("Active"));
    }

    @Test
    public void predicate() {
        ApprovalRule value = ApprovalRule.of();
        value.setPredicate("predicate");
        Assertions.assertThat(value.getPredicate()).isEqualTo("predicate");
    }

    @Test
    public void approvers() {
        ApprovalRule value = ApprovalRule.of();
        value.setApprovers(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
        Assertions.assertThat(value.getApprovers())
                .isEqualTo(new com.commercetools.api.models.approval_rule.ApproverHierarchyImpl());
    }

    @Test
    public void requesters() {
        ApprovalRule value = ApprovalRule.of();
        value.setRequesters(
            Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
        Assertions.assertThat(value.getRequesters())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.approval_rule.RuleRequesterImpl()));
    }

    @Test
    public void businessUnit() {
        ApprovalRule value = ApprovalRule.of();
        value.setBusinessUnit(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
        Assertions.assertThat(value.getBusinessUnit())
                .isEqualTo(new com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceImpl());
    }
}
