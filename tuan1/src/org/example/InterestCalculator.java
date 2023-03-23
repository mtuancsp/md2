package org.example;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double money = scanner.nextDouble();

        System.out.print("Enter number of months: ");
        int month = scanner.nextInt();

        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = scanner.nextDouble();

        double totalInterest = money * interestRate/100/12 * month;
        System.out.print("Total of interest: " + totalInterest);
    }
}
