package p17.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product p = new Product(1, "A", 100, "a");

            oos.writeObject(p);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert oos != null;
            oos.close();
        }
        System.out.println("Success!");
    }
}
