
package com.commercetools.importapi.models.common;

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
public class AddressTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(AddressBuilder builder) {
        Address address = builder.buildUnchecked();
        Assertions.assertThat(address).isInstanceOf(Address.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Address.builder().id("id") },
                new Object[] { Address.builder().key("key") }, new Object[] { Address.builder().title("title") },
                new Object[] { Address.builder().salutation("salutation") },
                new Object[] { Address.builder().firstName("firstName") },
                new Object[] { Address.builder().lastName("lastName") },
                new Object[] { Address.builder().streetName("streetName") },
                new Object[] { Address.builder().streetNumber("streetNumber") },
                new Object[] { Address.builder().additionalStreetInfo("additionalStreetInfo") },
                new Object[] { Address.builder().postalCode("postalCode") },
                new Object[] { Address.builder().city("city") }, new Object[] { Address.builder().region("region") },
                new Object[] { Address.builder().state("state") },
                new Object[] { Address.builder().country("country") },
                new Object[] { Address.builder().company("company") },
                new Object[] { Address.builder().department("department") },
                new Object[] { Address.builder().building("building") },
                new Object[] { Address.builder().apartment("apartment") },
                new Object[] { Address.builder().pOBox("pOBox") }, new Object[] { Address.builder().phone("phone") },
                new Object[] { Address.builder().mobile("mobile") }, new Object[] { Address.builder().email("email") },
                new Object[] { Address.builder().fax("fax") },
                new Object[] { Address.builder().additionalAddressInfo("additionalAddressInfo") },
                new Object[] { Address.builder().externalId("externalId") }, new Object[] {
                        Address.builder().custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void id() {
        Address value = Address.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        Address value = Address.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void title() {
        Address value = Address.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void salutation() {
        Address value = Address.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }

    @Test
    public void firstName() {
        Address value = Address.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }

    @Test
    public void lastName() {
        Address value = Address.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void streetName() {
        Address value = Address.of();
        value.setStreetName("streetName");
        Assertions.assertThat(value.getStreetName()).isEqualTo("streetName");
    }

    @Test
    public void streetNumber() {
        Address value = Address.of();
        value.setStreetNumber("streetNumber");
        Assertions.assertThat(value.getStreetNumber()).isEqualTo("streetNumber");
    }

    @Test
    public void additionalStreetInfo() {
        Address value = Address.of();
        value.setAdditionalStreetInfo("additionalStreetInfo");
        Assertions.assertThat(value.getAdditionalStreetInfo()).isEqualTo("additionalStreetInfo");
    }

    @Test
    public void postalCode() {
        Address value = Address.of();
        value.setPostalCode("postalCode");
        Assertions.assertThat(value.getPostalCode()).isEqualTo("postalCode");
    }

    @Test
    public void city() {
        Address value = Address.of();
        value.setCity("city");
        Assertions.assertThat(value.getCity()).isEqualTo("city");
    }

    @Test
    public void region() {
        Address value = Address.of();
        value.setRegion("region");
        Assertions.assertThat(value.getRegion()).isEqualTo("region");
    }

    @Test
    public void state() {
        Address value = Address.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }

    @Test
    public void country() {
        Address value = Address.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void company() {
        Address value = Address.of();
        value.setCompany("company");
        Assertions.assertThat(value.getCompany()).isEqualTo("company");
    }

    @Test
    public void department() {
        Address value = Address.of();
        value.setDepartment("department");
        Assertions.assertThat(value.getDepartment()).isEqualTo("department");
    }

    @Test
    public void building() {
        Address value = Address.of();
        value.setBuilding("building");
        Assertions.assertThat(value.getBuilding()).isEqualTo("building");
    }

    @Test
    public void apartment() {
        Address value = Address.of();
        value.setApartment("apartment");
        Assertions.assertThat(value.getApartment()).isEqualTo("apartment");
    }

    @Test
    public void pOBox() {
        Address value = Address.of();
        value.setPOBox("pOBox");
        Assertions.assertThat(value.getPOBox()).isEqualTo("pOBox");
    }

    @Test
    public void phone() {
        Address value = Address.of();
        value.setPhone("phone");
        Assertions.assertThat(value.getPhone()).isEqualTo("phone");
    }

    @Test
    public void mobile() {
        Address value = Address.of();
        value.setMobile("mobile");
        Assertions.assertThat(value.getMobile()).isEqualTo("mobile");
    }

    @Test
    public void email() {
        Address value = Address.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void fax() {
        Address value = Address.of();
        value.setFax("fax");
        Assertions.assertThat(value.getFax()).isEqualTo("fax");
    }

    @Test
    public void additionalAddressInfo() {
        Address value = Address.of();
        value.setAdditionalAddressInfo("additionalAddressInfo");
        Assertions.assertThat(value.getAdditionalAddressInfo()).isEqualTo("additionalAddressInfo");
    }

    @Test
    public void externalId() {
        Address value = Address.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void custom() {
        Address value = Address.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
