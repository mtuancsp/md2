package p16.Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
//    public static void main(String[] args) {
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader("filename.txt"));
//            String line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("filename.txt"))) {
            reader.lines().forEach(System.out::println);
        }
    }
}
