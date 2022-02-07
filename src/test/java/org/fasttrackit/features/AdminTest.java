package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class AdminTest extends BaseTest {

    @Test
    public void doAdminLoginTest(){
        adminSteps.doAdminLogin("admin", "parola11");
        adminSteps.verifyAdminIsLogin();
    }

    @Test
    public void createANewProductTest(){
        adminSteps.doAdminLogin("admin", "parola11");
        adminSteps.addNewProduct();
        adminSteps.createNewProduct("New Test Product", "666", "sku_test666", "1", "This is just another test product.");
    }

    @Test
    public void approveCommentTest(){
        adminSteps.doAdminLogin("admin", "parola11");
        adminSteps.approveComment();
    }

    @Test
    public void leaveAndApproveCommentTest(){
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        searchSteps.searchAndOpenProduct("T-Shirt");
        productSteps.writeAReview("Such a nice product!");
        adminSteps.doAdminLogin("admin", "parola11");
        adminSteps.approveComment();
        productSteps.getBaseURL();
        searchSteps.searchAndOpenProduct("T-Shirt");
        productSteps.clickOnReviewButton();
        productSteps.verifyReviewWasApproved();
    }

    @Test
    public void createANewCouponTest(){
        adminSteps.doAdminLogin("admin", "parola11");
        adminSteps.clickOnWoocommerceButton();
        adminSteps.clickOnCouponsButton();
        adminSteps.clickOnAddCouponButton();
        adminSteps.setCouponTitle("GetTheDiscount");
        adminSteps.setCouponAmountField("15");
        adminSteps.clickOnCouponDate();
        adminSteps.setMonthButton();
        adminSteps.clickOnDayCoupon();
        adminSteps.clickOnPublishButton();
        adminSteps.verifyIfCouponWasCreated();
    }


}
