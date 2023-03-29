package org.example;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6, "blue", false);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5);
        System.out.println(circles[0].compareTo(circles[1]));
        System.out.println("Pre-sorted:");
        for (ComparableCircle c : circles) {
            System.out.println(c);
        }
        Arrays.sort(circles);
        System.out.println("Sorted:");
        for (ComparableCircle c : circles) {
            System.out.println(c);
        }
    }
}
class ComparableCircle extends Circles implements Comparable<ComparableCircle> {
    public ComparableCircle() {
    }
    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled ) {
        super(color, filled, radius);
}

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) {
            return 1;
        } else if (getRadius() < o.getRadius()) {
            return -1;
        }
        return 0;
    }
}
