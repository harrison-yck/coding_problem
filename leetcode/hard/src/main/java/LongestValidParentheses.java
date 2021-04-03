import java.util.Stack;

/**
 * @author harrison
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int[] dp = new int[s.length()];
        int longest = 0;
        int leftBracket = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftBracket++;
            } else if (leftBracket > 0) {
                // Two cases:
                // (()) : nested bracket, accumulate length in dp[i - 1]
                // ()() or (())() : separated bracket, also accumulate previous closed bracket(s) length
                dp[i] = dp[i - 1] + 2;
                if (i - dp[i] >= 0) dp[i] += dp[i - dp[i]]; // we need to check String starting with '()' (out of bound)

                longest = Math.max(longest, dp[i]);
                leftBracket--;
            }
        }
        return longest;
    }
}
