package p17.student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        list.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        list.add(new Student(3, "Đặng Duy Hòa", "Đà Nẵng"));
        list.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        list.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));

        Data.writeDataToFile("src/p17/student/students.txt", list);

        List<Student> list2 = Data.readDataFromFile("src/p17/student/students.txt");
        list2.forEach(System.out::println);

    }
}
