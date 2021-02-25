/**
 * @author harrison
 */

/*
    581. Shortest Unsorted Continuous Subarray
*/

public class ShortestUnsortedContinuousSubarray {
    // Time: O(nlogn), memory: O(n)
    //    public static int findUnsortedSubarray(int[] nums) {
    //        int[] copied = nums.clone();
    //        Arrays.sort(copied); //
    //
    //        int start = 0;
    //        int end = -1;
    //        for (int i = 0; i < copied.length; i++) {
    //            if (nums[i] != copied[i]) {
    //                start = i;
    //                break;
    //            }
    //        }
    //
    //        for (int i = copied.length - 1; i >= 0; i--) {
    //            if (nums[i] != copied[i]) {
    //                end = i;
    //                break;
    //            }
    //        }
    //
    //        return end - start + 1;
    //    }

    public static int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int start = 0;
        int end = -1;

        for (int left = 0, right = nums.length - 1; left < nums.length; left++, right--) { // this can be split into two loops
            // By checking num one by one, if numbers are sorted, max should always be updated.
            // When max is not updated, it means a number is not sorted, and we can store that index, like how we find the max, to obtain the last unsorted index on the right
            if (nums[left] >= max) {
                max = nums[left];
            } else {
                end = left;
            }

            // This is similar as above
            if (nums[right] <= min) {
                min = nums[right];
            } else {
                start = right;
            }
        }

        return end - start + 1;
    }
}
