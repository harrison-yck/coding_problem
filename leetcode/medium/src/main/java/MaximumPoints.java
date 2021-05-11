import java.util.Arrays;

/**
 * @author harrison
 */
public class MaximumPoints {
    public int maxScore(int[] cardPoints, int k) {
        int length = cardPoints.length;
        if (k == length) return Arrays.stream(cardPoints).sum();

        int sum = 0;
        for (int i = 0; i < k; i++) sum += cardPoints[i];

        int maxSum = sum;
        for (int i = 0; i < k; i++) {
            sum = sum - cardPoints[k - i - 1] + cardPoints[length - i - 1];
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }
}
