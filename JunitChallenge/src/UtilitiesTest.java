import static org.junit.jupiter.api.Assertions.*;

public class UtilitiesTest {

    private static Utilities util;

    @org.junit.jupiter.api.BeforeAll
    static void setup() {
        util = new Utilities();
    }

    @org.junit.jupiter.api.Test
    public void everyNthChar() throws Exception {
        char[] output = util.everyNthChar(new  char[] {'h', 'e', 'l', 'l', 'o'}, 2);
        assertArrayEquals(new char[] { 'e', 'l'}, output);
        char[] output2 = util.everyNthChar(new  char[] {'h', 'e', 'l', 'l', 'o'}, 8);
        assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, output2);
    }

    @org.junit.jupiter.api.Test
    public void removePairs() throws Exception {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
        assertNull("Did not get null returned when argument passed was null", util.removePairs(null));
        assertEquals("A", util.removePairs("A"));
        assertEquals("", util.removePairs(""));
    }

    @org.junit.jupiter.api.Test
    public void converter() throws Exception {
        assertEquals(300, util.converter(10, 5));

    }

    @org.junit.jupiter.api.Test
    public void converter_arithmeticException() throws Exception {
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
            util.converter(10, 0);
        });
        assertEquals("/ by zero", thrown.getMessage());
    }

    @org.junit.jupiter.api.Test
    public void nullIfOddLength() throws Exception {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }

}