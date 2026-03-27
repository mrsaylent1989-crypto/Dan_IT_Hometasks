import static com.codeborne.selenide.Selenide.$;

public class ReminderPage {
    public void mailField(String mailAdress) {
        $("[type='text']").setValue(mailAdress);
    }

    public void remindButton() {
        $("[class='btn btn--graphite reminder-form__button']").click();
    }
}
