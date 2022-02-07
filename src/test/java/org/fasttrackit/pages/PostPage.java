package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class PostPage extends BasePage {

    @FindBy(css = "[id = 'comment']")
    private WebElementFacade commentField;

    @FindBy(css = "[id = 'submit']")
    private WebElementFacade postCommentButton;

    @FindBy(css = ".comment-body footer")
    private WebElementFacade commentConfirmation;

    public void makeAComment(String comment){
        typeInto(commentField, comment);
    }

    public void clickOnPostCommentButton(){
        clickOn(postCommentButton);
    }

    public boolean verifyCommentWasSent(){
        if (commentConfirmation.isPresent()) return true;
        else return false;
    }

}
