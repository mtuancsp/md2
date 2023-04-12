package p16.Buffer;

import java.io.*;

public class BIS_BOS {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("CodeGym.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
