package org.example;

public class Student {
    private final int rollno;
    private final String name;
    private static String college = "BBDIT";

    public Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
class TestStaticMethod {
    public static void main(String[] args) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Thanh");
        s1.display();
        s2.display();

        Student.change();
        s1.display();
    }
}


