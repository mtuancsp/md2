package p17.student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Data {
    public static void writeDataToFile(String path, List<Student> students) {
        try (FileOutputStream fos = new FileOutputStream(path, true);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(path);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis)) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
