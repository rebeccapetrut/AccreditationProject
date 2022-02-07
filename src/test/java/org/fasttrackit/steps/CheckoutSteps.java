package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps {

    @Step
    public void clickOnCheckoutButton(){
        checkoutPage.clickOnCheckoutButton();
    }

    @Step
    public void clearTheFields(){
        checkoutPage.clearTheFields();
    }

    @Step
    public void setNameFields(String firstName, String lastName){
        checkoutPage.setFirstNameField(firstName);
        checkoutPage.setLastNameField(lastName);
    }

    @Step
    public void selectCountryFromDropdown(){
        checkoutPage.selectCountryFromDropdown();
    }

    @Step
    public void setStreetAddress(String streetName){
        checkoutPage.setStreetAddressField(streetName);
    }

    @Step
    public void setCity(String city){
        checkoutPage.setCityField(city);
    }

    @Step
    public void selectCountyFromDropdown(){
        checkoutPage.selectCountyFromDropdown();
    }

    @Step
    public void setPostcode(String postcode){
        checkoutPage.setPostCodeField(postcode);
    }

    @Step
    public void setPhoneNumber(String phoneNumber){
        checkoutPage.setPhoneField(phoneNumber);
    }

    @Step
    public void setEmail(String email){
        checkoutPage.setEmailField(email);
    }

    @Step
    public void clickOnPlaceOrderButton(){
        checkoutPage.clickOnPlaceOrderButton();
    }

    @Step
    public void verifyIfOrderIsPlaced(){
        checkoutPage.verifyOrderIsPlaced();
    }



}
