package Aqa_hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import static java.lang.Thread.sleep;

public class Css_test_third {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement searchInput = driver.findElement(By.cssSelector("input[type='text']"));
        searchInput.sendKeys("samsung xs");
        sleep(4000);
        String enteredText = searchInput.getAttribute("value");
        sleep(4000);
        Assert.assertEquals("samsung xs", enteredText);

        driver.quit();
    }
}
