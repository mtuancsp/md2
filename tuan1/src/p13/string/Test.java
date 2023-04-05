package p13.string;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String string = scanner.nextLine();

        Deque<Character> max = new ArrayDeque<>();

        for (int i = 0; i < string.length(); i++) {
            Deque<Character> deque = new ArrayDeque<>();
            deque.addLast(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > deque.getLast()) {
                    deque.addLast(string.charAt(j));
                }
            }

            if (deque.size() > max.size()) {
                max.clear();
                max.addAll(deque);
            }
            deque.clear();
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

