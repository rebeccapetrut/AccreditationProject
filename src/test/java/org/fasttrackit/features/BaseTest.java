package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.*;
import org.fasttrackit.utils.EnvConstants;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void maximise(){
        driver.manage().window().maximize();
        driver.get(EnvConstants.BASE_URL);
    }

    @Steps
    protected RegisterSteps registerSteps;

    @Steps
    protected LoginSteps loginSteps;

    @Steps
    protected SearchSteps searchSteps;

    @Steps
    protected CartSteps cartSteps;

    @Steps
    protected CheckoutSteps checkoutSteps;

    @Steps
    protected PostSteps postSteps;

    @Steps
    protected AdminSteps adminSteps;

    @Steps
    protected ProductSteps productSteps;







}
