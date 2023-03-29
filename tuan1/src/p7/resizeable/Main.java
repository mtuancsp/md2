package p7.resizeable;


public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(1.0);
        shapes[1] = new Square(2.0);
        shapes[2] = new Rectangle(3.0, 4.0);
        shapes[3] = new Circle(5.0);
        shapes[4] = new Square(6.0);

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area pre-resized: " + shape.getArea());
            shape.resize(100 + (int)(Math.random() * 100) + 1);
            System.out.println(shape.getClass().getSimpleName() + " area after-resized: " + shape.getArea());
        }

        System.out.println(((Square)shapes[4]).howToColor());


    }
}

