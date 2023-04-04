package p12.product_manager;

import java.util.ArrayList;

public class ProductManager extends ArrayList<Product>{

    public void addProduct(){
        var product = new Product();
        product.add();
        add(product);
    }

    public void edit(int id) {
        for (Product product : this) {
            if (product.getId() == id) {
                product.edit();
                break;
            }
        }
    }

    public Product delete(int id) {
        for (Product product : this) {
            if (product.getId() == id) {
                this.remove(product);
                return product;
            }
        }
        return null;
    }

    public void displayList() {
        System.out.println("List of products:");
        for (Product product : this) {
            System.out.println(product);
        }
    }

    public Product searchByName(String name) {
        for (Product product : this) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void sortAscendingPrice() {
        this.sort((p1, p2) -> (int) (p1.getPrice() - p2.getPrice()));
    }

    public void sortDescendingPrice() {
        this.sort((p1, p2) -> (int) (p2.getPrice() - p1.getPrice()));
    }

}
