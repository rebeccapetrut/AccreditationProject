package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps {

    @Step
    public void executeSearch(String product){
        homePage.clickOnSearchIcon();
        homePage.setSearchField(product);
        homePage.clickOnSearchButton();
    }

    @Step
    public void findAndOpenProduct(String product){
        Assert.assertTrue(searchPage.openProduct(product));
    }

    @Step
    public void searchAndOpenProduct(String product){
        executeSearch(product);
        findAndOpenProduct(product);
    }

    @Step
    public void clickOnSortByDropdown(){
        searchPage.clickOnSortByDropdown();
    }

    @Step
    public void getIntegerPriceList(){
        searchPage.getIntegerPriceList();
    }

    @Step
    public void verifyTheSmallestPriceFromList(){
        Assert.assertTrue(searchPage.getThePricesAfterSortingTheList(searchPage.getIntegerPriceList()));
    }


}
