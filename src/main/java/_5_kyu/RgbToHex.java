package _5_kyu;

public class RgbToHex {
    public static void main(String[] args) {
        System.out.println(rgb(254, 253, 252));
    }

    public static String rgb(int r, int g, int b) {
        String R = Integer.toHexString(border(r)).toUpperCase();
        String G = Integer.toHexString(border(g)).toUpperCase();
        String B = Integer.toHexString(border(b)).toUpperCase();
        return ddd(R) + ddd(G) + ddd(B);
    }


    public static int border(int num) {
        if (num < 0) {
            return 0;
        }
        return Math.min(num, 255);
    }
    public static String ddd(String num) {
        if (num.length() > 1) {
            return num;
        }
        return ("0"+num);
    }

}