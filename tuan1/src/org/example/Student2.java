package org.example;

public class Student2 {
    private String name = "John";
    private String classes = "C02";

    public Student2() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses() {
        return classes;
    }

}
class TestStudent2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();
        s1.setName("Hoang");
        s2.setClasses("C03");

        System.out.println(s1.getName() + " " + s1.getClasses());
        System.out.println(s2.getName() + " " + s2.getClasses());
    }
}
