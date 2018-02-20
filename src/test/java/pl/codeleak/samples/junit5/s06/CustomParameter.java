package pl.codeleak.samples.junit5.s06;

import org.apache.commons.lang3.builder.ToStringBuilder;

class CustomParameter {

    private final String testName;

    CustomParameter(String testName) {
        this.testName = testName;
    }

    public String getTestName() {
        return testName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .append("testName", testName)
            .toString();
    }
}
