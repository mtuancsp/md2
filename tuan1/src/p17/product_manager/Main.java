package p17.product_manager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager products = new ProductManager("./src/p17/product_manager/products.txt");

        products.getManager().add(new Product("A", "Apple", 1000));
        products.getManager().add(new Product("B", "Banana", 2000));
        products.getManager().add(new Product("C", "Cherry", 3000));

        products.writeToFile();

        List<Product> list = products.getDataFromFile();
        list.forEach(System.out::println);
        System.out.println();

        var searchList = products.searchProduct("e");
        searchList.forEach(System.out::println);
    }
}
