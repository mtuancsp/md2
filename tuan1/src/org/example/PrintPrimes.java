package org.example;

import java.util.Scanner;

public class PrintPrimes {
    public static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many primes do you want to print? ");
        int n = scanner.nextInt();

        for (int i = 2, j = 0; j < n ; i++){
            if (isPrime(i)){
                System.out.println(i);
                j++;
            }
        }
    }

}
