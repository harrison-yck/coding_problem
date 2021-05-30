import java.util.Arrays;

/**
 * @author harrison
 */

// requirement: runtime: O(n), memory: O(n)
public class MaximumGap {
    public int maximumGapByBucket(int[] nums) {
        if (nums == null || nums.length < 2) return 0;

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int length = nums.length;
        int numOfBucket = (int) Math.ceil((double) (max - min) / (length - 1)); // make this small so that maxGap cannot be smaller than this

        if (numOfBucket == 0) return 0;

        int[] minBucket = new int[length];
        int[] maxBucket = new int[length];
        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        for (int num: nums) {
            int bucketIndex = (num - min) / numOfBucket;
            // based on maxGap cannot smaller than numOfBucket, we know that the maxGap won't be the max - min in same bucket
            // two number in same bucket, compare and update
            minBucket[bucketIndex] = Math.min(minBucket[bucketIndex], num);
            maxBucket[bucketIndex] = Math.max(maxBucket[bucketIndex], num);
        }

        int maxGap = 0;
        for (int i = 0; i < length; i++) {
            if (minBucket[i] != Integer.MAX_VALUE) { // handle if bucket[i] is filled
                maxGap = Math.max(maxGap, minBucket[i] - min); // find max gap
                min = maxBucket[i]; // get max in the bucket to compare with the min of next bucket
            }
        }
        return maxGap;
    }
}
