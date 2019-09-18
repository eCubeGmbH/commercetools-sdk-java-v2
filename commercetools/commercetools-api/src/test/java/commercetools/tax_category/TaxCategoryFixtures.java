package commercetools.tax_category;

import com.commercetools.models.tax_category.TaxCategory;
import com.commercetools.models.tax_category.TaxCategoryDraft;
import com.commercetools.models.tax_category.TaxCategoryDraftBuilder;
import commercetools.utils.CommercetoolsTestUtils;
import org.junit.Assert;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class TaxCategoryFixtures {
    
    public static void withTaxCategory(Consumer<TaxCategory> consumer) {
        TaxCategory taxCategory = createTaxCategory();
        consumer.accept(taxCategory);
        deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion());
    }
    
    public static void withUpdateableTaxCategory(UnaryOperator<TaxCategory> operator) {
        TaxCategory taxCategory = createTaxCategory();
        taxCategory = operator.apply(taxCategory);
        deleteTaxCategory(taxCategory.getId(), taxCategory.getVersion());
    }
    
    public static TaxCategory createTaxCategory() {
        TaxCategoryDraft taxCategoryDraft = TaxCategoryDraftBuilder.of()
                .name(CommercetoolsTestUtils.randomString())
                .key(CommercetoolsTestUtils.randomKey())
                .build();

        TaxCategory taxCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .taxCategories()
                .post(taxCategoryDraft)
                .executeBlocking().getBody();

        Assert.assertNotNull(taxCategory);
        Assert.assertEquals(taxCategoryDraft.getName(), taxCategory.getName());
        Assert.assertEquals(taxCategoryDraft.getKey(), taxCategory.getKey());
        
        return taxCategory;
    }
    
    public static TaxCategory deleteTaxCategory(final String id, final Long version) {
        TaxCategory deletedTaxCategory = CommercetoolsTestUtils.getApiRoot().withProjectKey(CommercetoolsTestUtils.getProjectKey())
                .taxCategories()
                .withId(id)
                .delete()
                .addVersion(version)
                .executeBlocking().getBody();

        Assert.assertNotNull(deletedTaxCategory);
        Assert.assertEquals(deletedTaxCategory.getId(), id);
        
        return deletedTaxCategory;
    }
    
}
