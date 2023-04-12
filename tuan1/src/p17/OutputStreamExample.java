package p17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("output.txt");

        byte[] bytes = new byte[]{'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        for ( byte b : bytes) {
            os.write(b);
        }

        os.close();
    }
}
