package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class AdminSteps extends BaseSteps {

    @Step
    public void doAdminLogin(String userName, String pass){
        getDriver().get("http://qa4.fasttrackit.org:8008/wp-login.php");
        adminPage.setUserNameField("admin");
        adminPage.setPasswordField("parola11");
        adminPage.clickOnLoginButton();
    }

    @Step
    public void verifyAdminIsLogin(){
        adminPage.verifyAdminLogin();
    }

    @Step
    public void addNewProduct(){
        adminPage.clickOnProductButton();
        adminPage.clickOnAddNewProductButton();
    }

    @Step
    public void createNewProduct(String productName, String productPrice, String productSKU, String productWeight, String productDescription){
        adminPage.setProductName(productName);
        adminPage.setProductPrice(productPrice);
        adminPage.clickOnSkuButton();
        adminPage.setSkuField(productSKU);
        adminPage.clickOnWeightButton();
        adminPage.setWeightField(productWeight);
        adminPage.setDescriptionProduct(productDescription);
        adminPage.clickOnCategoryCheckBox();
        adminPage.clickOnCreateNewProductButton();
        adminPage.verifyIfNewProductWasCreated();
    }

    @Step
    public void approveComment(){
        adminPage.clickOnCommentsButton();
        adminPage.clickOnApproveCommentButton();
    }

    @Step
    public void clickOnWoocommerceButton(){
        adminPage.clickOnWoocommerceButton();
    }

    @Step
    public void clickOnCouponsButton(){
        adminPage.clickOnCouponsButton();
    }

    @Step
    public void clickOnAddCouponButton(){
        adminPage.clickOnAddCouponButton();
    }

    @Step
    public void setCouponTitle(String couponName){
        adminPage.setCouponTitle(couponName);
    }

    @Step
    public void setCouponAmountField(String couponAmount){
        adminPage.setCouponAmountField(couponAmount);
    }

    @Step
    public void clickOnCouponDate(){
        adminPage.clickOnCouponDate();
    }

    @Step
    public void setMonthButton(){
        adminPage.setMonthButton();
    }

    @Step
    public void clickOnDayCoupon(){
        adminPage.clickOnDayCoupon();
    }

    @Step
    public void clickOnPublishButton(){
        adminPage.clickOnPublishButton();
    }

    @Step
    public void verifyIfCouponWasCreated(){
        adminPage.verifyIfCouponWasCreated();
    }




}
