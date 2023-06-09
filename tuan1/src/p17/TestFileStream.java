package p17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream output = new FileOutputStream("temp.dat")){
            for (int i=0; i<10; i++) {
                output.write(i);
            }
        }

        try (FileInputStream output = new FileInputStream("temp.dat")){
            int i;
            while ((i = output.read()) != -1) {
                System.out.print(i + " ");
            }
        }
    }
}
