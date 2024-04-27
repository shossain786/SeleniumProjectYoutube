package org.saddy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoAutomation {
    @Test
    public void loginApp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://localhost:8080/iTinstruct-1.3.5/");

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("admin");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
//        I should navigate to home page.
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
}
