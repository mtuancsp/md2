package org.example;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {

    }

    public Circle(double v, String blue, boolean b) {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle: radius = " + radius + ", color = " + color;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.0, "red");
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
    }
}
