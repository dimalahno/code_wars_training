package kata7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringEndsWithTest {

    final private StringEndsWith unit = new StringEndsWith();

    @Test
    void solution() {
        assertTrue(unit.solution("abc", "bc"));
        assertFalse(unit.solution("abc", "d"));
        assertTrue(unit.solution("samurai", "ai"));
        assertFalse(unit.solution("sumo", "omo"));
        assertTrue(unit.solution("ninja", "ja"));
        assertTrue(unit.solution("sensei", "i"));
        assertFalse(unit.solution("samurai", "ra"));
        assertFalse(unit.solution("abc", "abcd"));
        assertTrue(unit.solution("abc", "abc"));
        assertTrue(unit.solution("abcabc", "bc"));
        assertFalse(unit.solution("ails", "fails"));
        assertTrue(unit.solution("fails", "ails"));
        assertFalse(unit.solution("this", "fails"));
        assertTrue(unit.solution("this", ""));
        assertFalse(unit.solution(":-)", ":-("));
        assertTrue(unit.solution("!@#$%^&*() :-)", ":-)"));
        assertFalse(unit.solution("abc\n", "abc"));
    }

    @Test
    void solution2() {
        assertTrue(unit.shortSolution("abc", "bc"));
        assertFalse(unit.shortSolution("abc", "d"));
        assertTrue(unit.shortSolution("samurai", "ai"));
        assertFalse(unit.shortSolution("sumo", "omo"));
        assertTrue(unit.shortSolution("ninja", "ja"));
        assertTrue(unit.shortSolution("sensei", "i"));
        assertFalse(unit.shortSolution("samurai", "ra"));
        assertFalse(unit.shortSolution("abc", "abcd"));
        assertTrue(unit.shortSolution("abc", "abc"));
        assertTrue(unit.shortSolution("abcabc", "bc"));
        assertFalse(unit.shortSolution("ails", "fails"));
        assertTrue(unit.shortSolution("fails", "ails"));
        assertFalse(unit.shortSolution("this", "fails"));
        assertTrue(unit.shortSolution("this", ""));
        assertFalse(unit.shortSolution(":-)", ":-("));
        assertTrue(unit.shortSolution("!@#$%^&*() :-)", ":-)"));
        assertFalse(unit.shortSolution("abc\n", "abc"));
    }
}