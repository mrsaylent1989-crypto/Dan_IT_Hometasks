import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public void searchText(String textToSearch) {
        $("[type='text']").setValue(textToSearch);
    }

    public void clickSearchButton() {
        $("button.search__btn").click();
    }
}
