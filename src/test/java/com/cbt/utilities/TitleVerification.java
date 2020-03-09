package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static com.cbt.utilities.BrowserFactory.getDriver;

public class TitleVerification {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver driver = getDriver("chrome");
        List<String> titles = new ArrayList<>();
        for (int i = 0; i < urls.size(); i++) {
            driver.get(urls.get(i));
            String title = driver.getTitle();
            titles.add(title);
        }
        if (titles.get(0).equals(titles.get(1)) && titles.get(0).equals(titles.get(2)) ) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        String test = "http://practice.cybertekschool.com";
        if ( urls.get(0).startsWith(test) &&
                urls.get(1).startsWith(test) &&
                urls.get(2).startsWith(test)  ) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        driver.close();
    }
}
