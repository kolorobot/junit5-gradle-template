package pl.codeleak.samples.junit5.s04;


import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RepeatedTests {

    @RepeatedTest(12)
    void repeatedTest(RepetitionInfo repetitionInfo, TestReporter testReporter) {
        testReporter.publishEntry("Repeat = ", String.valueOf(repetitionInfo.getCurrentRepetition()));
    }

    @DisplayName("2nd Repeated test")
    @RepeatedTest(value = 2, name = "#{currentRepetition} of {totalRepetitions}")
    void repeatedTestWithRepetitionInfo() {
        System.out.println("2nd Repeated test");
    }
}