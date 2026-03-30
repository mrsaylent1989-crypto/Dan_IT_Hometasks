package org.example;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage {
    public String getTitleText() {
        return $(".inner-title").getText();
    }
    public String getCatalogText(){
        return $("[class='cat-img']").getText();
    }

}
