package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5Negative {
    @Test
    public void test5(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys("hello");

        String currentUrl = driver.getCurrentUrl();

        Assert.assertFalse(currentUrl.contains("search"));

        driver.quit();
    }
}
