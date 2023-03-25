package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
    // print n fibonacci numbers
    public static void printFibonacci(int n) {
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        printFibonacci(n);
    }
}
