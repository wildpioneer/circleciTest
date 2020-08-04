package org.techmeskills.aqa5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest {
    WebDriver driver;

    @Test
    public void openChromePage() {
        System.out.println("Selenium test has been started!");
        driver = new ChromeDriver();
        driver.get("http://google.com");

        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.close();
    }
}
