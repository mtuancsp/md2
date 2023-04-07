package p13.string;

import java.util.Scanner;

public class LongestSortedSubstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println(longestSubstringInOrder(inputString));

    }

    public static String longestSubstringInOrder(String s) {

        String longest = "";
        String current = "";

        for (int i = 0; i < s.length(); i++) {
            if (current.isEmpty() || s.charAt(i) >= current.charAt(current.length() - 1)) {
                current += s.charAt(i);
                if (current.length() > longest.length()) {
                    longest = current;
                }
            } else {
                current = "" + s.charAt(i);
            }
        }

        return longest;
    }

}

