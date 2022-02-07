package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage{

    @FindBy(id = "reg_email")
    private WebElementFacade emailField;

    @FindBy(id = "reg_password")
    private WebElementFacade passField;

    @FindBy(css ="[value='Register']")
    private WebElementFacade registerButton;

    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setPasswordField(String pass){
        typeInto(passField, pass);
    }

    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }







}
