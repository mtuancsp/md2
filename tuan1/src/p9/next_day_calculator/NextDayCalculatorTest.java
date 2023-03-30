package p9.next_day_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextDayCalculatorTest {

    @Test
    void testFindNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2023;

        String expected = "2/1/2023";
        String result = NextDayCalculator.calculateNextDate(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testFindNextDay2() {
        int day = 28;
        int month = 2;
        int year = 2023;

        String expected = "1/3/2023";
        String result = NextDayCalculator.calculateNextDate(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testFindNextDay3() {
        int day = 29;
        int month = 2;
        int year = 2023;

        String expected = "Invalid date";
        String result = NextDayCalculator.calculateNextDate(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testFindNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2024;

        String expected = "29/2/2024";
        String result = NextDayCalculator.calculateNextDate(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testFindNextDay5() {
        int day = 31;
        int month = 12;
        int year = 2024;

        String expected = "1/1/2025";
        String result = NextDayCalculator.calculateNextDate(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testFindNextDay6() {
        int day = 30;
        int month = 4;
        int year = 2025;

        String expected = "1/5/2025";
        String result = NextDayCalculator.calculateNextDate(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testFindNextDay7() {
        int day = 31;
        int month = 4;
        int year = 2026;

        String expected = "Invalid date";
        String result = NextDayCalculator.calculateNextDate(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testFindNextDay8() {
        int day = 31;
        int month = 3;
        int year = 2023;

        String expected = "1/4/2023";
        String result = NextDayCalculator.calculateNextDate(day, month, year);
        assertEquals(expected, result);
    }
}
