package pl.codeleak.samples.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnit5Tests {

    @Test
    void helloJUnit5() {
        Assertions.assertAll(
            () -> Assertions.assertTrue(true),
            () -> Assertions.assertFalse(false),
            () -> Assertions.assertEquals(0, 0, "0 is equal to 0")
        );
    }
}
