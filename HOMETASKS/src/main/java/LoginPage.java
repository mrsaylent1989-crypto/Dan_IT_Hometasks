import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public void loginFromGoogle() {
        $("[class='social-buttons']").shouldBe(visible).click();
    }
}
