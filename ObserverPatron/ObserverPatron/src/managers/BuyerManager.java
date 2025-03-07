package managers;

import models.Product;
import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class BuyerManager {
    private List<Observer> buyers = new ArrayList<>();

    public void addBuyer(Observer buyer){
        buyers.add(buyer);
    }

    public void removeBuyer(Observer buyer){
        buyers.remove(buyer);
    }

    public void notifyBuyers(Product product){
        for (Observer buyer : buyers) {
            buyer.update(product);
        }
    }
}
