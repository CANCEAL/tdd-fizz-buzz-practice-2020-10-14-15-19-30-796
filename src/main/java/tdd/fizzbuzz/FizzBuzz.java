package tdd.fizzbuzz;

public class FizzBuzz {
    private static final int MODULO_3 = 3;
    private static final String FIZZ = "Fizz";
    private static final int MODULO_5 = 5;
    private static final String BUZZ = "Buzz";

    public String countOff(int orderNumber) {
        if (orderNumber%MODULO_3 == 0) {
            return FIZZ;
        }
        if (orderNumber%MODULO_5 == 0) {
            return BUZZ;
        }
        if (orderNumber%7 == 0) {
            return "Whizz";
        }
        return null;
    }
}
