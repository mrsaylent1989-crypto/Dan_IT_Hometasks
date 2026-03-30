package org.example;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public void searchText(String textToSearch) {
        $("[class='js-search-input']").setValue(textToSearch).pressEnter();
    }

    public void catalogClick() {
        $("[class='catalog-wrapper']").click();
    }

    public void catalogChoice() {
        $("[class='has-child']").click();
    }

    public void clickLogin() {
        $("[class='login']").shouldBe(clickable).click();
    }

    public void contactNumbers() {
        $("[class=hidden-nav show opened]").shouldBe(clickable).click();
    }
}
