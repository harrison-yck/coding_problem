import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author harrison
 */
public class CountSmallerAfterSelf {
    public static void main(String[] args) {
        System.out.println(countSmaller(new int[]{5, 2, 6, 1}));
    }

    // This must be too slow
//    public static List<Integer> countSmaller(int[] nums) {
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] > nums[j]) count++;
//            }
//            result.add(count);
//        }
//        return result;
//    }

    // binary index tree technique
    public static List<Integer> countSmaller(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        Integer[] result = new Integer[nums.length]; // reduce the cost to reverse ArrayList, therefore use integer array here
        int[] binaryIndex = new int[max - min + 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = getSum(binaryIndex, nums[i] - min);

            // update
            int index = nums[i] - min + 1;
            while (index < binaryIndex.length) {
                binaryIndex[index]++;
                index += index & (-index);
            }
        }

        return Arrays.asList(result);
    }

    private static int getSum(int[] binaryIndex, int index) {
        int sum = 0;
        while (index > 0) {
            sum += binaryIndex[index];
            index -= index & (-index);
        }
        return sum;
    }
}
