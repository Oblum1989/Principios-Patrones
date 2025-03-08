package strategies;

import models.Product;

import java.util.List;

// DefaultNotificationStrategy class implements NotificationStrategy interface and has the shouldNotify method
public class DefaultNotificationStrategy implements NotificationStrategy {
    private List<String> interestedCategories;
    private List<String> interestedNames;
    private int maxPrice;

    public DefaultNotificationStrategy(List<String> interestedCategories, List<String> interestedNames, Integer maxPrice) {
        this.interestedCategories = interestedCategories;
        this.interestedNames = interestedNames;
        this.maxPrice = maxPrice;
    }


    @Override
    public boolean shouldNotify(Product product) {
        return (interestedCategories.contains(product.getCategory()) && interestedNames.contains(product.getName())
        && product.getPrice() <= maxPrice);
    }
}
