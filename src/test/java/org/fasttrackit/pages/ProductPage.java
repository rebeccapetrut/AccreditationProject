package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;

public class ProductPage extends BasePage {

    @FindBy(css = "[name= 'add-to-cart']")
    private WebElementFacade addToCartButton;

    @FindBy(css = ".button.wc-forward")
    private WebElementFacade viewCartButton;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade addToCartSuccessMessage;

    @FindBy(css = "[id = 'tab-title-reviews']")
    private WebElementFacade reviewButton;

    @FindBy(css = "[id= 'comment']")
    private WebElementFacade reviewSection;

    @FindBy(css = ".stars .star-5")
    private WebElementFacade ratingStars;

    @FindBy(css = "[id= 'submit']")
    private WebElementFacade submitButton;

    @FindBy(css = ".comment-text")
    private WebElementFacade reviewPost;

    @FindBy(css = ".woocommerce-review__awaiting-approval")
    private WebElementFacade reviewSentConfirmation;


    public void clickOnAddToCartButton(){
        clickOn(addToCartButton);
    }

    public void clickOnViewCartButton(){
        clickOn(viewCartButton);
    }

    public void verifyProductWasAddedToCart(String productName){
        Assert.assertEquals(productName + " has been added to your cart.", productName + " has been added to your cart.");
    }

    public void clickOnReviewButton(){
        clickOn(reviewButton);
    }

    public void setReviewSection(String reviewMessage){
        typeInto(reviewSection, reviewMessage);
    }

    public void clickOnRatingStars(){
        clickOn(ratingStars);
    }

    public void clickOnSubmitButton(){
        clickOn(submitButton);
    }

    public boolean verifyReviewWasApproved(){
        if(reviewPost.isPresent()){
            return true;
        }
        return false;
    }

    public boolean verifyReviewWasSent(){
        if(reviewSentConfirmation.isPresent()){
            return true;
        }
        return false;
    }

}
