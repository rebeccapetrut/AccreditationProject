package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.utils.EnvConstants;

public class ProductSteps extends BaseSteps {

    @Step
    public void clickOnReviewButton(){
        productPage.clickOnReviewButton();
    }

    @Step
    public void leaveAReview(String reviewComment ){
        productPage.setReviewSection(reviewComment);
    }

    @Step
    public void clickOnRatingStars(){
        productPage.clickOnRatingStars();
    }

    @Step
    public void clickOnSubmitButton(){
        productPage.clickOnSubmitButton();
    }

    @Step
    public void getBaseURL(){
        getDriver().get(EnvConstants.BASE_URL);
    }

    @Step
    public void verifyReviewWasApproved(){
        productPage.verifyReviewWasApproved();
    }

    @Step
    public void verifyReviewWasSent(){
        productPage.verifyReviewWasSent();
    }

    @Step
    public void writeAReview(String reviewComment){
        clickOnReviewButton();
        leaveAReview(reviewComment);
        clickOnRatingStars();
        clickOnSubmitButton();
        verifyReviewWasSent();
    }


}
