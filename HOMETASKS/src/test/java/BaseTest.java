import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void initDriver() {
        Selenide.open("https://hotline.ua/");
    }
}
