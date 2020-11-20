import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone("gold", "soprano", 25.00, 50.00, 1);
    }

    @Test
    public void checkNumOfValves() {
        assertEquals(1, saxophone.getNumOfValves());
    }

    @Test
    public void checkSaxophonePlays() {
        assertEquals("Soothing jazz.", saxophone.play());
    }

    @Test
    public void checkMarkup() {
        assertEquals(25.00, saxophone.calculateMarkup(), 0.01);
    }
}
