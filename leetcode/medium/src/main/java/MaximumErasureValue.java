/**
 * @author harrison
 */
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        boolean[] used = new boolean[10001];
        int i = 0, j = 0, localSum = 0, max = 0, length = nums.length;
        while (i < length && j < length) {
            if (used[nums[j]]) {
                localSum -= nums[j];
                used[nums[j]] = false;
                i++;
            } else {
                localSum += nums[j];
                max = Math.max(max, localSum);
                used[nums[j++]] = true;
            }
        }
        return max;
    }
}
