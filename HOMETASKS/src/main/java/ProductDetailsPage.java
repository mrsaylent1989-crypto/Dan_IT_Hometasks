import static com.codeborne.selenide.Selenide.$;

public class ProductDetailsPage {
    public String getProductPageTitle() {
        return $("[class='title__main']").getText();
    }
}
