package p7.resizeable_colorable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 2.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
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



    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        width *= (percent/100);
        height *= (percent/100);
    }
}
