package p9.next_day_calculator;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
                return true;
        }
        return false;
    }
}
