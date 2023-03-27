package org.example;

public class Geometric {
    private String color = "white";
    private String filled = null;

    public Geometric() {
    }

    public Geometric(String color, String filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFilled() {
        return filled;
    }
    public void setFilled(String filled) {
        this.filled = filled;
    }
    public String toString() {
        return "created with \"" + color + "\" color and " +
                (filled == null ? "no fill" : "filled with \"" + filled + "\" color");
    }
}

class Circle2 extends Geometric {
    private double radius;

    public Circle2() {

    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, String color, String filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public void printCircle() {
        System.out.println("Circle: radius = " + radius + ", color = " + getColor() + ", filled = " + getFilled());
    }
}

class Rectangle2 extends Geometric {
    private double width;
    private double height;

    public Rectangle2() {
    }

    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle2(double width, double height, String color, String filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return 2 * (width + height);
}
}
