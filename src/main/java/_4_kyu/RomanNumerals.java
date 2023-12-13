package _4_kyu;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
    public static String toRoman(int n) {
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

        String str = Integer.toString(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int decimal = Character.getNumericValue(str.charAt(i));
            String replaceStr = replaceRomanLetter(states.get(decimal), i);
            result.append(replaceStr);
        }
        return result.toString();
    }

    public static String replaceRomanLetter(String input, int position) {
        switch (position) {
            case 0:
                return input;
            case 1:
                return input.replace("I", "X").replace("V", "L").replace("X", "C");
            case 2:
                return input.replace("I", "C").replace("V", "D").replace("X", "M");
            case 3:
                return input.replace("I", "M");
            default:
                throw new IllegalArgumentException("Invalid position");
        }
    }
}



//    public static int fromRoman(String romanNumeral) {
//        return 1;
//    }
