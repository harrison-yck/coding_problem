import java.util.*;

/**
 * @author harrison
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return new ArrayList<>();

        Arrays.sort(nums);

        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;

            if (nums[i] > 0) break;

            while (j < k) {
                int threeSum = nums[i] + nums[j] + nums[k];
                if (threeSum == 0) {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                } else if (threeSum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
