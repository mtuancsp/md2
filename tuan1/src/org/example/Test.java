package org.example;


class Test {
    int rollno;
    String name;
    static String college = "BachKhoa";


    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Thanh");
        s1.display();
        s2.display();
    }
}

