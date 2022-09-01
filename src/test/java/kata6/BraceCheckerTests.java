package kata6;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BraceCheckerTests {

    final private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertTrue(checker.isValid("()"));
        assertTrue(checker.isValid("---(++++)----"));
        assertTrue(checker.isValid(""));
        assertTrue(checker.isValid("before ( middle []) after "));
        assertTrue(checker.isValid("(  [  <>  ()  ]  <>  )"));
    }

    @Test
    public void testInvalid() {
        assertFalse(checker.isValid("[(])"));
        assertFalse(checker.isValid(") ("));
        assertFalse(checker.isValid("<(   >)"));
        assertFalse(checker.isValid("   (      [)"));
    }

    @Test
    public void testInt () {
        assertEquals(BraceChecker.func("qwertyu", "q", "t"), 4);
        assertEquals(BraceChecker.func1("qwertyu", "q", "t"), 4);
    }

}
