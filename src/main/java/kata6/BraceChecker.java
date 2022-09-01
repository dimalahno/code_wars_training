package kata6;

import java.util.Deque;
import java.util.LinkedList;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                    }
                }
            }
            return deque.isEmpty();
        }
        return false;
    }

    public boolean isValid2 (String braces) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : braces.toCharArray()) {
            if (ch == '<' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.getFirst() == '<' && ch == '>')
                        || (deque.getFirst() == '[' && ch == ']')
                        || (deque.getFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                }
            }
        }
        return deque.isEmpty();
    }

    public static int func1 (String s, String a, String b) {
        return s.length() > 0 ? Math.max(s.lastIndexOf(a), s.lastIndexOf(b)) : -1;
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

    public static int func(String s, String a, String b){
        if (!Pattern.matches("^$", s)) {
            int i = s.length() - 1;
            int aIndex = -1;
            int bIndex = -1;
            while (aIndex==-1 && bIndex==-1 && i>=0) {
                String str = s.substring(i, i+1);
                if (str.equals(a)) {
                    aIndex = i;
                }
                if (str.equals(b)) {
                    bIndex = i;
                }
                i--;
            }
            return aIndex != -1 ? aIndex : bIndex;
        }
        return -1;
    };
    
}
