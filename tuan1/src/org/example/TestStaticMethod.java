package org.example;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Thanh");
        s1.display();
        s2.display();

        Student.change();
        s1.display();
    }
}
