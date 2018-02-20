package pl.codeleak.samples.junit5.s05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

class FizzBuzz2Test {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest(name = "{index} => calculate({0})")
    @MethodSource({"divisibleByThree", "divisibleByThreeButNotFive"})
    void returnFizzForNumberDivisibleByThree(int number) {
        Assertions.assertEquals(fizzBuzz.calculate(number), "Fizz");
    }

    private static Stream<Integer> divisibleByThree() {
        return Stream.of(3, 6, 9, 12);
    }

    // The returned array will be converted to a Stream
    private static String[] divisibleByThreeButNotFive() {
        return new String[]{"18", "21"};
    }
}
