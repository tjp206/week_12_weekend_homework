import acessories.Microphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MicrophoneTest {

    Microphone microphone;

    @Before
    public void before() {
        microphone = new Microphone("Sony", 10.00, 20.00);
    }

    @Test
    public void checkMarkup() {
        assertEquals(10.00, microphone.calculateMarkup(), 0.01);
    }
}
