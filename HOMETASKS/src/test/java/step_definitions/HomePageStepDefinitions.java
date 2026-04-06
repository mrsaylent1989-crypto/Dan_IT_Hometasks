package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page_objects.HomePage;
import io.cucumber.java.en.Given;

public class HomePageStepDefinitions {

    private HomePage homePage = new HomePage();

    @Given("User open Home Page")
    public void openHomePage() {
        homePage.openHomePage();
    }
    @When("user clicks on login button")
    public void clickOnLoginButton(){
        homePage.clickOnLoginButton();
    }
    @When("user clicks on favorite button")
    public void clickOnFavoriteButton(){
        homePage.clickOnFavoriteButton();
    }
    @When("user clicks on create new favorites items")
    public void createFavoriteList(){
        homePage.createFavoriteList();
    }
    @When("user enter {string} into search field")
    public void enterSearchWord(String wordToSearch) {
        homePage.enterWordToSearch(wordToSearch);
    }

    @When("user clicks on search button")
    public void clickOnSearchButton() {
        homePage.clickOnSearchButton();
    }

    @When("User clicks on main catalog Button")
    public void clickOnMainCatalogButton() {
        homePage.clickOnMainCatalogButton();
    }
    @When("user clicks on feedback button")
    public void clickOnMainFeedbackButton(){
        homePage.clickOnMainFeedbackButton();
    }

    @Then("verify main catalog menu appears")
    public void verifyMainCatalogMenuIsDispayed() {
        Assert.assertTrue(homePage.verifyMainCatalogMenuIsDisplayed());
    }

}
