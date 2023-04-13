package p16.Buffer;

import java.io.*;

public class DIS_DOS {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"));
             DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) {

            // Ghi dữ liệu
            dos.writeUTF("Hello");
            dos.writeInt(123);
            dos.writeInt(456);

            // Đọc dữ liệu
            String str = dis.readUTF();
            int num = dis.readInt();
            int num2 = dis.readInt();


            System.out.println(str);
            System.out.println(num);
            System.out.println(num2);
        }

    }
}
