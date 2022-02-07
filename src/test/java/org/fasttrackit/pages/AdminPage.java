package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class AdminPage extends BasePage {

    @FindBy(css = "[id= 'user_login']")
    private WebElementFacade userNameField;

    @FindBy(css = "[id= 'user_pass']")
    private WebElementFacade passwordField;

    @FindBy(css = "[id= 'wp-submit']")
    private WebElementFacade loginButton;

    @FindBy(css = "[id='menu-posts-product'] .wp-menu-image.dashicons-before.dashicons-admin-post")
    private WebElementFacade productButton;

    @FindBy(css = ".wrap a:nth-child(2).page-title-action ")
    private WebElementFacade addNewProductButton;

    @FindBy(css = "[id='title']")
    private WebElementFacade productNameField;

    @FindBy(css = "[id='_regular_price']")
    private WebElementFacade productPriceField;

    @FindBy(css = ".inventory_options")
    private WebElementFacade skuButton;

    @FindBy(css = "[id= '_sku']")
    private WebElementFacade skuField;

    @FindBy(css = ".shipping_options")
    private WebElementFacade weightButton;

    @FindBy(css = "[id= '_weight']")
    private WebElementFacade weightField;

    @FindBy(css = ".inside .wp-editor-container .wp-editor-area")
    private WebElementFacade descriptionField;

    @FindBy(css = "[id='product_catdiv'] .hndle.ui-sortable-handle")
    private WebElementFacade categoriesDropdown;

    @FindBy(css = "[id='in-product_cat-34']")
    private WebElementFacade categoryCheckBox;

    @FindBy(css = "[name = 'publish']")
    private WebElementFacade createProductButton;

    @FindBy(css= ".updated.notice")
    private WebElementFacade createdProductMessage;

    @FindBy(css = ".welcome-panel-content h2")
    private WebElementFacade loginHelloMessage;

    @FindBy(css = ".wp-menu-image.dashicons-before.dashicons-admin-comments")
    private WebElementFacade commentsButton;

    @FindBy(css = ".comment.column-comment")
    private WebElementFacade commentSection;

    @FindBy(css = ".row-actions .approve")
    private WebElementFacade approveCommentButton;

    @FindBy(css = ".wp-menu-image.dashicons-before.dashicons-admin-generic")
    private WebElementFacade woocommerceButton;

    @FindBy(css = ".toplevel_page_woocommerce li:nth-child(3)")
    private WebElementFacade couponsButton;

    @FindBy(css = ".page-title-action")
    private WebElementFacade addCouponButton;

    @FindBy(id = "title")
    private WebElementFacade couponTitle;

    @FindBy(id = "coupon_amount")
    private WebElementFacade couponAmountField;

    @FindBy(id = "expiry_date")
    private WebElementFacade couponDate;

    @FindBy(css = ".ui-icon.ui-icon-circle-triangle-e")
    private WebElementFacade setMonthButton;

    @FindBy(css = "tbody tr:nth-child(3) td:nth-child(5)")
    private WebElementFacade setDayCoupon;

    @FindBy(id = "publish")
    private WebElementFacade publishButton;

    @FindBy(id = "message")
    private WebElementFacade couponMessage;


    public void setUserNameField(String userName){
        typeInto(userNameField, userName);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOn(loginButton);
    }

    public void verifyAdminLogin(){
        loginHelloMessage.shouldContainOnlyText("Welcome to WordPress!");
    }

    public void clickOnProductButton(){
        clickOn(productButton);
    }

    public void clickOnAddNewProductButton(){
        clickOn(addNewProductButton);
    }

    public void setProductName(String productName){
        typeInto(productNameField, productName);
    }

    public void setProductPrice(String productPrice){
        typeInto(productPriceField, productPrice);
    }

    public void clickOnSkuButton(){
        clickOn(skuButton);
    }

    public void setSkuField(String sku){
        typeInto(skuField, sku);
    }

    public void clickOnWeightButton(){
        clickOn(weightButton);
    }

    public void setWeightField(String weight){
        typeInto(weightField, weight);
    }

    public void setDescriptionProduct(String descriptionProduct){
        typeInto(descriptionField, descriptionProduct);
    }

    public void clickOnCategoryCheckBox(){
        clickOn(categoryCheckBox);
    }

    public void clickOnCreateNewProductButton(){
        withAction().moveToElement(createProductButton).click().perform();
    }

    public void verifyIfNewProductWasCreated(){
       createdProductMessage.shouldContainText("Product published. View Product");
    }

    public void clickOnCommentsButton(){
        clickOn(commentsButton);
    }

    public void clickOnApproveCommentButton(){
        withAction().moveToElement(commentSection).perform();
        clickOn(approveCommentButton);
    }

    public void clickOnWoocommerceButton(){
        clickOn(woocommerceButton);
    }

    public void clickOnCouponsButton(){
        clickOn(couponsButton);
    }

    public void clickOnAddCouponButton(){
        clickOn(addCouponButton);
    }

    public void setCouponTitle(String couponName){
        typeInto(couponTitle, couponName);
    }

    public void setCouponAmountField(String couponAmount){
        typeInto(couponAmountField, couponAmount);
    }

    public void clickOnCouponDate(){
        clickOn(couponDate);
    }

    public void setMonthButton(){
        withAction().doubleClick(setMonthButton).perform();
        withAction().doubleClick(setMonthButton).perform();
        withAction().click(setMonthButton).perform();
    }

    public void clickOnDayCoupon(){
        clickOn(setDayCoupon);
    }

    public void clickOnPublishButton(){
        clickOn(publishButton);
    }

    public boolean verifyIfCouponWasCreated(){
        if(couponMessage.isPresent()){
            return true;
        }
        return false;
    }































}
