package pl.maakaa;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void everyNthChar() {
        fail("Test failed");
    }

    @Test
    public void removePairs() {
        Utilities utilities = new Utilities();
        assertEquals("Test passed", "ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
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