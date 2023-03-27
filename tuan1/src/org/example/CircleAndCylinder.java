package org.example;

class Circle3 {
    private double radius;
    private String color;

    public Circle3(double radius, String color) {
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
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " , color=" + color + "]";
    }
}

class Cylinder extends Circle3 {
    private double height;

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * height;

    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", height=" + getHeight() + ", color=" + getColor() + "]";
    }
}

public class CircleAndCylinder {
    public static void main(String[] args) {
        Circle3 circle = new Circle3(10, "red");
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        circle.setColor("green");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(10, 20, "blue");
        System.out.println("Area around the cylinder: " + cylinder.getArea());
        cylinder.setRadius(20);
        cylinder.setHeight(10);
        System.out.println("Cylindrical volume: " + cylinder.getVolume());
        System.out.println(cylinder);

    }
}


