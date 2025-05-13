public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    
    public Product(String productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Getters and setters
    public String getProductId() {
        return productId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void updateQuantity(int quantity) {
        this.quantity += quantity;
    }
    
    @Override
    public String toString() {
        return String.format("Product [ID=%s, Name=%s, Price=%.2f, Quantity=%d]", 
                              productId, name, price, quantity);
    }
}

