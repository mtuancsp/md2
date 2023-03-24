package org.example;

import java.util.Scanner;

public class SumColumn {
    public static int sumColumns(int[][] arr, int col) {
        int sum = 0;
        for (int[] i : arr) {
            sum += i[col];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of rows of the matrix: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int cols = scanner.nextInt();
        int[][] arr2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element at position [" + i + "][" + j + "]: ");
                arr2[i][j] = scanner.nextInt();
            }
        }
        System.out.print("\n" +
                "Enter the column you want to sum: ");
        int col2 = scanner.nextInt();
        int sum2 = sumColumns(arr2, col2);
        System.out.println("Sum of the column " + col2 + " is: " + sum2);
    }
}
