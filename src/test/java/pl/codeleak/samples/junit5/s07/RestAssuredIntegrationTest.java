package pl.codeleak.samples.junit5.s07;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static io.restassured.RestAssured.when;

@ExtendWith(RestAssuredExtension.class)
class RestAssuredIntegrationTest {

    @Test
    void executesGetAsExternallyConfigured() {
        when()
            .get()
        .then()
            .log().all()
        .and()
            .statusCode(200);
    }
}