import managers.BuyerManager;
import managers.ProductCatalog;
import models.ProductFactory;
import observers.Buyer;
import strategies.DefaultNotificationStrategy;
import java.util.Arrays;
import java.util.List;

/**
 * Notification System in a Used Products Marketplace
    Buyers can subscribe to keywords or categories, and receive notifications 
    when a seller posts a product that matches their interests.
 */
public class Main {
    public static void main(String[] args) {
        BuyerManager buyerManager = new BuyerManager();
        ProductCatalog productCatalog = new ProductCatalog(buyerManager);

        // Buyers
        Buyer buyer1 = new Buyer("Mike", new DefaultNotificationStrategy(List.of("Electronic"), List.of("iPhone 16"), 1200));
        Buyer buyer2 = new Buyer("Luis", new DefaultNotificationStrategy(Arrays.asList("Home", "Electronic"), List.of("Chair"), 100));
        Buyer buyer3 = new Buyer("Harris", new DefaultNotificationStrategy(List.of("Sports"), List.of("BiCycle"), 500));

        //Add buyers
        buyerManager.addBuyer(buyer1);
        buyerManager.addBuyer(buyer2);
        buyerManager.addBuyer(buyer3);

        //Add products
        productCatalog.addProduct(ProductFactory.createProduct("iPhone 16", "Electronic", 900));
        productCatalog.addProduct(ProductFactory.createProduct("Chair", "Home", 50));
        productCatalog.addProduct(ProductFactory.createProduct("BiCycle", "Sports", 600));
        productCatalog.addProduct(ProductFactory.createProduct("Laptop", "Electronic", 1200));

        //Remove buyer
        buyerManager.removeBuyer(buyer2);
        productCatalog.addProduct(ProductFactory.createProduct("Chair", "Home", 20));
    }
}