package p17.object;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Product p1 = new Product(1, "A", 100, "a");
        Product p2 = new Product(2, "B", 110, "b");
        Product p3 = new Product(3, "C", 120, "c");

        FileWriter fileWriter = new FileWriter("products.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(p1.toString());
        bufferedWriter.newLine();
        bufferedWriter.write(p2.toString());
        bufferedWriter.newLine();
        bufferedWriter.write(p3.toString());

        bufferedWriter.close();
        fileWriter.close();

        System.out.println("Dữ liệu đã ghi vào file products.txt");
    }
}
