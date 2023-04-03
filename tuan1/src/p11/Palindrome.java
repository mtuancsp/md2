package p11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

    public static boolean isPalindrome(String string) {

        var str = string.toLowerCase();

        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static boolean checkPalindrome(String string) {

        var str = string.toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str1 = "Able was I ere I saw Elba";
        System.out.println(isPalindrome(str1));

        String str2 = "Step on no pets";
        System.out.println(checkPalindrome(str2));

        String str3 = "Never odd or even";
        System.out.println(checkPalindrome(str3));
        System.out.println(isPalindrome(str3));

    }
}
