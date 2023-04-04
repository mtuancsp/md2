package p12.product_manager;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void add(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the new product ID: ");
        int newId = input.nextInt();
        setId(newId);

        System.out.print("Enter the new product name: ");
        String newName = input.next();
        setName(newName);

        System.out.print("Enter the new product price: ");
        double newPrice = input.nextDouble();
        setPrice(newPrice);
    }

    public void edit() {
        System.out.println("\nEdit product" + this);
        add();
        System.out.println("Edit complete" + this);
    }
}
