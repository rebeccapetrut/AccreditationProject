package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void doLoginTest(){
        loginSteps.clickOnMyAccountLink();
        loginSteps.enterCredentials(EnvConstants.USER_EMAIL, EnvConstants.USER_PASS);
        loginSteps.clickOnLoginButton();
        loginSteps.verifyUserIsLoggedIn(EnvConstants.USER_NAME);
    }

    @Test
    public void doLogoutTest(){
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        loginSteps.clickOnLogoutButton();
        loginSteps.verifyLogoutSuccessful();
    }
}
