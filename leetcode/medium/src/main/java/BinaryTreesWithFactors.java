import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author harrison
 */
public class BinaryTreesWithFactors {
    public static int numFactoredBinaryTrees(int[] arr) {
        Map<Integer, Long> dp = new HashMap<>(); // product maybe overflow, so use long as value
        long mod = (long) 1e9 + 7; // use long for mod, so we don't have to change the type everytime

        Arrays.sort(arr);

        long count = 0;
        for (int product : arr) {
            for (int factor : arr) {
                if (product % factor == 0) {
                    long combination = (dp.getOrDefault(product, 1L) + dp.getOrDefault(factor, 1L) * dp.getOrDefault(product / factor, 0L)) % mod;
                    dp.put(product, combination);
                }
            }
            count = (count + dp.get(product)) % mod;
        }

        return (int) count;
    }
}
