package Aqa_hw4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class Xpath_test_3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();

        driver.findElement(
                By.xpath("//div[contains(@class,'button-menu-main')]")).click();
        Thread.sleep(2000);

        boolean catalogMenuVisible = driver.findElement(
                By.xpath("//ul[contains(@class,'menu-main__list')]")).isDisplayed();

        Assert.assertTrue(catalogMenuVisible);

        driver.quit();
    }
}
