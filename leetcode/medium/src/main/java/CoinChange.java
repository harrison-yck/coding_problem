import java.util.Arrays;

/**
 * @author harrison
 */
public class CoinChange {
    private static int[] dp;

    public static int iterativeTopDown(int[] coins, int target) {
        dp = new int[target + 1];

        for (int amount = 1; amount <= target; amount++) { // option
            dp[amount] = Integer.MAX_VALUE;
            for (int coin : coins) {
                int nextAmount = amount - coin;
                if (nextAmount < 0) continue;

                if (dp[nextAmount] != Integer.MAX_VALUE) dp[amount] = Math.min(dp[amount], 1 + dp[nextAmount]); // state = nextAmount
            }
        }

        return dp[target] == Integer.MAX_VALUE ? -1 : dp[target];
    }

//    public static int recursiveTopDown(int[] coins, int amount) {
//        dp = new int[amount + 1];
//        return topDown(coins, amount);
//    }
//
//    // state = current
//    private static int topDown(int[] coins, int current) {
//        if (dp[current] > 0) return dp[current];
//
//        // base
//        if (current == 0) return 0;
//
//        // option
//        int min = Integer.MAX_VALUE;
//        for (int coin : coins) {
//            int subProblem = current - coin;
//            if (subProblem < 0) continue;
//
//            min = Math.min(min, 1 + topDown(coins, subProblem));
//        }
//        dp[current] = min == Integer.MAX_VALUE ? -1 : min;
//
//        return dp[current];
//    }
}
