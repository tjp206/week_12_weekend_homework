import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class
GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("blue", "electric", 50.00, 100.00, 6);
    }

    @Test
    public void checkNumOfStrings() {
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void checkGuitarPlays() {
        assertEquals("Rock on dude!", guitar.play());
    }

    @Test
    public void checkMarkup() {
        assertEquals(50.00, guitar.calculateMarkup(), 0.01);
    }

}
