public class StockManager implements StockObserver {
    private String managerName;

    public StockManager(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public void update(Product product) {
        if (product.getQuantity() < 10) {
            System.out.println(managerName + ": Alert! Stock of " + product.getName() + " is low.");
        }
    }
}
