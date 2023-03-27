package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = parseInt(scanner.nextLine());
        System.out.println("Enter string: ");
//        String str = scanner.next();
        String str = scanner.nextLine();
        System.out.println("Number: " + num);
        System.out.println("String: " + str);
    }
}

