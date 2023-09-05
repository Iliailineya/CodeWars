package _5_kyu;
/*
 Three 1's => 1000 points
 Three 6's =>  600 points
 Three 5's =>  500 points
 Three 4's =>  400 points
 Three 3's =>  300 points
 Three 2's =>  200 points
 One   1   =>  100 points
 One   5   =>   50 point
 */
public class Greed {
    public static int greedy(int[] dice) {
        int[] counts = new int[6];
        for (int side : dice) {
            counts[side - 1]++;
        }

        int score = 0;
        for (int i = 0; i < 6; i++) {
            int count = counts[i];
            if (count >= 3) {
                score += (i + 1) == 1 ? 1000 : (i + 1) * 100;
                counts[i] -= 3;
            }
        }

        score += counts[0] * 100; // Ones
        score += counts[4] * 50;  // Fives

        return score;
    }

//    public static int greedy(int[] dice) {
//        int n[] = new int[7];
//        for (int d : dice) n[d]++;
//        return n[1]/3*1000 + n[1]%3*100 + n[2]/3*200 + n[3]/3*300 + n[4]/3*400 + n[5]/3*500 + n[5]%3*50 + n[6]/3*600;
//    }
}