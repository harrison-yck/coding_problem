import java.util.Arrays;

/**
 * @author harrison
 */
public class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int count = 0;
        int median = nums[nums.length / 2];
        for (int num : nums) {
            count += Math.abs(median - num);
        }
        return count;
    }
}
