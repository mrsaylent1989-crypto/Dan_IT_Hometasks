import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;

public class Tests extends BaseTest {
    @Test
    public void searchTest() {
        String wordToSearch = "iPhone";

        HomePage homePage = new HomePage(getDriver());
        homePage.searchText(wordToSearch);

        homePage.clickSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        String actualTitleText = searchResultPage.getTitleText();

        Assert.assertTrue(actualTitleText.contains(wordToSearch));
    }

    @Test
    public void navigateTest() {
        String wordToSearch = "iPad";
        int secondProduct = 3;

        HomePage homePage = new HomePage(getDriver());
        homePage.searchText(wordToSearch);
        homePage.clickSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        String expectedProductName = searchResultPage.getProductName(secondProduct);
        searchResultPage.clickOnProduct(secondProduct);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage(getDriver());
        String actualProductTitle = productDetailsPage.getProductPageTitle();

        Assert.assertTrue(actualProductTitle.contains(expectedProductName));
    }

    @Test
    public void reminderTest() throws InterruptedException {
        String mail = "1234";
        String password = "1234";

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickLogin();
        loginPage.enterEmail(mail);
        loginPage.enterPassword(password);
        loginPage.clickReminderButton();

        ReminderPage reminderPage = new ReminderPage(getDriver());
        reminderPage.mailField("1234");
        reminderPage.remindButton();

        WebElement messageError = getDriver().findElement(By.cssSelector("[class='error m_b-5']"));

        Assert.assertTrue(messageError.isDisplayed());
    }
}
