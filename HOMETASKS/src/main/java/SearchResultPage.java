import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultPage {
    private WebDriver driver;
    private WebDriverWait waiter;
    private static final By TITLE_ELEMENT = By.cssSelector("[class='search__title']");
    public SearchResultPage (WebDriver driver){
        this.driver = driver;
        waiter = new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    public String getTitleText(){
        waiter.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(TITLE_ELEMENT));
        WebElement title = driver.findElement(TITLE_ELEMENT);
        return title.getText();
    }
    public String getProductName(int productIndex){
        List<WebElement> productElements = driver.findElements(By.cssSelector("[class='list-item__info']"));
        WebElement product = productElements.get(productIndex);
        WebElement productName = product.findElement(By.cssSelector("[class='list-item__title-container m_b-5']"));
        return productName.getText();
    }
    public void clickOnProduct(int productIndex){
        List<WebElement> productElements = driver.findElements(By.cssSelector("div.list-item"));
        WebElement product = productElements.get(productIndex);
        WebElement productPicture = product.findElement(By.cssSelector("[class='list-item__photo']"));
        productPicture.click();
    }
}
