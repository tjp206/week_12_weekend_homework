import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar("blue", "electric", 50.00, 100.00, 6);
        piano = new Piano("black", "Grand", 100.00, 200.00, 88);
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock() {
        shop.addToStock(piano);
        shop.addToStock(guitar);
        shop.removeFromStock(piano);
        assertEquals(1, shop.getStock().size());
    }
}
