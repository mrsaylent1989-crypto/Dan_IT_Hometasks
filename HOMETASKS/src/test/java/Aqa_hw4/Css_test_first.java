package Aqa_hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Css_test_first {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        boolean logoDisplayed = driver.findElement(
                By.cssSelector("img[alt*='Hotline']")
        ).isDisplayed();

        Assert.assertTrue(logoDisplayed);

        driver.quit();
    }
}
