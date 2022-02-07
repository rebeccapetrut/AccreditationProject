package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @FindBy(id ="username")
    private WebElementFacade userNameField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(css = "[value='Login']")
    private WebElementFacade loginButton;

    public void setUserNameField(String userName){
        typeInto(userNameField, userName);
    }

    public void setPassField(String pass){
        typeInto(passField, pass);
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }


}
