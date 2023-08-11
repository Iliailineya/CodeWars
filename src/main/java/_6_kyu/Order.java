package _6_kyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
""  -->  ""
*/
public class Order {
    public static String order(String str) {
        String[] words = str.split(" ");
        List<String> result = new ArrayList<>(Collections.nCopies(words.length, ""));

        for (String word : words) {
            int i = 0;
            String[] tt = word.split("");
            for (String letter : tt) {
                if (letter.matches("[1-9]")) {
                    i = Integer.parseInt(letter);
                    break;
                }
            }
            result.set(i - 1, word);
        }

        return String.join(" ", result);
    }

    public static void main(String[] args) {
        String input = "is2 Thi1s T4est 3a";
        String ordered = order(input);
        System.out.println(ordered);
    }
}
