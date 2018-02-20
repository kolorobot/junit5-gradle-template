package pl.codeleak.samples.junit5.s07;

import io.restassured.RestAssured;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class RestAssuredExtension implements BeforeAllCallback {

    @Override
    public void beforeAll(ExtensionContext context) {
        RestAssured.baseURI = "http://qalabs.pl";
    }
}
