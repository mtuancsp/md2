package p16.Buffer;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArray {
    public static void main(String[] args) {
        char[] buffer = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        try (CharArrayReader reader = new CharArrayReader(buffer);
             CharArrayWriter writer = new CharArrayWriter()) {

            int data;
            while ((data = reader.read()) != -1) {
                writer.write(data);
            }

            System.out.println(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
