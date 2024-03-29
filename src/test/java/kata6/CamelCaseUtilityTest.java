package kata6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CamelCaseUtilityTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", CamelCaseUtility.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", CamelCaseUtility.toCamelCase(input));
    }

    @Test
    public void testSomeDashUpperStart() {
        String input = "The-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("TheStealthWarrior", CamelCaseUtility.toCamelCase(input));
    }
}