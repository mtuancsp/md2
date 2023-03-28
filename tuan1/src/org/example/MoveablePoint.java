package org.example;

public class MoveablePoint extends Point2D {
    private double xSpeed = 0.0;
    private double ySpeed = 0.0;
    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(double xSpeed, double ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint() {
    }

    public double getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }
    public double getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(double xSpeed, double ySpeed) {
        setXSpeed(xSpeed);
        setYSpeed(ySpeed);
    }
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
    public void move() {
        setX(getX() + getXSpeed());
        setY(getY() + getYSpeed());
    }

}

class TestMovablePoint {
    public static void main(String[] args) {
        MoveablePoint p = new MoveablePoint(1, 2, 3, 4);
        System.out.println(p);
        p.move();
        p.setSpeed(5, 6);
        p.move();
        p.move();
        System.out.println(p);
    }
}

