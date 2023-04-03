package p11;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();

        while (decimal != 0) {
            int temp = decimal % 2;
            stack.push(temp);
            decimal /= 2;
        }

        System.out.print("Binary equivalent: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

