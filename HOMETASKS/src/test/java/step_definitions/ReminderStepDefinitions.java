package step_definitions;

import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.$;

public class ReminderStepDefinitions {

    @Then("user see reminder form")
    public boolean reminderPageIsDysplayed(){
        return $("[class='content reminder-form']").isDisplayed();
    }

}
