package _6_kyu;

import java.util.stream.IntStream;

public class GoodVsEvil {
    private static final int[] GOOD_WEIGHTS = {1, 2, 3, 3, 4, 10};
    private static final int[] EVIL_WEIGHTS = {1, 2, 2, 2, 3, 5, 10};

    public static String battle(String goodAmounts, String evilAmounts) {
        int allGood = calculateForce(goodAmounts.split(" "), GOOD_WEIGHTS);
        int allEvil = calculateForce(evilAmounts.split(" "), EVIL_WEIGHTS);

        return allEvil == allGood ? "Battle Result: No victor on this battle field" :
                allGood > allEvil ? "Battle Result: Good triumphs over Evil" : "Battle Result: Evil eradicates all trace of Good";

    }

    private static int calculateForce(String[] amounts, int[] weights) {
        return IntStream.range(0, amounts.length).map(i -> Integer.parseInt(amounts[i]) * weights[i]).sum();
    }
}