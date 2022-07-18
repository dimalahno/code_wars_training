package kata6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RomanNumeralConverterTest {

    private final RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void shouldConvertToRoman() {
        assertEquals("I", converter.convert(1));
        assertEquals("IV", converter.convert(4));
        assertEquals("VI", converter.convert(6));
    }
}