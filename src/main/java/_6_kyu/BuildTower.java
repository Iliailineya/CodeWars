package _6_kyu;

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
        String[] strings = new String[nFloors];
        for (int i = 1; i <= nFloors; i++) {
            StringBuilder s = new StringBuilder();
            String gap = " ".repeat(Math.max(0, nFloors - i));
            s.append(gap).append("*".repeat(Math.max(0, i * 2 - 1))).append(gap);
            strings[i - 1] = s.toString();
        }
        return strings;
    }
}
