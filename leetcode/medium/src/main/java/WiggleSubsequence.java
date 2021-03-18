/**
 * @author harrison
 */
public class WiggleSubsequence {
    public static int wiggleMaxLength(int[] nums) {
        if (nums.length == 1) return 1;

        int last = nums[0];
        int currentIndex = 1;
        while (last == nums[currentIndex]) {
            last = nums[currentIndex];

            if (currentIndex == nums.length - 1) return 1;
            currentIndex++;
        }

        int longest = 2;
        int compare = Integer.compare(nums[currentIndex], last);
        for (int i = currentIndex; i < nums.length; i++) {
            boolean larger = nums[i] > nums[i - 1];
            boolean smaller = nums[i] < nums[i - 1];

            if (compare > 0 && smaller) {
                longest++;
                compare = Integer.compare(nums[i], nums[i - 1]);
            } else if (compare < 0 && larger) {
                longest++;
                compare = Integer.compare(nums[i], nums[i - 1]);
            }
        }

        return longest;
    }

    public static int cleanWiggleMaxLength(int[] nums) {
        int down = 1, up = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                up = down + 1;
            else if (nums[i] < nums[i - 1])
                down = up + 1;
        }
        return Math.max(down, up);
    }
}
