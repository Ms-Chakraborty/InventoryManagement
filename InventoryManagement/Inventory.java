import java.util.*;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    // Add a product to the inventory
    public void addProduct(Product product) {
        products.put(product.getProductId(), product);
        System.out.println("Product added: " + product.getName());
    }

    // Remove a product from the inventory using product ID
    public void removeProduct(String productId) {
        if (products.containsKey(productId)) {
            Product removedProduct = products.remove(productId);
            System.out.println("Product removed: " + removedProduct.getName());
        } else {
            System.out.println("⚠️ Product not found.");
        }
    }

    // List all products in the inventory
    public void listAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("\n===== All Products =====");
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
    }

    // Search for products by name
    public List<Product> searchByName(String name) {
        List<Product> result = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(product);
            }
        }
        return result;
    }
}
