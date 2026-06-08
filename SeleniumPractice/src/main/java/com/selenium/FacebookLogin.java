package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://www.facebook.com/login/");

        WebElement email = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("email"))
        );

        email.click();
        new Actions(driver)
                .sendKeys("test@gmail.com")
                .perform();

        WebElement password = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("pass"))
        );

        password.click();
        new Actions(driver)
                .sendKeys("1234")
                .perform();

        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.name("login"))
        );

        loginButton.click();

        System.out.println("Login button clicked");
    }
}