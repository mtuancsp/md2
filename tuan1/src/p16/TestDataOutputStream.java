package p16;

import java.io.*;

public class TestDataOutputStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        try {
            FileWriter fout = new FileWriter("CodeGym.txt");
            PrintWriter dout = new PrintWriter(fout);

            for (int e : arr) {
                dout.println(e);
            }

            dout.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
