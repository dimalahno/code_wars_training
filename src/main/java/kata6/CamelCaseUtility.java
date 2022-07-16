package kata6;

/**
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word
 * within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also
 * often referred to as Pascal case).
 *
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */
public class CamelCaseUtility {

    public static String toCamelCase(String s){

        String[] words = s.split("[-_]");

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                word = word.isEmpty() || Character.isUpperCase(word.charAt(0)) ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }

            builder.append(word);
        }

        return builder.toString();
    }

}
