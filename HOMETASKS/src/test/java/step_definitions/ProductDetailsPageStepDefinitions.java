package step_definitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import page_objects.ProductDetailsPage;

public class ProductDetailsPageStepDefinitions extends BaseStepDefinition {
    private ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Then("user verify product title is correct on Product Details Page")
    public void verifyProductTitle() {
        String expectedProductName = getValueFromMapByKey("expectedProductName");
        String actualProductTitle = productDetailsPage.getProductName();
        Assert.assertTrue(actualProductTitle.contains(expectedProductName));
    }
}
