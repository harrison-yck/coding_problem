import java.util.Arrays;
import java.util.Collections;

/**
 * @author harrison
 */
public class CoinChange {
    public static int iterativeBottomUp(int[] coins, int target) {
        int[] dp = new int[target + 1];

        for (int amount = 1; amount <= target; amount++) { // option
            dp[amount] = Integer.MAX_VALUE;
            for (int coin : coins) {
                int nextAmount = amount - coin;
                if (nextAmount < 0) continue; // base

                if (dp[nextAmount] != Integer.MAX_VALUE) dp[amount] = Math.min(dp[amount], 1 + dp[nextAmount]); // state = amount -> nextAmount
            }
        }

        return dp[target] == Integer.MAX_VALUE ? -1 : dp[target];
    }

    public static int recursiveTopDown(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        return topDown(coins, amount, dp);
    }

    private static int topDown(int[] coins, int current, int[] dp) {
        // base
        if (current == 0) return 0;
        if (current < 0) return -1;

        if (dp[current] != 0) return dp[current];

        // option
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subProblem = topDown(coins, current - coin, dp);

            // state transit
            if (subProblem >= 0 && subProblem < min) min = 1 + subProblem;
        }
        dp[current] = min == Integer.MAX_VALUE ? -1 : min;

        return dp[current];
    }
}
