package org.example;

import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime.");
        } else {
            System.out.println(number + " is not a prime.");
        }
    }

}

//public class IsPrime {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("\nEnter a number: ");
//        int number = scanner.nextInt();
//        if (number < 2){
//            System.out.println(number + " is not a prime.");
//        }
//        else {
//            for (int i = 2; i * i <= number; i++){
//                if (number % i == 0){
//                    System.out.println(number + " is not a prime.");
//                    break;
//                }
//            }System.out.println(number + " is a prime.");
//        }
//    }
//}
