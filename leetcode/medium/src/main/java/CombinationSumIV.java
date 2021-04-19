/**
 * @author harrison
 */
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        // bottom-up
        int[] dp = new int[target + 1];
        dp[0] = 1; // handle dp[i - num] when i - num = 0

        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }
}
