package _4_kyu;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {

    @Test
    public void testToRoman() {
        assertThat("1 converts to 'I'", RomanNumerals.toRoman(1), is("I"));
        assertThat("2 converts to 'II'", RomanNumerals.toRoman(2), is("II"));
        assertThat("666 converts to 'DCLXVI'", RomanNumerals.toRoman(666), is("DCLXVI"));
    }

//    @Test
//    public void testFromRoman() throws Exception {
//        assertThat("'I' converts to 1", RomanNumerals.fromRoman("I"), is(1));
//        assertThat("'II' converts to 2", RomanNumerals.fromRoman("II"), is(2));
//    }
}