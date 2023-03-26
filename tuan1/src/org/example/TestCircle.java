package org.example;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.0, "red");
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
    }
}
