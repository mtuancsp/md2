package miniTest;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value for element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("The elements in the array are:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
