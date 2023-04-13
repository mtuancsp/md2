package p17.product_manager;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private String filePath;

    private List<Product> manager;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public List<Product> getManager() {
        return manager;
    }

    public void setManager(List<Product> manager) {
        this.manager = manager;
    }

    public ProductManager(String filePath) {
        this.filePath = filePath;
        this.manager = new ArrayList<>();
    }

    public void writeToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(manager);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Phương thức để lấy danh sách sản phẩm từ file
    public List<Product> getDataFromFile() {
        List<Product> products = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            products = (List<Product>) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return products;
    }

    // Phương thức để tìm kiếm sản phẩm
    public List<Product> searchProduct(String keyword) {
        List<Product> result = new ArrayList<>();
        List<Product> products = getDataFromFile();

        for (Product product : products) {
            for (Field field : product.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object value;
                try {
                    value = field.get(product);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                if (value != null && value.toString().toLowerCase().contains(keyword.toLowerCase())) {
                    result.add(product);
                    break;
                }
            }
        }

        return result;
    }


}
