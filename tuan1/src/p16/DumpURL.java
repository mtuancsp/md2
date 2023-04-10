package p16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class DumpURL {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("https://www.google.com").openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
