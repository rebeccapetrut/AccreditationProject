package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps{

    @Step
    public void navigateToRegisterPage(){
        homePage.clickOnMyAccountLink();
    }

    @Step
    public void enterCredentials(String email, String pass){
        registerPage.setEmailField(email);
        registerPage.setPasswordField(pass);
        registerPage.clickOnRegisterButton();
    }

    @Step
    public void verifyRegistration(String email){
        myAccountPage.verifyRegistration(email);
    }





}
