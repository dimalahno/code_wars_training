package coderbyte;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Palindrome {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(palindrome(s.nextLine()));
        Map<String, Integer> map = new TreeMap<>();
    }

    private static String palindrome(String str) {
        String sentence = String.join("", str.split(" "));
        String reverse = new StringBuilder(sentence).reverse().toString();
        return sentence.equals(reverse) ? "true" : "false";
    }

    public String spinWords(String sentence) {
        return Stream.of(sentence.split(" "))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining(" "));
    }

}
