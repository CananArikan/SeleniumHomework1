package com.cbt.tests;

import org.openqa.selenium.WebDriver;
import static com.cbt.utilities.BrowserFactory.getDriver;
import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTests {

    public static void main(String[] args) {
        testChrome();
        testFireFox();
        testSafari();
    }

    public static void testChrome(){
        WebDriver driver = getDriver("chrome");
        driver.get("https://google.com");
        String titleGoogle1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String titleEtsy1 = driver.getTitle();

        driver.navigate().back();
        String titleGoogle2 = driver.getTitle();

        verifyEquals(titleGoogle1,titleGoogle2);

        driver.navigate().forward();
        String titleEtsy2 = driver.getTitle();

        verifyEquals(titleEtsy1,titleEtsy2);

        driver.close();
    }

    public static void testFireFox(){
        WebDriver driver = getDriver("firefox");
        driver.get("https://google.com");
        String titleGoogle1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String titleEtsy1 = driver.getTitle();

        driver.navigate().back();
        String titleGoogle2 = driver.getTitle();

        verifyEquals(titleGoogle1,titleGoogle2);

        driver.navigate().forward();
        String titleEtsy2 = driver.getTitle();

        verifyEquals(titleEtsy1,titleEtsy2);

        driver.close();
    }

    public static void testSafari(){
        WebDriver driver = getDriver("safari");
        driver.get("https://google.com");
        String titleGoogle1 = driver.getTitle();

        driver.navigate().to("https://etsy.com");
        String titleEtsy1 = driver.getTitle();

        driver.navigate().back();
        String titleGoogle2 = driver.getTitle();

        verifyEquals(titleGoogle1,titleGoogle2);

        driver.navigate().forward();
        String titleEtsy2 = driver.getTitle();

        verifyEquals(titleEtsy1,titleEtsy2);

        driver.close();
    }

}
