package models;

public class ProductFactory {
    public static Product createProduct(String name, String description, Integer price) {
        return new Product(name, description, price);
    }
}
