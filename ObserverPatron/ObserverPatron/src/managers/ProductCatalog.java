package managers;

import models.Product;

public class ProductCatalog {
    private BuyerManager buyerManager;

    public ProductCatalog(BuyerManager buyerManager) {
        this.buyerManager = buyerManager;
    }

    public void addProduct(Product product) {
        System.out.println("New product added: " + product.getName() + " in the category " + product.getCategory() + " by $" + product.getPrice());
        buyerManager.notifyBuyers(product);
    }
}
