package org.example;

import java.util.Scanner;


public class FindElement {
    public static void main(String[] args) {

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(input_name)) {
                System.out.println("Position of " + input_name + " in the list is: " + i);
                return;
            }
        }
        System.out.println(input_name + " is not found in the list.");

    }
}
