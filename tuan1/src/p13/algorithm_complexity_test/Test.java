package p13.algorithm_complexity_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        Map<Character, Integer> frequentChar = new HashMap<>();
        int max = 0;
        char character = ' ';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int freq = frequentChar.containsKey(c) ? frequentChar.get(c) + 1 : 1;
            frequentChar.put(c, freq);

            if (freq > max) {
                max = freq;
                character = c;
            }
        }


        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
