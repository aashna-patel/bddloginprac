package com.mavenit.prac.Driver;

import com.mavenit.prac.Hooks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory{
    public static WebDriver driver;
    private String browser = "";
    public void openBrowser() {
        switch (browser) {
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
    }

    public void navigateTo(String Url) {
        driver.get(Url);
    }

    public void maximiseBrowser() { driver.manage().window().maximize(); }

    public void applyImplicitwait(){ driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); }


}
