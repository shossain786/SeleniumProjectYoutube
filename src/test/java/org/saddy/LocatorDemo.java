package org.saddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorDemo {
    WebDriver driver;
    @BeforeMethod
    public void setUP() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://localhost:8080/iTinstruct-1.3.5/home.html");
    }
    @Test
    public void locatorTest() throws InterruptedException {
        //enter text into a input field: id = inputField

        driver.findElement(By.id("inputField")).sendKeys("1234");


        Thread.sleep(3000);
        driver.quit();
    }
}
