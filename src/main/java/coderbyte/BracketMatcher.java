package coderbyte;

import java.util.*;

public class BracketMatcher {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(bracketMatcher(s.nextLine()));
    }

    public static String bracketMatcher(String str) {

            List<Character> brackets = new ArrayList<>();
            for (char ch : str.toCharArray()) {
                if (ch == '(' || ch == ')' ) {
                    brackets.add(ch);
                }
            }
            Deque<Character> deque = new LinkedList<>();
            for (Character ch : brackets) {
                if (ch == '(') {
                    deque.addFirst(ch);
                } else {
                    if (!deque.isEmpty() && (deque.getFirst() == '(' && ch == ')')) {
                        deque.removeFirst();
                    } else {
                        deque.addFirst(ch);
                    }
                }
            }
            return deque.isEmpty() ? "1" : "0";
    }
}
