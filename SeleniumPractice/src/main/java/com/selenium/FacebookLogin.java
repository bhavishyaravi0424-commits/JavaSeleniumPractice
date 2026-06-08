package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_facebook {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        // driver.quit();
    }
}