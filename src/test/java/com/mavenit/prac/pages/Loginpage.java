package com.mavenit.prac.pages;

import com.mavenit.prac.Driver.DriverFactory;
import org.openqa.selenium.By;

public class Loginpage extends DriverFactory {
    public static void enterUsername(){
        driver.findElement(By.id("username")).sendKeys("aashna@gmail.com");
    }

    public static void enterPassword(){
        driver.findElement(By.id("password")).sendKeys("aashna123");
    }
    public static void clickSubmit(){
            driver.findElement(By.cssSelector("#Login")).click();
    }
    public static String errorMessage(){
        return driver.findElement(By.cssSelector("#error")).getText();
    }

}
