package _6_kyu;

// A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits,
// each raised to the power of the number of digits in a given base. In this Kata,
// we will restrict ourselves to decimal (base 10).
//
//        For example, take 153 (3 digits), which is narcissistic:
//
//        1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//        and 1652 (4 digits), which isn't:
//
//        1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938


public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = (int) Math.log10(number) + 1;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

}