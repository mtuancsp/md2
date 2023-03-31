package org.example;

import java.util.Arrays;

class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(4);
        circles[1] = new Circle();
        circles[2] = new Circle(3.3);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles, (a,b) -> (int) ((a.getRadius() - b.getRadius())));

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}

//public class CircleComparator implements Comparator<Circle> {
//    @Override
//    public int compare(Circle o1, Circle o2) {
//        return (int) (o1.getRadius() - o2.getRadius());
//    }
//}

