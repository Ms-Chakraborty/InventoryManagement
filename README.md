# InventoryManagement
A simple and modular console-based inventory management application written in Java.   This project demonstrates key object-oriented principles and implements the **Observer Design Pattern** to monitor stock levels.
---

## 🚀 Features

- Add and remove products from inventory
- View all products and their details
- Update product quantity
- Alerts when stock goes below threshold (Observer pattern)
- Modular structure and extendable components

---

## 🛠 Tech Stack

- **Java** (Core OOP)
- **Console I/O**
- **Observer Design Pattern**

---

## 📁 File Structure
InventoryManagement
-Main.java # CLI interaction and flow control
-Inventory.java # Inventory system with product management
-Product.java # Basic product class
-ProductWithObserver.java # Product subclass with observer support
-StockObserver.java # Observer interface
-StockManager.java # Observer implementation (receives alerts)
-README.md # Project documentation

---

## 🧩 Design Patterns Used

- **Observer Pattern**  
  `StockManager` observes changes in `ProductWithObserver` and gets notified when stock drops below a threshold.

---

## 🧪 Sample Output

```text
=== Inventory Menu ===
1. Add Product
2. View All Products
3. Update Quantity
4. Exit
Select an option: 3

Enter product ID: P101
Enter new quantity: 5
Manager1: Alert! Stock of Apple iPhone 14 is low.
