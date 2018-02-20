package pl.codeleak.samples.junit5.s06;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(CustomParameterResolverExtension.class)
class CustomParameterResolverTest {

    @Test
    void resolveCustomParameter(CustomParameter customParameter, TestReporter testReporter) {
        testReporter.publishEntry("customParameter", customParameter.toString());

    }
}