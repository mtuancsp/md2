package p8.Cylinder;

public class Cylinder {

    public static double getArea(double radius, double height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        return perimeter * height + 2 * baseArea;
    }

    private static double getPerimeter(double radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double getVolume(double radius, double height){
        return getBaseArea(radius) * height;
    }
}
