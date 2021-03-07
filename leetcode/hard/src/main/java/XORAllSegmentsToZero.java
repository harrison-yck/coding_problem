import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author harrison
 */

/*
* 5700. Make the XOR of All Segments Equal to Zero
* */

/*
* incorrect answer
* */

public class XORAllSegmentsToZero {
    public static int minChanges(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int index = i % k;
            List<Integer> list = map.getOrDefault(index, new ArrayList<>());
            list.add(nums[i]);
            map.put(index, list);
        }

        int count = 0;
        for (int i = 0; i < k; i++) {
            List<Integer> list = map.get(i);
            count += list.stream().distinct().count() - 1;
        }
        return count;
    }
}
