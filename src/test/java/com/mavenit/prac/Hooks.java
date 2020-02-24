package com.mavenit.prac;

import com.mavenit.prac.Driver.DriverFactory;
import cucumber.api.java.Before;


public class Hooks {

    public DriverFactory factory= new DriverFactory();

    @Before
    public void setUp(){
        factory.openBrowser();
        factory.navigateTo("https://www.salesforce.com/uk/");
        factory.maximiseBrowser();
        factory.applyImplicitwait();

    }
}
