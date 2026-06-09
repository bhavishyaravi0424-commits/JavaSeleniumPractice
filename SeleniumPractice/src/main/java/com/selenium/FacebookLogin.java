package com.selenium;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 1: Open Facebook login page
        driver.get("https://www.facebook.com/login/");

        // Step 2: Wait for elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Step 3: Find email box and type email
        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
        email.sendKeys("test@gmail.com");

        // Step 4: Find password box and type password
        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.name("pass")));
        password.sendKeys("1234");
 

        // Step 5: Find login button using text 'Log in'
        WebElement loginText = wait.until(
        	    ExpectedConditions.visibilityOfElementLocated(
        	        By.xpath("//span[text()='Log in']")
        	    )
        	);

        	JavascriptExecutor js = (JavascriptExecutor) driver;

        	js.executeScript(
        	    "arguments[0].closest('div[role=\"button\"]').click();",
        	    loginText
        	);
        	
}
}
