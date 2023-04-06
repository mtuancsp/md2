package p13.string;

import java.util.Scanner;

public class LongestSortedSubstring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringBuilder longestSortedSubstring = new StringBuilder();
        StringBuilder currentSubstring = new StringBuilder();

        currentSubstring.append(inputString.charAt(0));

        for (int i = 1; i < inputString.length(); i++) {

            char currentChar = inputString.charAt(i);

            if (currentChar >= currentSubstring.charAt(currentSubstring.length() - 1)) {

                currentSubstring.append(currentChar);

                longestSortedSubstring = currentSubstring.length() > longestSortedSubstring.length() ?
                                         currentSubstring : longestSortedSubstring;
            }
            else {
                currentSubstring.setLength(0);
                currentSubstring.append(currentChar);
            }
        }

        System.out.println("The longest sorted substring is: " + longestSortedSubstring);
    }
}

