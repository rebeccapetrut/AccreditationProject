package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class PostSteps extends BaseSteps {

    @Step
    public void clickOnHomeButton(){
        myAccountPage.clickOnHomeButton();
    }

    @Step
    public void clickOnTestPost(){
        homePage.clickOnTestPostButton();
    }

    @Step
    public void makeAComment(String comment){
        postPage.makeAComment(comment);
    }

    @Step
    public void clickOnPostCommentButton(){
        postPage.clickOnPostCommentButton();
    }

    @Step
    public void verifyCommentWasSent(){
        Assert.assertTrue(postPage.verifyCommentWasSent());
    }


}
