package org.example;

import java.util.Scanner;

public record QuadraticEquation(double a, double b, double c) {
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double[] getRoots() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return new double[0];
        } else if (discriminant == 0) {
            return new double[] { -b / (2 * a) };
        } else {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[] { root1, root2 };
        }
    }

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


