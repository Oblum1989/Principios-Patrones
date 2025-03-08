package managers;

import models.Product;

// ProductCatalog is the ConcreteSubject class
public class ProductCatalog {
    private BuyerManager buyerManager;

    public ProductCatalog(BuyerManager buyerManager) {
        this.buyerManager = buyerManager;
    }

    // Add a product to the catalog
    public void addProduct(Product product) {
        System.out.println("New product added: " + product.getName() + " in the category " + product.getCategory() + " by $" + product.getPrice());
        buyerManager.notifyBuyers(product);
    }
}
