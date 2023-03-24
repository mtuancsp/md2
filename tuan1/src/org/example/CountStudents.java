package org.example;

import java.util.Scanner;

public class CountStudents {
    public static void main(String[] args) {

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i++] = scanner.nextInt();
        }

        System.out.print("List of mark: ");
        int count = 0;
        for (int e : array) {
            System.out.print(e + "\t");
            if (e >= 5 && e <= 10)
                count++;
        }

        System.out.print("\n The number of students passing the exam is " + count);
    }
}
