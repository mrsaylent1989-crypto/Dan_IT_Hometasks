import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductDetailsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final By PRODUCT_PAGE_TITLE = By.cssSelector("h1.title__main");

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public String getProductPageTitle(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(PRODUCT_PAGE_TITLE));
        WebElement titleElement = driver.findElement(PRODUCT_PAGE_TITLE);
        return titleElement.getText();
    }
   }
