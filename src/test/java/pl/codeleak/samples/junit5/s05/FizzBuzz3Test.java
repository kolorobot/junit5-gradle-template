package pl.codeleak.samples.junit5.s05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class FizzBuzz3Test {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest(name = "{index} => calculate({0}) should return {1}")
    @CsvFileSource(resources = {"/fizzbuzz_1.csv", "/fizzbuzz_2.csv"}, delimiter = ';')
    void fizzBuzzCsv(int number, String expectedResult) {
        Assertions.assertEquals(fizzBuzz.calculate(number), expectedResult);
    }
}
