package hw_test2;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class implicitTest2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebElement catalog = driver.findElement(By.cssSelector("[class=\"button-menu-main \"]"));
        catalog.click();

        WebElement ButtonTV = driver.findElement(By.cssSelector("[href=\"/ua/av/\"]"));
        ButtonTV.click();

        WebElement title = driver.findElement(By.cssSelector("[class='title-page flex middle-xs section-title']"));
        Assert.assertTrue(title.isDisplayed());

        driver.quit();
    }
}
