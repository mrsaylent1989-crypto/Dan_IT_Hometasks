package Aqa_hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import static java.lang.Thread.sleep;

public class xpath_test_2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();
        String findWord = "iPhone 15";

        WebElement searchInput = driver.findElement(By.xpath("//input[@type='text']"));
        searchInput.sendKeys(findWord);
        sleep(2000);

        WebElement searhButton = driver.findElement(By.xpath("//button[@title='Поиск']"));
        searhButton.click();
        sleep(4000);

        WebElement title = driver.findElement(By.xpath("//div[@class='search__title']"));
        String titleText = title.getText();

        Assert.assertTrue(titleText.contains(findWord));

        driver.quit();
    }
}
