import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class Tests extends BaseTest {
    @Test
    public void searchTest() {
        String wordToSearch = "iPhone";

        HomePage homePage = new HomePage();
        homePage.searchText(wordToSearch);

        homePage.clickSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        String actualTitleText = searchResultPage.getTitleText();

        Assert.assertTrue(actualTitleText.contains(wordToSearch));
    }

    @Test
    public void navigateTest() {
        String wordToSearch = "iPad";
        int index = 1;

        HomePage homePage = new HomePage();
        homePage.searchText(wordToSearch);
        homePage.clickSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        searchResultPage.clickOnProduct(index);

        ProductDetailsPage productDetailsPage = new ProductDetailsPage();
        String actualProductTitle = productDetailsPage.getProductPageTitle();

        Assert.assertTrue(actualProductTitle.contains(wordToSearch));
    }

    @Test
    public void reminderTest() {
        String mail = "1234";
        String password = "1234";

        LoginPage loginPage = new LoginPage();
        loginPage.clickLogin();
        loginPage.enterEmail(mail);
        loginPage.enterPassword(password);
        loginPage.clickReminderButton();

        ReminderPage reminderPage = new ReminderPage();
        reminderPage.mailField("1234");
        reminderPage.remindButton();

        SelenideElement messageError = $("[class='error m_b-5']");
        Assert.assertTrue(messageError.isDisplayed());
    }
}
