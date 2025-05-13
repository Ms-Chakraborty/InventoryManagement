import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        // Sample products
        Product prod1 = new ProductWithObserver("1", "Laptop", 1000.00, 15);
        Product prod2 = new ProductWithObserver("2", "Milk", 1.50, 50);
        inventory.addProduct(prod1);
        inventory.addProduct(prod2);

        // Sample observers
        StockManager manager1 = new StockManager("Manager1");
        StockManager manager2 = new StockManager("Manager2");
        
        ((ProductWithObserver) prod1).addObserver(manager1);
        ((ProductWithObserver) prod2).addObserver(manager2);

        // Main menu loop
        while (true) {
            System.out.println("\n===== Inventory Management Menu =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Remove Product");
            System.out.println("4. Search Product");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    inventory.listAllProducts();
                    break;
                case 2:
                    System.out.print("Enter Product ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine(); // Consume newline

                    Product newProduct = new ProductWithObserver(id, name, price, quantity);
                    inventory.addProduct(newProduct);
                    break;
                case 3:
                    System.out.print("Enter Product ID to remove: ");
                    String removeId = sc.nextLine();
                    inventory.removeProduct(removeId);
                    break;
                case 4:
                    System.out.print("Enter Product Name to search: ");
                    String searchName = sc.nextLine();
                    List<Product> searchResults = inventory.searchByName(searchName);
                    if (searchResults.isEmpty()) {
                        System.out.println("No products found matching: " + searchName);
                    } else {
                        searchResults.forEach(System.out::println);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose between 1 and 5.");
            }
        }
    }
}

