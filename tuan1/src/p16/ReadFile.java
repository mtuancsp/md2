package p16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        int ch;
        FileReader fr = null;

        try {
            fr = new FileReader("text");
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        } catch (IOException ioe) {
            System.out.println("IOException occurred: " + ioe.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error while closing the file reader: " + e.getMessage());
                }
            }
        }
    }

}
