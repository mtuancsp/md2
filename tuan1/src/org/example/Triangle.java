package org.example;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle( double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return "Triangle {" +
                " side1 = " + side1 +
                ", side2 = " + side2 +
                ", side3 = " + side3 +
                ", color = '" + getColor() + '\'' +
                " and " + (isFilled() ? "filled " : "not filled ") +
                '}';
    }

    public static void main(String[] args) {
        double side1, side2, side3;
        String color;
        boolean filled;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the side1 of the triangle: ");
            side1 = scanner.nextDouble();
            System.out.print("Enter the side2 of the triangle: ");
            side2 = scanner.nextDouble();
            System.out.print("Enter the side3 of the triangle: ");
            side3 = scanner.nextDouble();
            if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
                System.out.println("Invalid input! The sum of any two sides of a triangle must be greater than the third side.");
            }
        } while (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2);

        System.out.print("Enter the color of the triangle: ");
        color = scanner.next();
        System.out.print("Enter the filled of the triangle: ");
        filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);
        System.out.println(triangle);
        System.out.printf("Area: %.2f\n" , triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }

}