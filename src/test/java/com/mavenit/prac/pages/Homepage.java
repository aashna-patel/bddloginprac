package com.mavenit.prac.pages;

import com.mavenit.prac.Driver.DriverFactory;
import gherkin.lexer.El;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class Homepage extends DriverFactory {
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public static void clickLogin() {
        driver.findElement(id("onetrust-accept-btn-handler")).click();
        driver.findElement(cssSelector(".global-login-img")).click();
    }

    //public static String getTitle(){
    //return  driver.getTitle();

    // }


}


