package page_objects;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public void reminderButton(){
        $("a[href='/ua/reminder/']").click();
    }
}
