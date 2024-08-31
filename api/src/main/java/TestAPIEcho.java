import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.when;

public class TestAPIEcho {

    @Test
    public void getRequest() {
        RestAssured.baseURI = "https://postman-echo.com/get";

        RestAssured.given().param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get()
                .then()
                .assertThat()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void postRequest() {
        RestAssured.baseURI = "https://postman-echo.com/post";

        RestAssured.given().body("{\n" + "   \"foo1\": \"bar1\", \n " + "   \"foo2\": \"bar2\"," + "}")
                .post()
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }

    @Test
    public void putRequest() {
        RestAssured.baseURI = "https://postman-echo.com/put";

        RestAssured.given().header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\n" + "   \"foo1\": \"bar4\" " + "}")
                .when()
                .put()
                .then()
                .statusCode(200)
                .log()
                .all();
    }

    @Test
    public void patchRequest() {
        RestAssured.baseURI = "https://postman-echo.com/patch";

        RestAssured.given().header("Content-type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body("{\n" + "   \"foo1\": \"bar4\" " + "}")
                .when()
                .patch()
                .then()
                .statusCode(200)
                .log()
                .all();
    }

    @Test
    public void deleteRequest() {
        RestAssured.baseURI = "https://postman-echo.com/delete";

        RestAssured
                .given()
                .when()
                .delete()
                .then()
                .log()
                .all()
                .statusCode(200);
    }

}
