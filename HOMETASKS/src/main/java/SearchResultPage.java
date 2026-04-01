import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    public String getTitleText() {
        return $("[class='cv-title']").getText();
    }

    public void lowCostPrice() {
        $("[class='price-value UAH']");
    }
}
