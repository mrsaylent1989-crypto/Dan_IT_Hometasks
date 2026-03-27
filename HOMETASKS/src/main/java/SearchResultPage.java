import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    public String getTitleText() {
        return $("[class='search__title']").getText();
    }

    public String getProductName(int index) {
        ElementsCollection productElements = $$("div.list-item").shouldHave(sizeGreaterThanOrEqual(48));
        SelenideElement product = productElements.get(index - 1);
        SelenideElement productName = product.$("[class='list-item__title-container m_b-5']");
        return productName.getText();
    }

    public void clickOnProduct(int index) {
        $$(".list-item").get(index).$(".list-item__photo").click();
    }
}
