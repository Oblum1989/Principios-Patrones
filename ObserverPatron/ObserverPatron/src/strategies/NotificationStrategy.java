package strategies;

import models.Product;

public interface NotificationStrategy {
    boolean shouldNotify(Product product);
}
