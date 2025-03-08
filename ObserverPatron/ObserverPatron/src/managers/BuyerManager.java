package managers;

import models.Product;
import observers.Observer;

import java.util.ArrayList;
import java.util.List;

// BuyerManager is the Subject class
public class BuyerManager {
    private List<Observer> buyers = new ArrayList<>();

    // Add buyers from the list
    public void addBuyer(Observer buyer){
        buyers.add(buyer);
    }

    // Remove buyers from the list
    public void removeBuyer(Observer buyer){
        buyers.remove(buyer);
    }

    // Notify buyers when a product is added
    public void notifyBuyers(Product product){
        for (Observer buyer : buyers) {
            buyer.update(product);
        }
    }
}
