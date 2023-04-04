package p12.product_manager;

public class Test {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        manager.add(new Product(1, "Product A", 10.0));
        manager.add(new Product(2, "Product B", 20.0));
        manager.add(new Product(3, "Product C", 15.0));
        manager.displayList();

        manager.addProduct();
        manager.displayList();

        manager.sortAscendingPrice();
        manager.displayList();

        manager.sortDescendingPrice();
        manager.displayList();

        manager.edit(1);

        Product productA = manager.searchByName("Product A"); // Search for a product by name
        System.out.println("Found: " + productA);

        Product deletedProduct = manager.delete(2); // Delete a product by id
        System.out.println("Deleted: " + deletedProduct);
        manager.displayList(); // Display the updated list
    }
}
