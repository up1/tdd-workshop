import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCDDigitsTest {

    @Test public void
    zero() {
        LCDDigits lcdDigits = new LCDDigits();
        assertEquals(" _ \n" +
                     "| |\n" +
                     "|_|\n", lcdDigits.show(0));
    }

    @Test public void
    one() {
        LCDDigits lcdDigits = new LCDDigits();
        assertEquals("   \n" +
                     "  |\n" +
                     "  |\n", lcdDigits.show(1));
    }

    @Test public void
    ten() {
        LCDDigits lcdDigits = new LCDDigits();
        assertEquals("    _ \n" +
                     "  || |\n" +
                     "  ||_|\n", lcdDigits.show(10));
    }

    @Test public void
    one_hundred_and_one() {
        LCDDigits lcdDigits = new LCDDigits();
        assertEquals("    _    \n" +
                     "  || |  |\n" +
                     "  ||_|  |\n", lcdDigits.show(101));
    }

}
