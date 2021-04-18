import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author harrison
 */
public class SubarraySumEqualsK {
// extremely slow, need to cache
//    public int subarraySum(int[] nums, int k) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//                if (sum == k) count++;
//            }
//        }
//        return count;
//    }

    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        Map<Integer, Integer> prefixSums = new HashMap<>(); // key: prefixSum, value = occurrence
        prefixSums.put(0, 1); // handle prefixSum == k
        for (int num : nums) {
            sum += num;
            if (prefixSums.containsKey(sum - k)) count += prefixSums.get(sum - k); // has prefixSum - k means we can form sum = k
            prefixSums.put(sum, prefixSums.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
