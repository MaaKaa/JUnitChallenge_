package pl.maakaa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @Before
    public void setup(){
        utilities = new Utilities();
    }

    @Test
    public void shouldReturn_everyNthChar() {
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        char[] result = {'e', 'l'};
        assertArrayEquals(result, output);
    }

    @Test
    public void shouldReturn_everyNthChar_when_nIsGreaterThanCharLength() {
        char[] output = utilities.everyNthChar(new char[] {'h', 'e', 'l', 'l', 'o'}, 6);
        char[] result = {'h', 'e', 'l', 'l', 'o'};
        assertArrayEquals(result, output);
    }

    @Test
    public void should_removePairs() {
        assertEquals("Test passed", "ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", utilities.removePairs(null));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
    }

    @Test
    public void shouldConvert_converter() {
        assertEquals(300, utilities.converter(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void shouldthrowArithmeticException_converter() throws Exception {
        utilities.converter(10, 0);
    }

    @Test
    public void shouldReturn_nullIfOddLength() {
        assertNull(utilities.nullIfOddLength("Marzena"));
        assertNotNull("Testowanie");
        //assertEquals("Testowanie", utilities.nullIfOddLength("Testowanie"));
    }
}