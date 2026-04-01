import java.util.Base64;

import static io.restassured.RestAssured.given;

public class TestRailController {

    private static final String RUN_ID = "1";
    private static final String BASE_API_URL = "https://scholdanit2026.testrail.io/index.php/api/v2/";
    private static final String USER_EMAIL = "mr.saylent1989@gmail.com";
    private static final String USER_PASSWORD = "Krobelus1989!";
    private static final String CREDENTIALS = Base64.getEncoder().encodeToString((USER_EMAIL + ":" + USER_PASSWORD).getBytes());

    public static void publishResults(int statusId, int testCaseId) {
        given().header("Autorization", "Basic" + CREDENTIALS).contentType("Application/json")
                .body("TestRailRequestDto").post(BASE_API_URL + String.format("add_result_for_case/%s/%s", RUN_ID, testCaseId));
    }
}
