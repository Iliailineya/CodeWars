package _5_kyu;

public class RgbToHex {
    public static void main(String[] args) {
        System.out.println(rgb(254, 253, 252));
    }

    public static String rgb(int r, int g, int b) {
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));

        return String.format("%02X%02X%02X", r, g, b);
    }
}