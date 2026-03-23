import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReminderPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final By REMINDER_ERROR = By.cssSelector("[class='btn btn--graphite reminder-form__button']");

    public ReminderPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void mailField(String mailAdress){
        WebElement mailField = driver.findElement(By.cssSelector("[type='text']"));
        mailField.sendKeys(mailAdress);
    }
    public void remindButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(REMINDER_ERROR));
        WebElement remindButton = driver.findElement(REMINDER_ERROR);
        remindButton.click();
    }
}
