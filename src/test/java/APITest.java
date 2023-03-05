import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class APITest {
    @Test
    public void name() {
        String url = "https://restful-booker.herokuapp.com/booking";
        Response response = given().get(url);
        response.then().assertThat().statusCode(200);
        System.out.println("CodForLife");
    }
}
