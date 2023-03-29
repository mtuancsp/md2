package org.example;

public class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

}

class Circles extends Shape {
    private double radius;

    public Circles() {
        radius = 1.0;
    }

    public Circles(double radius) {
        this.radius = radius;
    }

    public Circles(String color, boolean filled, double radius) {
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

    @Override
    public String toString() {
        return "A Circle with radius "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}

class CircleTest {
    public static void main(String[] args) {
        Circles circle = new Circles();
        System.out.println(circle);

        circle = new Circles(3.5);
        System.out.println(circle);

        circle = new Circles("red", false, 3.5);
        System.out.println(circle);
    }

}

class Rectangles extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangles() {
    }

    public Rectangles(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangles(String color, boolean filled, double width, double height) {
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

    @Override
    public String toString() {
        return "A Rectangle with width "
                + getWidth()
                + " and height "
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}

class RectangleTest {
    public static void main(String[] args) {
        Rectangles rectangle = new Rectangles();
        System.out.println(rectangle);

        rectangle = new Rectangles(3.5, 4.5);
        System.out.println(rectangle);

        rectangle = new Rectangles("red", false, 3.5, 4.5);
        System.out.println(rectangle);
    }
}

class Squares extends Rectangles {
    private double side;
    public Squares() {
    }

    public Squares(double side) {
        super(side, side);
    }

    public Squares(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}

class SquareTest {
    public static void main(String[] args) {
        Squares square = new Squares();
        square.setSide(5.0);
        System.out.println(square);
    }

}


