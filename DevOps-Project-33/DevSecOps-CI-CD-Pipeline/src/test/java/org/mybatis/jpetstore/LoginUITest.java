package org.mybatis.jpetstore;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUITest {

    @Test
    public void verifyHomePageLoads() {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://your-jpetstore-url.com");  // change to your actual app URL
        assertTrue(driver.getTitle().toLowerCase().contains("jpetstore"));
        driver.quit();
    }
}
