package pl.maakaa;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
        Utilities utilities = new Utilities();
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        char[] result = {'e', 'l'};
        assertArrayEquals(result, output);
    }

    @Test
    public void removePairs() {
        Utilities utilities = new Utilities();
        assertEquals("Test passed", "ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
    }

    @Test
    public void converter() {
        fail("Test failed");
    }

    @Test
    public void nullIfOddLength() {
        fail("Test failed");
    }
}