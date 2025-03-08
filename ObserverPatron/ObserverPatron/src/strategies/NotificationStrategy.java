package strategies;

import models.Product;

// NotificationStrategy interface
public interface NotificationStrategy {
    boolean shouldNotify(Product product);
}
