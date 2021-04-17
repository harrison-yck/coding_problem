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

        Map<Integer, Integer> prefixSum = new HashMap<>(); // key: prefix, value = occurrence
        for (int num : nums) {
            sum += num;
            if (prefixSum.containsKey(sum - k)) count += prefixSum.get(sum - k);
            prefixSum.put(sum, prefixSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
