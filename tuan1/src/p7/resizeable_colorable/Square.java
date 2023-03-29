package p7.resizeable_colorable;

public class Square extends Shape implements Resizeable, Colorable {

    private double side = 1.0;
    private String color = "green";
    private boolean filled = true;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public void resize(double percent) {
        side *= (percent/100);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String howToColor() {
        return "Color the square along parallel lines";
    }
}
