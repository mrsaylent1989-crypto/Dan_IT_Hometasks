package org.example;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public void googleLogin() {
        $("[class='login-by']").click();
    }
    public void enterEmail(String email) {
        $("input[type='text'][class='form-control'][name='email']").setValue(email);
    }

    public void enterPassword(String password) {
        $("input[type='password'][class='form-control'][name='password']").setValue(password);
    }
    public void clickLogin() {
        $("button[type='submit'][class='btn btn-blue']").click();
    }
}
