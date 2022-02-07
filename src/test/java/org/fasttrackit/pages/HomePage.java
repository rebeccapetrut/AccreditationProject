package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends BasePage{

    @FindBy(css = ".menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-122")
    private WebElementFacade myAccountLink;

    @FindBy(css = ".fa.fa-search.header-search-button")
    private WebElementFacade searchIcon;

    @FindBy(css = "[title='Search for:']")
    private WebElementFacade searchField;

    @FindBy(css = ".header-search-input [value= 'Search']")
    private WebElementFacade searchButton;

    @FindBy(css = "#post-1")
    private WebElementFacade testPostButton;


    public void clickOnMyAccountLink(){
        clickOn(myAccountLink);
    }

    public void clickOnSearchIcon(){
        clickOn(searchIcon);
    }

    public void setSearchField(String product){
        typeInto(searchField, product);
    }

    public void clickOnSearchButton(){
        clickOn(searchButton);
    }

    public void clickOnTestPostButton(){
        clickOn(testPostButton);
    }





}
