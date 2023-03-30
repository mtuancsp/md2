package p9.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    public void testTranslate() {
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(0));
        assertEquals("một", FizzBuzzTranslate.translate(1));
        assertEquals("Fizz", FizzBuzzTranslate.translate(3));
        assertEquals("Buzz", FizzBuzzTranslate.translate(5));
        assertEquals("Buzz", FizzBuzzTranslate.translate(10));
        assertEquals("mười một", FizzBuzzTranslate.translate(11));
        assertEquals("Fizz", FizzBuzzTranslate.translate(13));
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
        assertEquals("Buzz", FizzBuzzTranslate.translate(20));
        assertEquals("Fizz", FizzBuzzTranslate.translate(21));
        assertEquals("hai mươi tám", FizzBuzzTranslate.translate(28));
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(30));
    }
}
