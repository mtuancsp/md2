package miniTest;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String className;

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student class name: ");
        String className = scanner.nextLine();

        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        Student student = new Student(name, age, className);

        System.out.println("\nStudent information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Class name: " + student.getClassName());
        System.out.println("Age: " + student.getAge());

    }
}

