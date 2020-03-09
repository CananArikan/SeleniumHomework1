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
        mainTest("chrome");
    }

    public static void testFireFox(){
        mainTest("firefox");
    }

    public static void testSafari(){
       mainTest("safari");
    }

    public static void mainTest(String Browser) {
        try {
        WebDriver driver = getDriver(Browser);
        driver.get("https://google.com");
        String titleGoogle1 = driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().to("https://etsy.com");
        String titleEtsy1 = driver.getTitle();
        driver.navigate().back();
        String titleGoogle2 = driver.getTitle();
        Thread.sleep(2000);
        verifyEquals(titleGoogle1,titleGoogle2);
        driver.navigate().forward();
        String titleEtsy2 = driver.getTitle();
        Thread.sleep(2000);
        verifyEquals(titleEtsy1,titleEtsy2);
        driver.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
