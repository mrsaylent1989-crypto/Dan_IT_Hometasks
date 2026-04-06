package step_definitions;

import io.cucumber.java.en.When;
import page_objects.LoginPage;

public class LoginPageStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @When("user clicks on reminder link")
    public void clickReminderButton(){
        loginPage.reminderButton();
    }
}
