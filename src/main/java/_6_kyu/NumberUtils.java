package _6_kyu;

/*
 A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits,
 each raised to the power of the number of digits in a given base. In this HighestAndLowest,
 we will restrict ourselves to decimal (base 10).

        For example, take 153 (3 digits), which is narcissistic:

        1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
        and 1652 (4 digits), which isn't:

        1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938
*/


public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        String str = String.valueOf(number);
        int res = str.chars().map(c -> c - '0').map(digit -> (int) Math.pow(digit, str.length())).sum();
        return res == number;
    }

}