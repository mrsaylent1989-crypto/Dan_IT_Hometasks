import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void searchText(String textToSearch){
        WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
        searchField.sendKeys(textToSearch);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void clickSearchButton(){
        WebElement searchButton = driver.findElement(By.cssSelector("button.search__btn"));
        searchButton.click();
    }
}
