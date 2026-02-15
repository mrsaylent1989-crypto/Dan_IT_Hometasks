package aqa_hw3.test1;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            String wordToFind = "iPhone";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchField = driver.findElement(By.cssSelector("[type='text']"));
            searchField.sendKeys(wordToFind);
            sleep (2000);
            WebElement searhButton = driver.findElement(By.cssSelector("[title='Поиск']"));
            searhButton.click();
            sleep (4000);

            WebElement titleElement = driver.findElement(By.cssSelector("[class='search__title']"));
            String pageTitleString = titleElement.getText();

            Assert.assertTrue(format("<%s> title doesn't contain <%s> word",pageTitleString,wordToFind),pageTitleString.contains(wordToFind));
        }catch (AssertionError ex) {
            ex.printStackTrace();
        }finally {
            driver.quit();
        }
    }
}
