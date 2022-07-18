package kata6;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import kata6.BraceChecker;
import org.junit.jupiter.api.Test;

public class BraceCheckerTests {

    final private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertTrue(checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertFalse(checker.isValid("[(])"));
    }

}
