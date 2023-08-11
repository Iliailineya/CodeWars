package _7_kyu;

/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

        Examples input/output:

        XO("ooxx") => true
        XO("xooxx") => false
        XO("ooxXm") => true
        XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
        XO("zzoo") => false
*/
public class ExesAndOhs {
    public static boolean getXO(String str) {
        long countOfO = str.toLowerCase().chars().filter(ch -> ch == 'o').count();
        long countOfX = str.toLowerCase().chars().filter(ch -> ch == 'x').count();
        return countOfO == countOfX;

//      Выше то что я придумал, ниже то, как бы я хотел решить

//        return str.replaceAll("[^xX]", "").length() ==
//                str.replaceAll("[^oO]", "").length();
    }
}
