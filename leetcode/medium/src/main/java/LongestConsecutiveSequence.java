import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * @author harrison
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int longest = 0;
        for (int num : set) {
            // find leftmost of sequence to start
            if (!set.contains(num - 1)) {
                int count = 1;

                int currentNum = num;
                while (set.contains(++currentNum)) count++;

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
