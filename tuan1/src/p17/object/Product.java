package p17.object;

import java.io.Serializable;

public class Product implements Serializable {
    private final int id;
    private final String name;
    private final int price;
    private final String description;

    public Product(int id, String name, int price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', price=" + price + ", description='" + description + "'}";
    }


}
