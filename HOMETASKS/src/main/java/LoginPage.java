import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final By REMINDER_BUTTON = By.cssSelector("[href='/ua/reminder/']");
    private static final By LOGIN_BUTTON = By.cssSelector("[type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickLogin() {
        driver.findElement(By.cssSelector("[class='user-button__image flex middle-xs center-xs']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.cssSelector("[inputmode='email']"));
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.cssSelector("[type='password']"));
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BUTTON));
        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
    }

    public void clickReminderButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(REMINDER_BUTTON)).click();
        WebElement reminderButton = driver.findElement(REMINDER_BUTTON);
        reminderButton.click();
    }
}
