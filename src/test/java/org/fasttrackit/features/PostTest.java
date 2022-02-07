package org.fasttrackit.features;

import org.junit.Test;

public class PostTest extends BaseTest{

    @Test
    public void leaveACommentTest(){
        loginSteps.doLogin("rebeccapetrut", "Parolaparola11!");
        postSteps.clickOnHomeButton();
        postSteps.clickOnTestPost();
        postSteps.makeAComment("Hello, it's me again!");
        postSteps.clickOnPostCommentButton();
        postSteps.verifyCommentWasSent();
    }


}
