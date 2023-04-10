package p16;

import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        File file = new File("scores.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }

        try (PrintWriter output = new PrintWriter(file)) {
            output.print("John T Smith ");
            output.println(90);

            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}
