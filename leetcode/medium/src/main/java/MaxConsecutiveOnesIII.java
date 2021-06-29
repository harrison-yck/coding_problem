/**
 * @author harrison
 */
public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2));
        System.out.println(longestOnes(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3));
        System.out.println(longestOnes(new int[]{0, 0, 0, 1}, 4));
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, longest = 0, numOfZero = 0;

        while (right < nums.length) {
            if (numOfZero > k) {
                if (nums[left] == 0) numOfZero--;
                left++;
            } else {
                if (nums[right] == 0) numOfZero++;

                longest = Math.max(longest, right - left);
                right++;
            }
        }

        return numOfZero > k ? longest : Math.max(longest, right - left);
    }
}
