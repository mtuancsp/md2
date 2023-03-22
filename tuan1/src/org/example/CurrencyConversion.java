package org.example;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {

        double rate = 23000;

        System.out.print("Enter USD: ");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();

        double vnd = usd * rate;
        System.out.printf("VND : %.0f", vnd);

    }
}
