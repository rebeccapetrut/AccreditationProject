package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckoutPage extends BasePage {

    @FindBy(css = ".checkout-button")
    private WebElementFacade checkoutButton;

    @FindBy(css = "[id = 'billing_first_name']")
    private WebElementFacade firstNameField;

    @FindBy(css = "[id = 'billing_last_name']")
    private WebElementFacade lastNameField;

    @FindBy(css = "#billing_country")
    private WebElementFacade countryDropdown;

    @FindBy(css = "[id = 'billing_address_1']")
    private WebElementFacade streetAddressField;

    @FindBy(css = "[id = 'billing_city']")
    private WebElementFacade cityField;

    @FindBy(css = "[id = 'billing_state']")
    private WebElementFacade countyDropdown;

    @FindBy(css = "[id = 'billing_postcode']")
    private WebElementFacade postCodeField;

    @FindBy(css = "[id = 'billing_phone']")
    private WebElementFacade phoneField;

    @FindBy(css = "[id = 'billing_email']")
    private WebElementFacade emailField;

    @FindBy(css = "[id = 'place_order']")
    private WebElementFacade placeOrderButton;

    @FindBy(css = ".entry-title")
    private WebElementFacade orderPlacedMessage;


    public void clickOnCheckoutButton(){
        clickOn(checkoutButton);
    }

    public void clearTheFields(){
        firstNameField.clear();
        lastNameField.clear();
        streetAddressField.clear();
        cityField.clear();
        postCodeField.clear();
        phoneField.clear();
        emailField.clear();
    }

    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }

    public void selectCountryFromDropdown(){
        countryDropdown.selectByValue("RO");
    }

    public void setStreetAddressField(String streetName){
        typeInto(streetAddressField, streetName);
    }

    public void setCityField(String cityName){
        typeInto(cityField, cityName);
    }

    public void selectCountyFromDropdown(){
        countryDropdown.waitUntilClickable();
        countyDropdown.selectByIndex(14);
    }

    public void setPostCodeField(String postCode){
        typeInto(postCodeField, postCode);
    }

    public void setPhoneField(String phoneNumber){
        typeInto(phoneField, phoneNumber);
    }

    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void clickOnPlaceOrderButton(){
        clickOn(placeOrderButton);
    }

    public boolean verifyOrderIsPlaced(){
        if(orderPlacedMessage.isPresent()){
            return true;
        }
        return false;
    }








}
