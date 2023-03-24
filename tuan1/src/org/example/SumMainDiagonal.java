package org.example;

import java.util.Scanner;

public class SumMainDiagonal {
    public static int sumMainDiagonal(int[][] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the size of the matrix: ");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter the element at position [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Sum of the main diagonal is: " + sumMainDiagonal(arr));
    }
}

