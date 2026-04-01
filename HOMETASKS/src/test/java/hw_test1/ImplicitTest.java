package hw_test1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
        String enteredText = "Tablet";

        WebElement search = driver.findElement(By.cssSelector("input[type='text']"));
        search.sendKeys("enteredText", Keys.ENTER);

        WebElement firstProduct = driver.findElement(By.cssSelector("[title='Поиск']"));
        firstProduct.click();

        Assert.assertEquals("Tablet", enteredText);

        driver.quit();
    }
}