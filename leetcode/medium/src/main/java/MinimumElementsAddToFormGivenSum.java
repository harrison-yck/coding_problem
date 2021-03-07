/**
 * @author harrison
 */

/*
* 5698. Minimum Elements to Add to Form a Given Sum
* */
public class MinimumElementsAddToFormGivenSum {
    public static int minElements(int[] nums, int limit, int goal) {
        long start = 0;
        for (int num: nums) start += num;

        int count = 0;
        if (start != goal) {
            long diff = Math.abs(start - goal);

            long c = diff / limit;
            long m = diff % limit;

            count += c;
            if (m != 0) count++;
        }

        return count;
    }
}
