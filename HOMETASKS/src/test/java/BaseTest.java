import com.codeborne.selenide.Selenide;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected int testCaseId;



    @BeforeMethod
    public void initDriver() {
        Selenide.open("https://portativ.ua/ua/");
    }

    @AfterMethod
    public void testResultToTestRail(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.SUCCESS) {
            TestRailController.publishResults(1, testCaseId);
        } else {
            TestRailController.publishResults(5, testCaseId);
        }
    }


}
