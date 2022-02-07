package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void placeAnOrderTest(){
        searchSteps.searchAndOpenProduct("t-shirt");
        cartSteps.addProductToCart("t-shirt");
        checkoutSteps.clickOnCheckoutButton();
        checkoutSteps.clearTheFields();
        checkoutSteps.setNameFields("Rebecca", "Petrut");
        checkoutSteps.selectCountryFromDropdown();
        checkoutSteps.setStreetAddress("Anywhere");
        checkoutSteps.setCity("Cluj");
        checkoutSteps.selectCountyFromDropdown();
        checkoutSteps.setPostcode("010101");
        checkoutSteps.setPhoneNumber("0101010101010");
        checkoutSteps.setEmail("rebecca.petrut@mailinator.com");
        checkoutSteps.clickOnPlaceOrderButton();
        checkoutSteps.verifyIfOrderIsPlaced();
    }


    @Test
    public void placeAnOrderWithACouponCodeTest() {
        searchSteps.searchAndOpenProduct("t-shirt");
        cartSteps.addProductToCart("t-shirt");
        cartSteps.setCouponField("gogetit");
        cartSteps.clickOnCouponButton();
        cartSteps.verifyIfCouponWasActivated();
        checkoutSteps.clickOnCheckoutButton();
        checkoutSteps.clearTheFields();
        checkoutSteps.setNameFields("Rebecca", "Petrut");
        checkoutSteps.selectCountryFromDropdown();
        checkoutSteps.setStreetAddress("Anywhere");
        checkoutSteps.setCity("Cluj");
        checkoutSteps.selectCountyFromDropdown();
        checkoutSteps.setPostcode("010101");
        checkoutSteps.setPhoneNumber("0101010101010");
        checkoutSteps.setEmail("rebecca.petrut@mailinator.com");
        checkoutSteps.clickOnPlaceOrderButton();
        checkoutSteps.verifyIfOrderIsPlaced();
    }

    @Test
    public void buyANewCreatedProductTest(){
        adminSteps.doAdminLogin("admin", "parola11");
        adminSteps.addNewProduct();
        adminSteps.createNewProduct("Another Test Product", "199", "sku1test", "5", "This is another test product");
        productSteps.getBaseURL();
        loginSteps.doLogout();
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        searchSteps.searchAndOpenProduct("another test product");
        cartSteps.addProductToCart("another test product");
        checkoutSteps.clickOnCheckoutButton();
        checkoutSteps.clearTheFields();
        checkoutSteps.setNameFields("Rebecca", "Petrut");
        checkoutSteps.selectCountryFromDropdown();
        checkoutSteps.setStreetAddress("Anywhere");
        checkoutSteps.setCity("Cluj");
        checkoutSteps.selectCountyFromDropdown();
        checkoutSteps.setPostcode("010101");
        checkoutSteps.setPhoneNumber("0101010101010");
        checkoutSteps.setEmail("rebecca.petrut@mailinator.com");
        checkoutSteps.clickOnPlaceOrderButton();
        checkoutSteps.verifyIfOrderIsPlaced();
    }




}
