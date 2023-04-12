package p17;

import java.io.*;

public class DataInputOutputStream {
//    public static void main(String[] args) throws IOException {
//        //ghi dữ liệu vào file temp.dat với DataOutputStream
//        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"))) {
//            output.writeUTF("John");
//            output.writeDouble(85.5);
//            output.writeUTF("Susan");
//            output.writeDouble(185.5);
//            output.writeUTF("Kim");
//            output.writeDouble(105.25);
//        }
//
//        //đọc dữ liệu từ file temp.dat với DataInputStream
//        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))) {
//            System.out.println(input.readUTF() + " " + input.readDouble());
//            System.out.println(input.readUTF() + " " + input.readDouble());
//            System.out.println(input.readUTF() + " " + input.readDouble());
//        }
//    }

    public static void main(String[] args) {
        //ghi dữ liệu vào file test.dat với DataOutputStream
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("test.dat"))) {
            output.writeDouble(4.5);
            output.writeDouble(43.25);
            output.writeDouble(3.2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //đọc dữ liệu từ file test.dat với DataInputStream
        try (DataInputStream input = new DataInputStream(new FileInputStream("test.dat"))) {
            //sử dụng vòng lặp để đọc liên tục dữ liệu
            while (true) {
                System.out.println(input.readDouble());
            }
        } catch (EOFException e) {
            //xử lý nếu có phát sinh lỗi EOFException
            System.out.println("All data were read");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
