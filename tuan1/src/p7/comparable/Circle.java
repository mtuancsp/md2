package p7.comparable;

public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
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

    @Override
    public String toString() {
        return "Circle with radius = " + radius;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(radius, other.radius);
    }
}
