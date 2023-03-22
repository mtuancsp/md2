package org.example;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\nMultiplication Table");
        System.out.println("——————————————————————————————————————————————————————————————————————");
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%dx%d=%-5d", j, i, j*i);

            }
            System.out.println();
        }
    }
}
