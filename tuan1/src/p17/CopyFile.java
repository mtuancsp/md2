package p17;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class CopyFile {
    private static void copyFileUsingFiles(File source, File destination) throws IOException {
        Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File destination) throws IOException {
        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(destination))
        {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String source = in.nextLine();

        System.out.print("Enter destination file: ");
        String destination = in.nextLine();

        File sourceFile = new File(source);
        File destinationFile = new File(destination);

        try {
            copyFileUsingFiles(sourceFile, destinationFile);
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Could not copy file");
            System.out.println(e.getMessage());
        }
    }
}
