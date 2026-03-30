import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.example.HomePage;
import org.example.LoginPage;
import org.example.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Tests extends BaseTest{

    @Test
    @Description("this test verify is correctly search field")
    @Epic("search")
    @Feature("Search field")
    @Link(name = "Requirment", url = "https://220volt.com.ua/ua/")
    @Issue("JIRA - 1234")
    public void searchResultCorrectly() {
        String wordToSearch = "ecoflow";

        HomePage homePage = new HomePage();
        homePage.searchText(wordToSearch);

        SearchResultPage searchResultPage = new SearchResultPage();
        String seacrhResult = searchResultPage.getTitleText();

        Assert.assertTrue(seacrhResult.contains(wordToSearch));
    }

    @Test
    @Description("this test verify is correctly catalog search")
    @Epic("search")
    @Feature("Search catalog")
    public void searchCatalogCorrectly() {
        HomePage homePage = new HomePage();
        homePage.catalogClick();
        homePage.catalogChoice();

        SearchResultPage searchResultPage = new SearchResultPage();
        String actualCatalogTitle = searchResultPage.getCatalogText();

        String actualCatalog = $(".inner-title").getText();
        Assert.assertTrue(actualCatalog.contains(actualCatalogTitle));
    }

    @Test
    @Description("this test verify is correctly login from Google")
    @Epic("login")
    @Feature("login from Google")
    public void loginFromGoogleAccount() {
        HomePage homePage = new HomePage();
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.googleLogin();

        SelenideElement googleForm = $("[class='WHUyzc']");
        Assert.assertTrue(googleForm.isDisplayed());
    }

    @Test
    @Description("this test verify is error message, from incorrectly email/password")
    @Epic("login")
    @Feature("login error")
    public void loginErrorCorrectly() {
        String email = "1234";
        String password = "1234";

        HomePage homePage = new HomePage();
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        SelenideElement messageError = $("[class='alert alert-danger']").shouldBe(visible);

        Assert.assertTrue(messageError.isDisplayed());
    }
}
