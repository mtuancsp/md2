package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        double[] roots = q.getRoots();
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else if (roots.length == 1) {
            System.out.printf("The equation has one root: %f", roots[0]);
        } else {
            System.out.printf("The equation has two roots: %f and %f", roots[0], roots[1]);
        }
    }

}