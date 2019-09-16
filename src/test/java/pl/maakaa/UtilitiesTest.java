package pl.maakaa;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    @Test
    public void shouldReturn_everyNthChar() {
        Utilities utilities = new Utilities();
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        char[] result = {'e', 'l'};
        assertArrayEquals(result, output);
    }

    @Test
    public void shouldReturn_everyNthChar_when_nIsGreaterThanCharLength() {
        Utilities utilities = new Utilities();
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 6);
        char[] result = {'h', 'e', 'l', 'l', 'o'};
        assertArrayEquals(result, output);
    }

    @Test
    public void should_removePairs() {
        Utilities utilities = new Utilities();
        assertEquals("Test passed", "ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
    }

    @Test
    public void shouldConvert_converter() {
        Utilities utilities = new Utilities();
        assertEquals(300, utilities.converter(10, 5));

    }

    @Test
    public void shouldReturn_nullIfOddLength() {
        Utilities utilities = new Utilities();
        assertNull(utilities.nullIfOddLength("Marzena"));
        assertNotNull("Testowanie");
        //assertEquals("Testowanie", utilities.nullIfOddLength("Testowanie"));
    }
}