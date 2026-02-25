package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test3_4 extends BaseTest {
    @Test
    public void test3() {
        WebElement likeButton = getDriver().findElement(By.cssSelector("[class*='services-section__link link--black s']"));
        likeButton.click();
        WebElement likeField = getDriver().findElement(By.cssSelector("[class='reviews-description-card__title']"));
        Assert.assertTrue(likeField.isDisplayed());
    }

    @Test
    public void test4() {
        WebElement mainMenu = getDriver().findElement(By.cssSelector("[class='button-menu-main ']"));
        mainMenu.click();
        WebElement smartButton = getDriver().findElement(By.cssSelector("a[href='/ua/mobile/'][class='menu-main__item-link']"));
        smartButton.click();
        WebElement telephoneField = getDriver().findElement(By.cssSelector("[class='title-page flex middle-xs section-title']"));
        Assert.assertTrue(telephoneField.isDisplayed());
    }
}
