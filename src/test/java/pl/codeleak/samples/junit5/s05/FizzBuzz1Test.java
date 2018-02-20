package pl.codeleak.samples.junit5.s05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzz1Test {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest(name = "{index} => calculate({0})")
    @ValueSource(ints = {1, 2, 4, 7, 11, 13, 14})
    void returnsNumberForNumberNotDivisibleByThreeAndFive(int number, TestInfo testInfo) {
        Assertions.assertEquals(fizzBuzz.calculate(number), String.valueOf(number));
    }
}
