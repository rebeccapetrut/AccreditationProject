package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void addProductToCart(String productName){
        productPage.clickOnAddToCartButton();
        productPage.verifyProductWasAddedToCart(productName);
        productPage.clickOnViewCartButton();
    }

    @Step
    public void modifyQuantityOfProduct(String value){
        cartPage.clearQuantityField();
        cartPage.modifyQuantityOfProduct(value);
        cartPage.clickOnUpdateCartButton();
    }

    @Step
    public void verifyModifiedQuantity(){
        Assert.assertTrue(cartPage.verifyModifiedQuantity());
    }

    @Step
    public void addToCart(){
        productPage.clickOnAddToCartButton();
    }

    @Step
    public void clickOnViewCartButton(){
        productPage.clickOnViewCartButton();
    }

    @Step
    public void checkSubtotalPriceIsDisplayedCorrectly(){
        Assert.assertTrue("The subtotal price is not correct!",cartPage.isSubtotalPriceCorrect());
    }

    @Step
    public void checkGrandTotalPriceIsCorrect(){
        Assert.assertTrue("Total price not correct", cartPage.isGrandTotalPriceCorrect());
    }

    @Step
    public void verifyTotalPriceIsCorrect(){
        cartPage.verifyTotalPriceIsCorrect();
    }

    @Step
    public void setCouponField(String couponName){
        cartPage.setCouponField(couponName);
    }

    @Step
    public void clickOnCouponButton(){
        cartPage.clickOnCouponButton();
    }

    @Step
    public void verifyIfCouponWasActivated(){
        cartPage.verifyIfCouponWasActivated();
    }

    @Step
    public void removeProductFromCart(String productName){
        Assert.assertTrue(cartPage.deleteSpecificProductFromCart(productName));
    }

    @Step
    public void verifyIfProductWasRemoved(String productName){
        cartPage.verifyIfProductWasRemoved(productName);
    }








}




