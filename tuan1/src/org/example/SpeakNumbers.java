package org.example;

import java.util.Scanner;

public class SpeakNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer up to 3 digits: ");
        int num = sc.nextInt();
        if (num < 0 || num > 999) {
            System.out.println("Out of ability");
        } else if (num == 0) {
            System.out.println("zero");
        } else {
            String[] onesArr = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String[] tensArr = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
            String[] teenArr = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
            int ones = num % 10;
            int tens = (num / 10) % 10;
            int hundreds = num / 100;
            String result = "";
            if (hundreds > 0) {
                result = onesArr[hundreds] + " hundred";
                if (tens > 0 || ones > 0) {
                    result += " and ";
                }
            }
            if (tens == 1) {
                result += teenArr[ones];
            } else {
                if (tens > 1) {
                    result += tensArr[tens];
                    if (ones > 0) {
                        result += " ";
                    }
                }
                if (ones > 0) {
                    result += onesArr[ones];
                }
            }
            System.out.println(result);
        }
    }
}
