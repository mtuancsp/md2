package p9.next_day_calculator;

import java.util.Scanner;

public class NextDayCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter day, month, year from user
        System.out.print("Enter day: ");
        int day = input.nextInt();

        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Call the next day calculation method and display the result
        String nextDate = calculateNextDate(day, month, year);
        System.out.println("The next day is: " + nextDate);
    }

    public static String calculateNextDate(int day, int month, int year) {
        // Calculate the next date month year
        if (month == 2) { // Month 2
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { //Leap year
                if (day < 1 || day > 29) {
                    return "Invalid date";
                } else if (day == 29) {
                    day = 1;
                    month = 3;
                } else {
                    day++;
                }
            } else { // Not a leap year
                if (day < 1 || day > 28) {
                    return "Invalid date";
                } else if (day == 28) {
                    day = 1;
                    month = 3;
                } else {
                    day++;
                }
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) { // Month has 30 days
            if (day < 1 || day > 30) {
                return "Invalid date";
            } else if (day == 30) {
                day = 1;
                month++;
            } else {
                day++;
            }
        } else { // Month has 31 days
            if (day < 1 || day > 31) {
                return "Invalid date";
            } else if (day == 31) {
                if (month == 12) {
                    day = 1;
                    month = 1;
                    year++;
                } else {
                    day = 1;
                    month++;
                }
            } else {
                day++;
            }
        }

        // Returns the next date as a string
        return day + "/" + month + "/" + year;
    }
}

