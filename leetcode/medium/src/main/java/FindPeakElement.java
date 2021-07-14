/**
 * @author harrison
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        // nums[i] != nums[i + 1] and find "a" peak, so this works
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}
