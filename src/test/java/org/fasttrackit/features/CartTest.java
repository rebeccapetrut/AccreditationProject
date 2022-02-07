package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addProductToCartTest() {
        searchSteps.searchAndOpenProduct("t-shirt");
        cartSteps.addProductToCart("t-shirt");
    }

    @Test
    public void modifyProductQuantityTest() {
        searchSteps.searchAndOpenProduct("t-shirt");
        cartSteps.addProductToCart("t-shirt");
        cartSteps.modifyQuantityOfProduct("15");
        cartSteps.verifyModifiedQuantity();
    }

    @Test
    public void deleteSpecificProductFromCartTest() {
        searchSteps.searchAndOpenProduct("T-Shirt");
        cartSteps.addProductToCart("T-Shirt");
        searchSteps.searchAndOpenProduct("beanie");
        cartSteps.addProductToCart("beanie");
        cartSteps.removeProductFromCart("T-Shirt");
        cartSteps.verifyIfProductWasRemoved("T-Shirt");
    }

    @Test
    public void checkCartTotalSummaryTest() {
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        searchSteps.searchAndOpenProduct("T-Shirt");
        cartSteps.addToCart();
        searchSteps.searchAndOpenProduct("beanie");
        cartSteps.addToCart();
        cartSteps.clickOnViewCartButton();
        cartSteps.checkSubtotalPriceIsDisplayedCorrectly();
        cartSteps.checkGrandTotalPriceIsCorrect();
    }

    @Test
    public void verifyTotalPriceIsCorrectTest() {
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        searchSteps.searchAndOpenProduct("t-shirt");
        cartSteps.addProductToCart("t-shirt");
        cartSteps.modifyQuantityOfProduct("4");
        cartSteps.verifyModifiedQuantity();
        cartSteps.verifyTotalPriceIsCorrect();
    }

    @Test
    public void verifyIfCouponIsAppliedTest() {
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        searchSteps.searchAndOpenProduct("t-shirt");
        cartSteps.addProductToCart("t-shirt");
        cartSteps.setCouponField("gogetit");
        cartSteps.clickOnCouponButton();
        cartSteps.verifyIfCouponWasActivated();
    }

}
