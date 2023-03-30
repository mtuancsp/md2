package p9.TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        int x = 1;
        int y = 1;
        Calculator calculator = new Calculator();
        int expResult = 2;
        int result = calculator.add(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd2() {
        int x = Integer.MAX_VALUE;
        int y = 1;
        Calculator instance = new Calculator();
        try {
            instance.add(x,y);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }

    }

    @Test
    public void testAdd3() {
        int x = Integer.MIN_VALUE;
        int y = -1;
        Calculator instance = new Calculator();
        try {
            instance.add(x,y);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        char[] expected = { 'C', 'o', 'd', 'e', 'G', 'y', 'm' };
        char[] actual = "CodeGym".toCharArray();

        assertArrayEquals(expected, actual, "Mảng phải giống nhau");
    }

    @Test
    public void whenAssertingConditions_thenVerified() {
        double actual = 12 / 3.001;
        double expected = 4;
        assertEquals(expected, actual, 0.002);
    }

}
