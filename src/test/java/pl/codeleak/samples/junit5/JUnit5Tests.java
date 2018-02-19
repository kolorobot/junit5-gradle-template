package pl.codeleak.samples.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

class JUnit5Tests {

    private static final Logger LOG = LoggerFactory.getLogger(JUnit5Tests.class);

    @Test
    void helloJUnit5() {

        LOG.info(() -> "Hello");

        Assertions.assertAll(
            () -> Assertions.assertTrue(true),
            () -> Assertions.assertFalse(false),
            () -> Assertions.assertEquals(0, 0, "0 is equal to 0")
        );
    }
}
