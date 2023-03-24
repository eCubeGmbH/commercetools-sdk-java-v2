
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDraft customerDraft = CustomerDraft.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerDraftBuilder implements Builder<CustomerDraft> {

    @Nullable
    private String key;

    @Nullable
    private String customerNumber;

    @Nullable
    private String externalId;

    private String email;

    @Nullable
    private String password;

    @Nullable
    private String firstName;

    @Nullable
    private String lastName;

    @Nullable
    private String middleName;

    @Nullable
    private String title;

    @Deprecated
    @Nullable
    private String anonymousCartId;

    @Nullable
    private com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart;

    @Nullable
    private String anonymousId;

    @Nullable
    private java.time.LocalDate dateOfBirth;

    @Nullable
    private String companyName;

    @Nullable
    private String vatId;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.BaseAddress> addresses;

    @Nullable
    private Integer defaultShippingAddress;

    @Nullable
    private java.util.List<Integer> shippingAddresses;

    @Nullable
    private Integer defaultBillingAddress;

    @Nullable
    private java.util.List<Integer> billingAddresses;

    @Nullable
    private Boolean isEmailVerified;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String locale;

    @Nullable
    private String salutation;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    @Nullable
    private com.commercetools.api.models.customer.AuthenticationMode authenticationMode;

    /**
     *  <p>User-defined unique identifier for the Customer. The <code>key</code> field is preferred over <code>customerNumber</code> as it is mutable and provides more flexibility.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomerDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for a Customer. Once set, it cannot be changed.</p>
     *  <p>Can be used to refer to a Customer in a human-readable way (in emails, invoices, and other correspondence).</p>
     * @param customerNumber value to be set
     * @return Builder
     */

    public CustomerDraftBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     *  <p>Optional identifier for use in external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     * @param externalId value to be set
     * @return Builder
     */

    public CustomerDraftBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Email address of the Customer that must be unique for an entire Project or to a Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     * @param email value to be set
     * @return Builder
     */

    public CustomerDraftBuilder email(final String email) {
        this.email = email;
        return this;
    }

    /**
     *  <p>Required when <code>authenticationMode</code> is set to <code>Password</code>. Provide the Customer's password in plain text. The API stores passwords in an encrypted format.</p>
     * @param password value to be set
     * @return Builder
     */

    public CustomerDraftBuilder password(@Nullable final String password) {
        this.password = password;
        return this;
    }

    /**
     *  <p>Given name (first name) of the Customer.</p>
     * @param firstName value to be set
     * @return Builder
     */

    public CustomerDraftBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *  <p>Family name (last name) of the Customer.</p>
     * @param lastName value to be set
     * @return Builder
     */

    public CustomerDraftBuilder lastName(@Nullable final String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *  <p>Middle name of the Customer.</p>
     * @param middleName value to be set
     * @return Builder
     */

    public CustomerDraftBuilder middleName(@Nullable final String middleName) {
        this.middleName = middleName;
        return this;
    }

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     * @param title value to be set
     * @return Builder
     */

    public CustomerDraftBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *  <p>Deprecated since an anonymous Cart can be identified by its <code>id</code> or external <code>key</code>.</p>
     * @param anonymousCartId value to be set
     * @return Builder
     */
    @Deprecated
    public CustomerDraftBuilder anonymousCartId(@Nullable final String anonymousCartId) {
        this.anonymousCartId = anonymousCartId;
        return this;
    }

    /**
     *  <p>Identifies a Cart that will be assigned to the new Customer.</p>
     * @param builder function to build the anonymousCart value
     * @return Builder
     */

    public CustomerDraftBuilder anonymousCart(
            Function<com.commercetools.api.models.cart.CartResourceIdentifierBuilder, com.commercetools.api.models.cart.CartResourceIdentifierBuilder> builder) {
        this.anonymousCart = builder.apply(com.commercetools.api.models.cart.CartResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Identifies a Cart that will be assigned to the new Customer.</p>
     * @param anonymousCart value to be set
     * @return Builder
     */

    public CustomerDraftBuilder anonymousCart(
            @Nullable final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
        return this;
    }

    /**
     *  <p>Identifies Carts and Orders belonging to an anonymous session that will be assigned to the new Customer.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public CustomerDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Date of birth of the Customer.</p>
     * @param dateOfBirth value to be set
     * @return Builder
     */

    public CustomerDraftBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     *  <p>Company name of the Customer. When representing a company as a Customer, Business Units provide extended funtionality.</p>
     * @param companyName value to be set
     * @return Builder
     */

    public CustomerDraftBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     *  <p>Unique VAT ID of the Customer.</p>
     * @param vatId value to be set
     * @return Builder
     */

    public CustomerDraftBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CustomerDraftBuilder addresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CustomerDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CustomerDraftBuilder plusAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CustomerDraftBuilder plusAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CustomerDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @param defaultShippingAddress value to be set
     * @return Builder
     */

    public CustomerDraftBuilder defaultShippingAddress(@Nullable final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>Indices of the shipping addresses in the <code>addresses</code> array. The <code>shippingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CustomerDraftBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Indices of the shipping addresses in the <code>addresses</code> array. The <code>shippingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CustomerDraftBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>Indices of the shipping addresses in the <code>addresses</code> array. The <code>shippingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CustomerDraftBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @param defaultBillingAddress value to be set
     * @return Builder
     */

    public CustomerDraftBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>Indices of the billing addresses in the <code>addresses</code> array. The <code>billingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CustomerDraftBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Indices of the billing addresses in the <code>addresses</code> array. The <code>billingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CustomerDraftBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>Indices of the billing addresses in the <code>addresses</code> array. The <code>billingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CustomerDraftBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Set to <code>true</code> if the email address of the Customer has been verified already. The intended use is to leave this field unset upon sign-up of the Customer and initiate the email verification afterwards.</p>
     * @param isEmailVerified value to be set
     * @return Builder
     */

    public CustomerDraftBuilder isEmailVerified(@Nullable final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
        return this;
    }

    /**
     *  <p>Sets the CustomerGroup for the Customer.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */

    public CustomerDraftBuilder customerGroup(
            Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder
                .apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Sets the CustomerGroup for the Customer.</p>
     * @param customerGroup value to be set
     * @return Builder
     */

    public CustomerDraftBuilder customerGroup(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CustomerDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CustomerDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Preferred language of the Customer. Must be one of the languages supported by the Project.</p>
     * @param locale value to be set
     * @return Builder
     */

    public CustomerDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     * @param salutation value to be set
     * @return Builder
     */

    public CustomerDraftBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerDraftBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     * @param stores value to be set
     * @return Builder
     */

    public CustomerDraftBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerDraftBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the Stores for the Customer.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CustomerDraftBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>Set to <code>Password</code> to make the <code>password</code> field required for the Customer.</li>
     *   <li>Set to <code>ExternalAuth</code> when the password is not required for the Customer.</li>
     *  </ul>
     * @param authenticationMode value to be set
     * @return Builder
     */

    public CustomerDraftBuilder authenticationMode(
            @Nullable final com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    public String getEmail() {
        return this.email;
    }

    @Nullable
    public String getPassword() {
        return this.password;
    }

    @Nullable
    public String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public String getLastName() {
        return this.lastName;
    }

    @Nullable
    public String getMiddleName() {
        return this.middleName;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Deprecated
    @Nullable
    public String getAnonymousCartId() {
        return this.anonymousCartId;
    }

    @Nullable
    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    @Nullable
    public String getCompanyName() {
        return this.companyName;
    }

    @Nullable
    public String getVatId() {
        return this.vatId;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    @Nullable
    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    @Nullable
    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    @Nullable
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    @Nullable
    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    @Nullable
    public com.commercetools.api.models.customer.AuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    /**
     * builds CustomerDraft with checking for non-null required values
     * @return CustomerDraft
     */
    public CustomerDraft build() {
        Objects.requireNonNull(email, CustomerDraft.class + ": email is missing");
        return new CustomerDraftImpl(key, customerNumber, externalId, email, password, firstName, lastName, middleName,
            title, anonymousCartId, anonymousCart, anonymousId, dateOfBirth, companyName, vatId, addresses,
            defaultShippingAddress, shippingAddresses, defaultBillingAddress, billingAddresses, isEmailVerified,
            customerGroup, custom, locale, salutation, stores, authenticationMode);
    }

    /**
     * builds CustomerDraft without checking for non-null required values
     * @return CustomerDraft
     */
    public CustomerDraft buildUnchecked() {
        return new CustomerDraftImpl(key, customerNumber, externalId, email, password, firstName, lastName, middleName,
            title, anonymousCartId, anonymousCart, anonymousId, dateOfBirth, companyName, vatId, addresses,
            defaultShippingAddress, shippingAddresses, defaultBillingAddress, billingAddresses, isEmailVerified,
            customerGroup, custom, locale, salutation, stores, authenticationMode);
    }

    public static CustomerDraftBuilder of() {
        return new CustomerDraftBuilder();
    }

    public static CustomerDraftBuilder of(final CustomerDraft template) {
        CustomerDraftBuilder builder = new CustomerDraftBuilder();
        builder.key = template.getKey();
        builder.customerNumber = template.getCustomerNumber();
        builder.externalId = template.getExternalId();
        builder.email = template.getEmail();
        builder.password = template.getPassword();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.middleName = template.getMiddleName();
        builder.title = template.getTitle();
        builder.anonymousCartId = template.getAnonymousCartId();
        builder.anonymousCart = template.getAnonymousCart();
        builder.anonymousId = template.getAnonymousId();
        builder.dateOfBirth = template.getDateOfBirth();
        builder.companyName = template.getCompanyName();
        builder.vatId = template.getVatId();
        builder.addresses = template.getAddresses();
        builder.defaultShippingAddress = template.getDefaultShippingAddress();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.isEmailVerified = template.getIsEmailVerified();
        builder.customerGroup = template.getCustomerGroup();
        builder.custom = template.getCustom();
        builder.locale = template.getLocale();
        builder.salutation = template.getSalutation();
        builder.stores = template.getStores();
        builder.authenticationMode = template.getAuthenticationMode();
        return builder;
    }

}
