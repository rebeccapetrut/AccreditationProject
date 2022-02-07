package org.fasttrackit.features;

import org.fasttrackit.utils.EnvConstants;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Test
    public void searchProductTest(){
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        searchSteps.searchAndOpenProduct("T-Shirt");
    }

    @Test
    public void searchByPriceTest(){
        loginSteps.doLogin(EnvConstants.USER_NAME, EnvConstants.USER_PASS);
        searchSteps.executeSearch("T-Shirt");
        searchSteps.clickOnSortByDropdown();
        searchSteps.getIntegerPriceList();
        searchSteps.verifyTheSmallestPriceFromList();
    }



}
