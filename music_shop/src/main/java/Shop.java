import behaviours.ISell;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    List<ISell> stock;

    public Shop() {
        stock = new ArrayList<ISell>();
    }

    public List<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }
}
