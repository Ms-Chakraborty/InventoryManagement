// ProductWithObserver.java
import java.util.*;

public class ProductWithObserver extends Product {
    private List<StockObserver> observers = new ArrayList<>();

    public ProductWithObserver(String productId, String name, double price, int quantity) {
        super(productId, name, price, quantity);
    }

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void updateQuantity(int quantity) {
        super.updateQuantity(quantity);
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(this);
        }
    }
}

