import acessories.Amplifier;
import acessories.Microphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmplifierTest {

    Amplifier amplifier;

    @Before
    public void before() {
        amplifier = new Amplifier("JVC", 15.00, 30.00);
    }

    @Test
    public void checkMarkup() {
        assertEquals(15.00, amplifier.calculateMarkup(), 0.01);
    }
}
