package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends BasePage{

    @FindBy(css = ".woocommerce-MyAccount-content p:first-child")
    private WebElementFacade welcomeMessage;

    @FindBy(css = "[id= 'menu-item-115']")
    private WebElementFacade homeButton;

    @FindBy(css = ".woocommerce-MyAccount-content p:first-child a")
    private WebElementFacade logoutButton;

    @FindBy(css = ".u-column1")
    private WebElementFacade logoutVerify;

    public void verifyRegistration(String userName){
        welcomeMessage.shouldContainOnlyText("Hello " + userName + " (not "+ userName+"? Log out)");
    }

    public void clickOnHomeButton(){
        clickOn(homeButton);
    }

    public void clickOnLogoutButton(){
        clickOn(logoutButton);
    }

    public boolean verifyLogoutSuccessful(){
        if(logoutVerify.isPresent()){
            return true;
        }
        return false;
    }



}
