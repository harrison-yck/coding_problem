/**
 * @author harrison
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int numOfDes = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                if (numOfDes >= 1) return false;
                numOfDes++;

                if (i < 2 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return true;
    }
}
