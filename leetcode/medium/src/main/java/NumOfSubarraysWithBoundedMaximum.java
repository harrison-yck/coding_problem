/**
 * @author harrison
 */
public class NumOfSubarraysWithBoundedMaximum {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int result = 0;
        int count = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > right) {
                j = i + 1;
                count = 0;
            } else if (nums[i] >= left) {
                count = i - j + 1;
            }

            result += count;
        }

        return result;
    }
}
