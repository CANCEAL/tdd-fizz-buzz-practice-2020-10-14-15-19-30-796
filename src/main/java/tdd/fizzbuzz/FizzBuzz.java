package tdd.fizzbuzz;

public class FizzBuzz {
    private static final int MODULO_3 = 3;
    private static final String FIZZ = "Fizz";
    private static final int MODULO_5 = 5;
    private static final String BUZZ = "Buzz";
    private static final int MODULO_7 = 7;
    private static final String WHIZZ = "Whizz";
    private static final String FIZZBUZZ = "FizzBuzz";
    private static final String FIZZWHIZZ = "FizzWhizz";
    private static final String BUZZWHIZZ = "BuzzWhizz";

    public String countOff(int orderNumber) {
        if (orderNumber%MODULO_3 == 0 && orderNumber%MODULO_5 == 0 && orderNumber%MODULO_7 == 0) {
            return "FizzBuzzWhizz";
        }
        if (orderNumber%MODULO_3 == 0 && orderNumber%MODULO_5 == 0) {
            return FIZZBUZZ;
        }
        if (orderNumber%MODULO_3 == 0 && orderNumber%MODULO_7 == 0) {
            return FIZZWHIZZ;
        }
        if (orderNumber%MODULO_5 == 0 && orderNumber%MODULO_7 == 0) {
            return BUZZWHIZZ;
        }
        if (orderNumber%MODULO_3 == 0) {
            return FIZZ;
        }
        if (orderNumber%MODULO_5 == 0) {
            return BUZZ;
        }
        if (orderNumber%MODULO_7 == 0) {
            return WHIZZ;
        }
        return null;
    }
}
