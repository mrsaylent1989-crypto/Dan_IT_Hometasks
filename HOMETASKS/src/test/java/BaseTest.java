import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void startTests() {
        Selenide.open("https://220volt.com.ua/ua/");
    }
}
