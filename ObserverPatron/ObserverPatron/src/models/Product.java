package models;

// Product class
public class Product {
    private String name;
    private String category;
    private Integer price;

    public Product(String name, String category, Integer price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public Integer getPrice() {
        return price;
    }
}