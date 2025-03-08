package observers;

import models.Product;
import strategies.NotificationStrategy;

// Buyer is the Observer class
public class Buyer implements Observer {
    private String name;
    private NotificationStrategy notificationStrategy;

    public Buyer(String name, NotificationStrategy notificationStrategy) {
        this.name = name;
        this.notificationStrategy = notificationStrategy;
    }


    @Override
    public void update(Product product) {
        if (notificationStrategy.shouldNotify(product)) {
            System.out.println("Alert: " + name + ", new product available: " + product.getName() + " in the category " + product.getCategory() + " by $" + product.getPrice() + "\n");
        }
    }
}
