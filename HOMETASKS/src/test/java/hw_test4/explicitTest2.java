package hw_test4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class explicitTest2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated
                        (By.cssSelector("[class='user-button__image flex middle-xs center-xs']")));

        WebElement loginButton = driver.findElement(By.cssSelector("[class='user-button__image flex middle-xs center-xs']"));
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='content login-form']")));

        WebElement loginForm = driver.findElement(By.cssSelector("[class='content login-form']"));

        Assert.assertTrue(loginForm.isDisplayed());

        driver.quit();
    }

}
