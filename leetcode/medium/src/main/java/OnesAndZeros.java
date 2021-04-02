/**
 * @author harrison
 */
public class OnesAndZeros {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];

        for (String s: strs) {
            int[] count = count(s);
            int zeros = count[0];
            int ones = count[1];

            for (int i = 0; i <= m; i++) {
                for (int j = 0; j <= n; j++) {
                    if (i + zeros > m || j + ones > n) continue;
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i + zeros][j + ones]);
                }
            }
        }

        return dp[0][0];
    }

    private int[] count(String s) {
        int[] count = new int[2];
        for (char c : s.toCharArray()) count[c - '0']++;
        return count;
    }
}
