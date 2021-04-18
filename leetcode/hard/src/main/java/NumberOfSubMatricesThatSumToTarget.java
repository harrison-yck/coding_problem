import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author harrison
 */
public class NumberOfSubMatricesThatSumToTarget {
    public int numSubMatrixSumTarget(int[][] matrix, int target) {
        int result  = 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // dimension reduction to 1D, but this is slow
        int[] array = new int[cols];
        for (int i = 0; i < rows; i++) {
            Arrays.fill(array, 0); // reset
            for (int j = i; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    array[k] += matrix[j][k];
                }
                result += subarraySumEqualsK(array, target);
            }
        }

        return result;
    }

    // see Medium - SubarraySumEqualsK.java
    private int subarraySumEqualsK(int[] nums, int k) {
        int count = 0;
        int sum = 0;

        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);

        for (int num : nums) {
            sum += num;
            if (prefixSums.containsKey(sum - k)) count += prefixSums.get(sum - k);
            prefixSums.put(sum, prefixSums.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
