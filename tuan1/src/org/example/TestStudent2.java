package org.example;

public class TestStudent2 {
    // test Student2
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.setName("Hoang");
        s2.setClasses("C03");

        System.out.println(s1.getName() + " " + s1.getClasses());
        System.out.println(s2.getName() + " " + s2.getClasses());
}
}
