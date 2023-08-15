package _6_kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */
public class CamelCase {
    public static void main(String[] args) {
        String input = "the_Stealth_Warrior";
        String camelCaseString = toCamelCase(input);
        System.out.println(camelCaseString); // Output: helloWorldExample
    }

    public static String toCamelCase(String s) {
        String[] words = s.split("[^A-Za-z]");

        return words[0] + Arrays.stream(words)
                .skip(1)
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining());
    }

}
