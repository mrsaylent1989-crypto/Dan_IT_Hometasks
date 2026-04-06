package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page_objects.SearchResultPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultStepDefinition extends BaseStepDefinition {

    SearchResultPage searchResultPage = new SearchResultPage();

    @When("user remember {int} product name on Search Result Page")
    public void rememberProductName(int productIndex) {
        String expectedProductName = searchResultPage.getProductName(productIndex);
        putValueToMapByKey("expectedProductName", expectedProductName);
    }

    @When("user clicks on {int} picture on Search Result Page")
    public void clickOnProductPicture(int productIndex) {
        searchResultPage.clickOnProductPicture(productIndex);
    }


    @Then("title contains {string} search word on Search Result Page")
    public void verifyTitle(String wordToVerify) {
        String actialTitle = searchResultPage.getTitle();
        Assert.assertTrue(actialTitle.contains(wordToVerify));
    }
    @Then("user navigate on his favorite items")
    public boolean favoritePageIsDysplayed(){
        return $("[class='profile-list-header__title']").shouldBe(visible).isDisplayed();
    }
}
