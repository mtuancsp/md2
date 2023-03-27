package org.example;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(2);
        circle.setFilled("black");
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        System.out.println();
        Rectangle2 rectangle = new Rectangle2(2, 4);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
        System.out.println();
    }
}
