package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.FeedbackPage;

import static com.codeborne.selenide.Selenide.$;

public class FeedbackStepDefinition {
    FeedbackPage feedbackPage = new FeedbackPage();

    @When("user clicks on first shop feedback")
    public void clickOnFeedbackShopLink(){
        feedbackPage.clickOnFeedbackShopLink();
    }
    @Then("user navigate to feedback shop page")
    public boolean correctlyFeedbackShop(){
        return $("[class='default-layout__content-container']").isDisplayed();
    }

}
