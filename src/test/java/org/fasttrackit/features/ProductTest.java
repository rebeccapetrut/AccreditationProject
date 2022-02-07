package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void leaveAReviewTest(){
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        searchSteps.searchAndOpenProduct("T-Shirt");
        productSteps.clickOnReviewButton();
        productSteps.leaveAReview("This is a very nice product!");
        productSteps.clickOnRatingStars();
        productSteps.clickOnSubmitButton();
        productSteps.verifyReviewWasSent();
    }
}
