package _4_kyu;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public static String toRoman(int n) {
        String str = Integer.toString(n);
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            int decimal = Character.getNumericValue(str.charAt(i));
            String replaceStr = replaceRomanLetter(states().get(decimal), i);
            result.append(replaceStr);
        }
        return result.toString();
    }

    public static Map<Integer, String> states() {
        Map<Integer, String> states = new HashMap<>();
        states.put(1, "I");
        states.put(2, "II");
        states.put(3, "III");
        states.put(4, "IV");
        states.put(5, "V");
        states.put(6, "VI");
        states.put(7, "VII");
        states.put(8, "VIII");
        states.put(9, "IX");
        return states;
    }

    public static String replaceRomanLetter(String input, int position) {
        return switch (position) {
            case 0 -> input;
            case 1 -> input.replace("X", "C").replace("I", "X").replace("V", "L");
            case 2 -> input.replace("I", "C").replace("V", "D").replace("X", "M");
            case 3 -> input.replace("I", "M");
            default -> throw new IllegalArgumentException("Invalid position");
        };
    }

    public static int fromRoman(String romanNumeral) {
        return 1;
    }
}



