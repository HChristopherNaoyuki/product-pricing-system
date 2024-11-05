# Product Inventory System

This is a simple Java-based inventory system that models products with different types. The project includes an abstract `Product` class and two subclasses: `Perishable` and `NonPerishable`. Each subclass assigns specific prices to the products.

## Features

- **Product Class**: An abstract class that defines common properties (`name`, `price`) and an abstract method `setPrice()` for setting the price of the product.
- **Perishable Class**: A subclass of `Product` that sets a fixed price for perishable items (e.g., yogurt).
- **NonPerishable Class**: A subclass of `Product` that sets a fixed price for non-perishable items (e.g., cleaning tools).
- **UseProduct Class**: A test class to demonstrate the creation and display of both perishable and non-perishable products.

## Project Structure

- **Product.java**: Abstract class representing a generic product with name and price.
- **Perishable.java**: Subclass of `Product` representing perishable items with a predefined price.
- **NonPerishable.java**: Subclass of `Product` representing non-perishable items with a predefined price.
- **UseProduct.java**: A simple class to demonstrate how products are created and priced.

## Getting Started

1. Clone this repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/product-pricing-system.git
   ```
2. Open the project in your preferred IDE (e.g., NetBeans, IntelliJ, or Eclipse).
3. Run the `UseProduct` class to see the demonstration of how perishable and non-perishable products are instantiated and priced.

## Example Output

```
Perishable Product
Product: Joghurt
Price: R11.99

Non-perishable Product
Product: Swivel Mop
Price: R19.99
```

---
