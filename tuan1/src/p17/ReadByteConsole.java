package p17;

import java.io.IOException;
import java.io.InputStream;

public class ReadByteConsole {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true){
            System.out.print("Nhập 1 kí tự: ");
            char ch = (char) is.read();
            if (ch == 'q'){
                System.out.println("Finished");
                break;
            }
            is.skip(2);
            System.out.println("Ký tự nhận được: " + ch);
        }
    }
}
