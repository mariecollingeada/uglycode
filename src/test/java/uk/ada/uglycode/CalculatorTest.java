package uk.ada.uglycode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class hltchkTest {

    @Test
    public void testStringInputWithAddition() {
        String input = "5 5 +";
        int result = hltchk.cmp(input);
        assertEquals(10, result);
    }

    @Test
    public void testStringInputWithMultiplication() {
        String input = "5 5 *";
        int result = hltchk.cmp(input);
        assertEquals(25, result);
    }

    @Test
    public void testStringInputWithSubtraction() {
        String input = "5 5 -";
        int result = hltchk.cmp(input);
        assertEquals(0, result);
    }


}
