package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_Fizz_when_count_off_given_order_number_3() {
        //given
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String given = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals("Fizz", given);
    }

    @Test
    void should_return_Buzz_when_count_off_given_order_number_5() {
        //given
        int orderNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String given = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals("Buzz", given);
    }

    @Test
    void should_return_Whizz_when_count_off_given_order_number_7() {
        //given
        int orderNumber = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String given = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals("Whizz", given);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_order_number_multiple_to_3_and_5() {
        //given
        int orderNumber = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String given = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals("FizzBuzz", given);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_order_number_multiple_to_3_and_7() {
        //given
        int orderNumber = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String given = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals("FizzWhizz", given);
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_given_order_number_multiple_to_5_and_7() {
        //given
        int orderNumber = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String given = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals("BuzzWhizz", given);
    }

    @Test
    void should_return_FizzBuzzWhizz_when_count_off_given_order_number_multiple_to_3_and_5_and_7() {
        //given
        int orderNumber = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String given = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals("FizzBuzzWhizz", given);
    }

    @Test
    void should_return_actual_number_when_count_off_given_number_is_not_multiple_to_special_number() {
        //given
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String given = fizzBuzz.countOff(orderNumber);
        //then
        assertEquals(orderNumber, given);
    }
}
