package test;

import org.junit.Test;

import com.google.common.flogger.FluentLogger;


public class FloggerTest {

    private static final FluentLogger log = FluentLogger.forEnclosingClass();

    @Test
    public void test() {
        log.atWarning().log("Test: %s", "message");
    }

}
