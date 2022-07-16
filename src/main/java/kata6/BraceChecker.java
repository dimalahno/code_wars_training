package kata6;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Write a function that takes a string of braces, and determines if the order of the braces is valid. It should
 * return true if the string is valid, and false if it's invalid.
 *
 * This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces.
 *
 * All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 *
 * What is considered Valid?
 * A string of braces is considered valid if all braces are matched with the correct brace.
 */
public class BraceChecker {

    public boolean isValid (String braces) {
        if (isBalanced(braces)) {
            Deque<Character> deque = new LinkedList<>();
            for (char ch : braces.toCharArray()) {
                if (ch == '{' || ch == '[' || ch == '(') {
                    deque.addFirst(ch);
                } else {
                    if (!deque.isEmpty()
                            && ((deque.getFirst() == '{' && ch == '}')
                            || (deque.getFirst() == '[' && ch == ']')
                            || (deque.getFirst() == '(' && ch == ')'))) {
                        deque.removeFirst();
                    } else {
                        return false;
                    }
                }
            }
            return deque.isEmpty();
        }
        return false;
    }

    private boolean isBalanced (String braces) {
        if (braces == null || braces.length()%2 != 0) {
            return false;
        } else {
            for (char ch : braces.toCharArray()) {
                if (!(ch == '{' || ch == '[' || ch == '(' || ch == '}' || ch == ']' || ch == ')')) {
                    return false;
                }
            }
        }
        return true;
    }
}
