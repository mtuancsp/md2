package p13.algorithm_complexity_test;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        int[] frequentChar = new int[255];
        int max = 0;
        char character = ' ';

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            frequentChar[c]++;

            if (frequentChar[c] > max) {
                max = frequentChar[c];
                character = c;
            }
        }

        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }


}
