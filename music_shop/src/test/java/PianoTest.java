import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano("black", "Grand", 100.00, 200.00, 88);
    }

    @Test
    public void checkNumOfKeys() {
        assertEquals(88, piano.getNumOfKeys());
    }

    @Test
    public void checkPianoPlays() {
        assertEquals("Heavenly classical.", piano.play());
    }

    @Test
    public void checkMarkup() {
        assertEquals(100.00, piano.calculateMarkup(), 0.01);
    }
}
