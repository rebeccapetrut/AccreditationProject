package org.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".input-text.qty.text")
    private WebElementFacade quantityField;

    @FindBy(css = "[value='Update cart']")
    private WebElementFacade updateCartButton;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade cartUpdateMessage;

    @FindBy(css = ".woocommerce-cart-form__cart-item :nth-child(6)")
    private List<WebElementFacade> listOfSubtotalPrices;

    @FindBy(css = ".cart-subtotal .woocommerce-Price-amount.amount")
    private WebElementFacade subtotalText;

    @FindBy(css = ".shipping .woocommerce-Price-amount.amount")
    private WebElementFacade shippingFeeText;

    @FindBy(css = ".order-total .woocommerce-Price-amount.amount")
    private WebElementFacade grandTotalText;

    @FindBy(css = ".product-price .woocommerce-Price-amount.amount")
    private WebElementFacade productPrice;

    @FindBy(css = ".product-subtotal .woocommerce-Price-amount.amount")
    private WebElementFacade productTotalPrice;

    @FindBy(id = "coupon_code")
    private WebElementFacade couponField;

    @FindBy(css = "[name = 'apply_coupon']")
    private WebElementFacade couponButton;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade couponActivatedMessage;

    @FindBy(css = ".entry-title")
    private WebElementFacade orderPlacedMessage;

    @FindBy(css = ".woocommerce-notice")
    private WebElementFacade orderConfirmationMessage;

    @FindBy(css = ".woocommerce-cart-form__cart-item")
    private List<WebElementFacade> listOfProducts;



    public void clearQuantityField(){
        quantityField.clear();
    }

    public void modifyQuantityOfProduct(String value){
        typeInto(quantityField, value);
    }

    public void clickOnUpdateCartButton(){
        clickOn(updateCartButton);
    }

    public boolean verifyModifiedQuantity(){
        if(cartUpdateMessage.isPresent()){
            return true;
        }
        return false;
    }

    public int getSubtotalPricesCalculated(){
        int sum = 0;
        for (WebElementFacade element : listOfSubtotalPrices) {
            sum += getIntFromPrice(element.getText());
        }
        return sum;
    }

    public boolean isSubtotalPriceCorrect() {
        return getSubtotalPricesCalculated() == getIntFromPrice(subtotalText.getText());
    }

    public int getSubtotalPriceWithTaxes(){
        String x = subtotalText.getText();
        String y = "0";
        if (shippingFeeText.isPresent()){
            y = shippingFeeText.getText();
        }
        return getIntFromPrice(x) + getIntFromPrice(y);
    }

    public boolean isGrandTotalPriceCorrect(){
        return getSubtotalPriceWithTaxes() == getIntFromPrice(grandTotalText.getText());
    }


    public int getTotalPriceAfterModifyingQuantity(){
        String product = productPrice.getText();
        int quantity = 4;
        return getIntFromPrice(product) * quantity;
    }

    public boolean verifyTotalPriceIsCorrect(){
        return getTotalPriceAfterModifyingQuantity() == getIntFromPrice(productTotalPrice.getText());
    }

    public void setCouponField(String couponName){
        typeInto(couponField, couponName);
    }

    public void clickOnCouponButton(){
        clickOn(couponButton);
    }

    public void verifyIfCouponWasActivated(){
        couponActivatedMessage.shouldContainText("Coupon code applied successfully.");
    }

    public boolean deleteSpecificProductFromCart(String productName){
        for(WebElementFacade element : listOfProducts){
            if(element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(productName)){
                element.findElement(By.cssSelector(".product-remove a")).click();
                return true;
            }
        }
        return false;
    }


    public void verifyIfProductWasRemoved(String productName){
        cartUpdateMessage.shouldContainOnlyText("“" + productName + "”" + " removed. Undo?");
    }















}
