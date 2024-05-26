package org.saddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorDemo {
    @Test
    public void locatorTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://localhost:8080/iTinstruct-1.3.5/home.html");

        //enter text into the Job details field

        driver.findElement(By.id("designation")).sendKeys("Test data 123");


        Thread.sleep(3000);

        driver.quit();
    }
}
