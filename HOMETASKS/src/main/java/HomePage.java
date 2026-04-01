import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public void searchText(String textToSearch) {
        $("[class='search-input']").setValue(textToSearch);
    }

    public void clickSearchButton() {
        $("[class='search-icon']").click();
    }
    public void lowCostCatalog(){
        $(".price-reduction").shouldBe(clickable).click();
    }
    public void loginClick(){
        $("[class='login-link']").click();
    }
}

