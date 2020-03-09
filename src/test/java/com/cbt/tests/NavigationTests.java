package com.cbt.tests;

import org.openqa.selenium.WebDriver;

import static com.cbt.utilities.BrowserFactory.getDriver;

public class NavigationTests {


    public static void main(String[] args) {


    }

    public void testChrome(){
        WebDriver driver = getDriver("chrome");
    }

    public void testFireFox(){
        WebDriver driver = getDriver("firefox");
    }

    public void testSafari(){
        WebDriver driver = getDriver("safari");
    }

}
