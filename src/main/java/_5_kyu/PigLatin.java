package _5_kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(word -> word.chars().allMatch(Character::isLetter) ?
                        word.length() > 1 ? word.substring(1) + word.charAt(0) + "ay" : word + "ay" : word)
                .collect(Collectors.joining(" "));
    }
}
