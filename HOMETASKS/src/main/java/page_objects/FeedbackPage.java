package page_objects;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FeedbackPage {
    public void clickOnFeedbackShopLink(){
        $("[class='reviews-info-firm__box reviews-info-firm__box--title']")
                .shouldBe(visible).click();
    }
}
