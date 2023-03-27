package org.example;

import java.util.Arrays;

class Point2D {
    private double x = 0.0;
    private double y = 0.0;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXY() {
        double[] arr = {x, y};
        return arr;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Point3D extends Point2D {
    private double z = 0.0;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }
    //getZ setZ setXYZ getXYZ
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }
    public void setXYZ(double x, double y, double z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public double[] getXYZ() {
        double[] arr = {getX(), getY(), z};
        return arr;
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

}

public class Point2DAndPoint3D {
    public static void main(String[] args) {
        Point2D p2D = new Point2D(1.0, 2.0);
        Point3D p3D = new Point3D(3.0, 4.0, 5.0);
        System.out.println(p2D);
        System.out.println(p3D);

        p2D.setXY(6.0, 7.0);
        p3D.setXYZ(8.0, 9.0, 10.0);
        System.out.println(Arrays.toString(p2D.getXY()));
        System.out.println(Arrays.toString(p3D.getXYZ()));
    }
}

