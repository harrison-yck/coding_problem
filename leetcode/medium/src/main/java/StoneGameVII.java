/**
 * @author harrison
 */
public class StoneGameVII {
    public static int stoneGameVII(int[] stones) {
        int numOfStones = stones.length;
        int[] dp = new int[numOfStones];
        for (int i = numOfStones - 1; i >= 0; i--) {
            int sum = stones[i];
            for (int j = i + 1; j < numOfStones; j++) {
                sum += stones[j];
                dp[j] = Math.max(sum - stones[i] - dp[j], sum - stones[j] - dp[j - 1]);
            }
        }
        return dp[numOfStones - 1];
    }
}
