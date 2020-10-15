package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    void gameFizzBuzzWhizz(int orderNumber, String expectedValue) {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String given = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals(expectedValue, given);
    }

    @Test
    void should_return_Fizz_when_count_off_given_order_number_3() {
        gameFizzBuzzWhizz(3, "Fizz");
    }

    @Test
    void should_return_Buzz_when_count_off_given_order_number_5() {
        gameFizzBuzzWhizz(5, "Buzz");
    }

    @Test
    void should_return_Whizz_when_count_off_given_order_number_7() {
        gameFizzBuzzWhizz(7, "Whizz");
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_order_number_multiple_to_3_and_5() {
        gameFizzBuzzWhizz(15, "FizzBuzz");
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_order_number_multiple_to_3_and_7() {
        gameFizzBuzzWhizz(21, "FizzWhizz");
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_given_order_number_multiple_to_5_and_7() {
        gameFizzBuzzWhizz(35, "BuzzWhizz");
    }

    @Test
    void should_return_FizzBuzzWhizz_when_count_off_given_order_number_multiple_to_3_and_5_and_7() {
        gameFizzBuzzWhizz(105, "FizzBuzzWhizz");
    }

    @Test
    void should_return_actual_number_when_count_off_given_number_is_not_multiple_to_special_number() {
        gameFizzBuzzWhizz(1, String.valueOf(1));
    }
}
