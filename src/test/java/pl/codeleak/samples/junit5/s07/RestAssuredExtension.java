package pl.codeleak.samples.junit5.s07;

import io.restassured.RestAssured;
import org.junit.jupiter.api.extension.*;

public class RestAssuredExtension implements BeforeAllCallback, AfterAllCallback, BeforeEachCallback, AfterEachCallback {

    @Override
    public void beforeAll(ExtensionContext context) {
        RestAssured.baseURI = "http://qalabs.pl";
    }

    @Override
    public void afterAll(ExtensionContext context) {

    }

    @Override
    public void afterEach(ExtensionContext context) {

    }

    @Override
    public void beforeEach(ExtensionContext context) {

    }
}
