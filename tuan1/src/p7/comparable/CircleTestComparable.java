package p7.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CircleTestComparable {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(4));
        circles.add(new Circle());
        circles.add(new Circle(3.7));


        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Collections.sort(circles);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
