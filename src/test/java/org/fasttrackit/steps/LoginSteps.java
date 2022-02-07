package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void clickOnMyAccountLink(){
        homePage.clickOnMyAccountLink();
    }

    @Step
    public void enterCredentials(String userName, String pass){
        loginPage.setUserNameField(userName);
        loginPage.setPassField(pass);
    }

    @Step
    public void clickOnLoginButton(){
        loginPage.clickOnLoginButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName){
        myAccountPage.verifyRegistration(userName);

    }

    @Step
    public void doLogin(String userName, String pass){
       clickOnMyAccountLink();
       enterCredentials(userName, pass);
       clickOnLoginButton();
    }

    @Step
    public void clickOnLogoutButton(){
        myAccountPage.clickOnLogoutButton();
    }

    @Step
    public void verifyLogoutSuccessful(){
        Assert.assertTrue(myAccountPage.verifyLogoutSuccessful());
    }

    @Step
    public void doLogout(){
        clickOnMyAccountLink();
        clickOnLogoutButton();
    }



}
