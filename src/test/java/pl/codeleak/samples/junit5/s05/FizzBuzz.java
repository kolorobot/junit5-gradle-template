package pl.codeleak.samples.junit5.s05;

class FizzBuzz {

    public String calculate(int number) {
        if (isDivisibleBy3(number) && isDivisibleBy5(number)) {
            return "FizzBuzz";
        }

        if (isDivisibleBy3(number)) {
            return "Fizz";
        }

        if (isDivisibleBy5(number)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private static boolean isDivisibleBy3(int dividend) {
        return dividend % 3 == 0;
    }

    private static boolean isDivisibleBy5(int dividend) {
        return dividend % 5 == 0;
    }
}