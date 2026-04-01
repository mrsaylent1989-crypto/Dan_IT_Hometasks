import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class Tests extends BaseTest{
    @Test
    public void searchTest() {
        testCaseId = 46;
        String wordToSearch = "marshal";

        HomePage homePage = new HomePage();
        homePage.searchText(wordToSearch);

        homePage.clickSearchButton();

        SearchResultPage searchResultPage = new SearchResultPage();
        String actualTitleText = searchResultPage.getTitleText();

        Assert.assertTrue(actualTitleText.contains(wordToSearch));
    }
    @Test
    public void lowCostPriceSearch(){
        testCaseId = 47;
        HomePage homePage = new HomePage();
        homePage.lowCostCatalog();

        SelenideElement lowCostPrice =  $("[class='price-value UAH']");

        Assert.assertTrue(lowCostPrice.isDisplayed());
    }
    @Test
    public void loginFromGoogle(){
        testCaseId = 48;
        HomePage homePage = new HomePage();
        homePage.loginClick();

        LoginPage loginPage = new LoginPage();
        loginPage.loginFromGoogle();

        SelenideElement googleForm = $("[class='no7ij']");

        Assert.assertTrue(googleForm.isDisplayed());
    }
}
