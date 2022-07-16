package kata6_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import kata6.BraceChecker;
import org.junit.jupiter.api.Test;

public class BraceCheckerTests {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }

}
