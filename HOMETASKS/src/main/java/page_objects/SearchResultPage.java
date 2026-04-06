package page_objects;

import com.codeborne.selenide.ElementsCollection;
import io.cucumber.java.an.E;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultPage {
    public String getTitle (){
        return $("div.search__title").shouldBe(visible).getText();
    }
    public String getProductName(int productIndex){
        ElementsCollection productNames = $$("div.list-item__info [class='list-item__title-container m_b-5']")
                .shouldHave(sizeGreaterThanOrEqual(productIndex - 1));
        return productNames.get(productIndex - 1).getText();
    }
    public void clickOnProductPicture(int productIndex){
        ElementsCollection productPictures = $$("div.list-item div.list-item__photo")
                .shouldHave(sizeGreaterThanOrEqual(productIndex - 1));
        productPictures.get(productIndex -1).click();
    }
}
