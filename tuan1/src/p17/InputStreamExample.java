package p17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("CodeGym.txt");
        int i;

//        while ((i = is.read()) != -1){
//            System.out.println((char)i + " - " + i);
//        }

        byte[] bytes = new byte[10];
        while ((i = is.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, i));
        }
        is.close();
    }
}
