import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author harrison
 */
public class RussianDollEnvelopes {
    // slow
//    public static int maxEnvelopes(int[][] envelopes) {
//        if (envelopes.length == 0) return 0;
//        Arrays.sort(envelopes, Comparator.comparingInt(a -> a[0] * a[1]));
//
//        int max = 0;
//        int[] dp = new int[envelopes.length];
//        for (int i = 0; i < envelopes.length; i++) {
//            dp[i] = 1;
//
//            for (int j = 0; j < i; j++) {
//                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
//                    dp[i] = Math.max(dp[i], 1 + dp[j]);
//                }
//            }
//            max = Math.max(max, dp[i]);
//        }
//
//        return max;
//    }

    public static int maxEnvelopes(int[][] envelopes) {
        // The idea of this solution is to transform the problem into Long Increasing Subsequence problem.
        // To make it possible, we need to reduce the problem dimension to 1:
        // We can sort width or height asc, and when it is equaled, sort another attribute desc

        // The reason of why we need to sort another attribute desc is that
        // when considering long increasing subsequence, we want to give up larger value
        // if smaller value is behind it, so that it is possible to form longer subsequence
        // e.g. 1, 6, 3, 4 - ans: 1, 3, 4
        // In this way, we won't choose 6 given that another attribute of 6 and 3 is the same.

        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        // patient sort
        // ref: https://www.youtube.com/watch?v=22s1xxRvy28&ab_channel=StableSort
        int[] piles = new int[envelopes.length];
        int len = 0;
        for (int[] envelope : envelopes) {
            int i = Arrays.binarySearch(piles, 0, len, envelope[1]); // check envelope[1] should insert to which pile

            if (i < 0) i = -(i + 1);
            piles[i] = envelope[1]; // increasing: update top card in pile, otherwise: create another pile
        }
        return len;
    }
}
