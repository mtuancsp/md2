package p16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        scannerFromFile();
    }

    public static void scannerFromFile() {
        try {
            Scanner scanner = new Scanner(new File("scores.txt"));
            while (scanner.hasNext()) {
                String firstName = scanner.next();
                String middleName = scanner.next();
                String lastName = scanner.next();
                int score = scanner.nextInt();
                System.out.println(firstName + " " + middleName + " " + lastName + " " + score);
            }

            scanner.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
