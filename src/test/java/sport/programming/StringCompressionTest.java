package sport.programming;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void rle() {
        String expected = "A4B3C2XYZD4E3F3A6B28";
        String actual = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        Assertions.assertEquals(expected, StringCompression.rle(actual));

        final String nullString = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCompression.rle(nullString));

        final String blankString = "  ";
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCompression.rle(blankString));

        final String wrongSymbolsString = "123";
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringCompression.rle(wrongSymbolsString));

        expected = "F5";
        actual = "FFFFF";
        Assertions.assertEquals(expected, StringCompression.rle(actual));

        expected = "F";
        actual = "F";
        Assertions.assertEquals(expected, StringCompression.rle(actual));

        expected = "ABC";
        actual = "ABC";
        Assertions.assertEquals(expected, StringCompression.rle(actual));
    }
}