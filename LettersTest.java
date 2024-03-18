package softwaretesting;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;
import static org.junit.jupiter.api.Assertions.*;

public class LettersTest {

    @Property
    void testProcessString(@ForAll @AlphaChars String input) {
        String processedString = Letters.processString(input);

        //check that processed string is uppercase
        assertTrue(processedString.equals(processedString.toUpperCase()));

        //check that "S" has been removed if it exists
        assertFalse(processedString.contains("S"));
    }
}