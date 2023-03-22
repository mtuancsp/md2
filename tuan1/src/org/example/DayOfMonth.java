package org.example;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        // Program to determine the number of days in a given month
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month do you want to count days for?");
        int month = scanner.nextInt();
        int days;

        switch (month) {
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }

        System.out.printf("The month '%d' has '%d' days!", month, days);
    }
}
