public class ProductFactory {
    public static Product createProduct(String productId, String name, double price, int quantity, String type) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Product(productId, name, price, quantity);
            case "grocery":
                return new Product(productId, name, price, quantity);
            default:
                throw new IllegalArgumentException("Unknown product type");
        }
    }
}
