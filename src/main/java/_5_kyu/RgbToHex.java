package _5_kyu;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return (Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b));
    }
}