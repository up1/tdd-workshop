import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CircularBufferTest {

    CircularBuffer circularBuffer = new CircularBuffer();


    @Test public void
    first_in_first_out() {
        circularBuffer.add("A");
        circularBuffer.add("B");
        assertEquals("A", circularBuffer.get());
        assertEquals("B", circularBuffer.get());
    }

    @Test public void
    not_full_after_created() {
        assertFalse("Full buffer after created.", circularBuffer.isFull());
    }

    @Test public void
    full() {
        circularBuffer.add("A");
        circularBuffer.add("B");
        assertTrue("Not Full buffer.", circularBuffer.isFull());
    }




    @Test public void
    empty_after_created() {
        assertTrue("Buffer not empty after created.", circularBuffer.isEmpty());
    }

    @Test public void
    not_empty_after_add_a_value() {
        circularBuffer.add("some value");
        assertFalse("Buffer empty after add a value.", circularBuffer.isEmpty());
    }

    @Test public void
    get_same_value_after_added_a_value() {
        circularBuffer.add("A");
        assertEquals("A", circularBuffer.get());

        circularBuffer.add("B");
        assertEquals("B", circularBuffer.get());
    }

}
