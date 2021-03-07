import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author harrison
 */

/*
* 5700. Make the XOR of All Segments Equal to Zero
* */

public class XORAllSegmentsToZero {
/*
 * incorrect answer
 */

//    public static int minChanges(int[] nums, int k) {
//        Map<Integer, List<Integer>> map = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int index = i % k;
//            List<Integer> list = map.getOrDefault(index, new ArrayList<>());
//            list.add(nums[i]);
//            map.put(index, list);
//        }
//
//        int count = 0;
//        for (int i = 0; i < k; i++) {
//            List<Integer> list = map.get(i);
//            count += list.stream().distinct().count() - 1;
//        }
//        return count;
//    }

    private static final int MAX_NUMBER = 1024;
    public static int minChanges(int[] nums, int k) {
        // ref: https://leetcode.com/problems/make-the-xor-of-all-segments-equal-to-zero/discuss/1097213/Python3-Dynamic-Programming-and-Optimizations
        int[][] mem = new int[k][MAX_NUMBER];

        for (int i = 0; i < nums.length; i++) {
            int bucketIndex = i % k;
            mem[bucketIndex][nums[i]] += 1;
        }

        int[] dp = new int[MAX_NUMBER];
        Arrays.fill(dp, -nums.length);
        dp[0] = 0;

        for (int[] memRow: mem) {
            int[] nextDp = new int[MAX_NUMBER];
            Arrays.fill(nextDp, Arrays.stream(dp).max().getAsInt());

            for (int memIndex = 0; memIndex < MAX_NUMBER; memIndex++) {
                if (memRow[memIndex] == 0) continue;

                for (int dpIndex = 0; dpIndex < MAX_NUMBER; dpIndex++) {
                    nextDp[memIndex ^ dpIndex] = Math.max(nextDp[memIndex ^ dpIndex], memRow[memIndex] + dp[dpIndex]);
                }
            }

            dp = nextDp;
        }
        return nums.length - dp[0];
    }
}

