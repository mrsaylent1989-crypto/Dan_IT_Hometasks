package page_objects;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public void openHomePage() {
        Selenide.open("https://hotline.ua/");
    }

    public void enterWordToSearch(String wordToSearch) {
        $("[type = 'text']").setValue(wordToSearch);
    }

    public void clickOnSearchButton() {
        $("button.search__btn").click();
    }

    public void clickOnMainCatalogButton() {
        $("div.button-menu-main ").click();
    }

    public boolean verifyMainCatalogMenuIsDisplayed() {
        return $("ul.menu-main__list").shouldBe(visible).isDisplayed();
    }
    public void clickOnLoginButton(){
        $("a.user-button").click();
    }
    public void clickOnFavoriteButton(){
        $("[data-tracking-id='global-17']").shouldBe(clickable).click();
    }
    public void createFavoriteList(){
        $("[class='profile-sidebar__section-child-container']").click();
    }
    public void clickOnMainFeedbackButton(){
        $("[href='/ua/reviews/yp/']").click();
    }
}
