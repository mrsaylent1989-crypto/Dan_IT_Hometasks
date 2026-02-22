package hw_test3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement searchInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']"))
        );

        searchInput.sendKeys("Laptop", Keys.ENTER);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class=\"search-list__body\"]")));

        WebElement products = driver.findElement(By.cssSelector("[class=\"search-list__body\"]"));

        Assert.assertTrue(products.isDisplayed());

        driver.quit();
    }
}
