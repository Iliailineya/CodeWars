package _6_kyu;

import java.util.stream.IntStream;

/*

Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

        For example, a tower with 3 floors looks like this:

        [
        "  *  ",
        " *** ",
        "*****"
        ]
        And a tower with 6 floors looks like this:

        [
        "     *     ",
        "    ***    ",
        "   *****   ",
        "  *******  ",
        " ********* ",
        "***********"
        ]
*/
public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        return IntStream.rangeClosed(1, nFloors)
                .mapToObj(i -> {
                    String gap = " ".repeat(Math.max(0, nFloors - i));
                    String stars = "*".repeat(Math.max(0, i * 2 - 1));
                    return gap + stars + gap;
                })
                .toArray(String[]::new);
    }
}