package alamsyah.hutama.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {
    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @Test
    void testLog() {
        // System.out.println("Hello Logger");
        log.info("Hello Logger");
        log.info("Belajar Java Logging");
    }
}
