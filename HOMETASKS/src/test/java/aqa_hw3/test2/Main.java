package aqa_hw3.test2;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotline.ua/");
        driver.manage().window().maximize();
        sleep (4000);

        WebElement likeElement = driver.findElement(By.cssSelector(".button__icon.flex"));
        likeElement.click();
        sleep (4000);

        WebElement onDisplayLikeElement = driver.
                findElement(By.cssSelector(".profile-sidebar__section-content.flex-column"));
        Assert.assertTrue(onDisplayLikeElement.isDisplayed());

        driver.quit();
    }
}
