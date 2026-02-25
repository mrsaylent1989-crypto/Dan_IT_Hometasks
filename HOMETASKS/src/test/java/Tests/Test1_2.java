package Tests;

import data_provider.ProvideData;
import junit.framework.Assert;
import listeners.listener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;
@Listeners(listener.class)
public class Test1_2 {
    @Test(dataProvider = "getSearchData", dataProviderClass = ProvideData.class)
    public void test1(String model, String title) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(model);
        WebElement searchButton = driver.findElement(By.cssSelector("[class*=search__btn]"));
        searchButton.click();

        WebElement titleSearch = driver.findElement(By.cssSelector("[class='search__title']"));
        String titleText = titleSearch.getText();

        Assert.assertTrue(titleText.contains(title));
        driver.quit();
    }

    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        WebElement searchInput = driver.findElement(By.cssSelector("input[type='text']"));
        searchInput.sendKeys("samsung xs");
        String enteredText = searchInput.getAttribute("value");
        Assert.assertEquals("samsung xs", enteredText);

        driver.quit();
    }
}
