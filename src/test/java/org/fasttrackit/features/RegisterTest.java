package org.fasttrackit.features;

import org.apache.commons.lang3.RandomStringUtils;
import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void doRegisterTest(){
        registerSteps.navigateToRegisterPage();
        String email = RandomStringUtils.randomAlphanumeric(8);
        registerSteps.enterCredentials(email+"@email.test", EnvConstants.USER_PASS);
        registerSteps.verifyRegistration(email);
    }



}
