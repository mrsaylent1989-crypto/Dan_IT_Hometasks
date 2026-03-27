import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void clickLogin() {
        $("[class='user-button__image flex middle-xs center-xs']").click();
    }

    public void enterEmail(String email) {
        $("[inputmode='email']").setValue(email);
    }

    public void enterPassword(String password) {
        $("[type='password']").setValue(password);
    }

    public void clickReminderButton() {
        $("[href='/ua/reminder/']").shouldBe(clickable).click();
    }
}
