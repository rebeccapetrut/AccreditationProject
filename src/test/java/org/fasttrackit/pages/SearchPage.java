package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BasePage {

    @FindBy(css = ".products li")
    private List<WebElementFacade> listOfProducts;

    @FindBy(css = ".woocommerce-loop-product__title")
    private WebElementFacade clickOnProduct;

    @FindBy(css = ".orderby")
    private WebElementFacade sortByDropdown;

    @FindBy(css = ".azera_shop_grid li:nth-child(1) .amount:not(del > .amount):first-child")
    private List<WebElementFacade> firstRowOfProducts;

    @FindBy(css = ".azera_shop_grid li:nth-child(2) .amount:not(del > .amount):first-child")
    private List<WebElementFacade> secondRowOfProducts;

    @FindBy(css = ".azera_shop_grid li:nth-child(3) .amount:not(del > .amount):first-child")
    private List<WebElementFacade> thirdRowOfProducts;

    @FindBy(css = ".azera_shop_grid li:nth-child(4) .amount:not(del > .amount):first-child")
    private List<WebElementFacade> fourthRowOfProducts;


    public boolean openProduct(String product){
        waitFor(listOfProducts.get(0));
        for(WebElementFacade element : listOfProducts){
            if(element.findElement(By.cssSelector(".woocommerce-LoopProduct-link h2")).getText().equalsIgnoreCase(product)){
                element.findElement(By.cssSelector(".woocommerce-loop-product__title")).click();
                return true;
            }
        }
        return false;
    }

    public void clickOnSortByDropdown(){
        sortByDropdown.selectByValue("price");
    }

    public List<Integer> getIntegerPriceList(){

        List<Integer> priceList = new ArrayList<>();

        for(WebElementFacade element : firstRowOfProducts){
            priceList.add(getIntFromPrice((element.getText())));
        }

        for(WebElementFacade element : secondRowOfProducts){
            priceList.add(getIntFromPrice((element.getText())));
        }

        for(WebElementFacade element : thirdRowOfProducts){
            priceList.add(getIntFromPrice((element.getText())));
        }

        for(WebElementFacade element : fourthRowOfProducts){
            priceList.add(getIntFromPrice((element.getText())));
        }

        return priceList;
    }

    public boolean getThePricesAfterSortingTheList(List<Integer> priceList){
        for(int i = 0; i < priceList.size()-1; i++){
            if(priceList.get(i) <= priceList.get(i+1)){
                return true;
            }
        }
        return false;
    }





}
