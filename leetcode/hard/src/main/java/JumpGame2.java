/**
 * @author harrison
 */

/*
*  45. Jump Game II
*/

public class JumpGame2 {
    public static int jump(int[] nums) {
        if (nums.length == 1) return 0;

        int step = 0;
        int stageRange = nums[0]; // everytime we step on a cell, we enter a stage. We need to check i (the cell we stepped) + range to find the next farthest cell
        int farthestSoFar = 0;

        /*
        *       | stage |
        *       2   3   1   2   4   5   6   7   8   9
        *      0+2 1+3 2+1
        *
        *      -> so next farthest cell is 4, and we update the stage, eventually we find the minimum number of jumps
        *                       |     stage     |
        *       2   3   1   2   4   5   6   7   8   9
        */

        for (int i = 0; i < nums.length; i++) {
            farthestSoFar = Math.max(farthestSoFar, i + nums[i]);

            if (i == stageRange || i == nums.length - 1) {
                step++;
                stageRange = farthestSoFar;
            }
        }

        return step;
    }
}
