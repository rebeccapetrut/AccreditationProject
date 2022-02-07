package org.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

    public int getIntFromPrice(String priceNonFormatted) {
        return Integer.parseInt(priceNonFormatted
                .replace(",", "")
                .replace(" lei", "")
                .replace(".", ""));
    }



}
