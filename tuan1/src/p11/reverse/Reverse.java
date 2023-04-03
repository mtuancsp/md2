package p11.reverse;

import java.util.Arrays;
import java.util.Stack;

public class Reverse {
    public static <T> T[] reverseArray(T[] array) {

        Stack<T> stack = new Stack<>();

        for (T e : array) {
            stack.push(e);
        }

        T[] newArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            newArray[i] = stack.pop();
        }

        return newArray;
    }

    public static String reverseString(String str) {

        char[] arr = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char i : arr) {
            stack.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        return new String(arr);
    }

}
