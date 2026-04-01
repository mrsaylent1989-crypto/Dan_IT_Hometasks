package hw_test5;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Fluent {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement energy = driver.findElement(By.xpath("//span[@class='img-wrapper']"));
        energy.click();

        WebElement sortSelect = wait.until(driver1 ->
                driver1.findElement(By.xpath("//div[@class='col-xs-12 col-lg-9']")));

        Assert.assertTrue(sortSelect.isDisplayed());

        driver.quit();
    }
}
