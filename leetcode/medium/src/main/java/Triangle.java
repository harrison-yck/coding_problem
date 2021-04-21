import java.util.List;

/**
 * @author harrison
 */
public class Triangle {
    public int topDownMinimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        return findMin(0, 0, dp, triangle);
    }

    private int findMin(int level, int index, int[][] dp, List<List<Integer>> triangle) {
        if (level == triangle.size()) return 0;
        else if (dp[level][index] != 0) return dp[level][index];

        dp[level][index] = triangle.get(level).get(index) + Math.min(findMin(level + 1, index, dp, triangle), findMin(level + 1, index + 1, dp, triangle));
        return dp[level][index];
    }

    public int bottomUpMinimumTotal(List<List<Integer>> triangle) {
        int[] result = new int[triangle.size() + 1];

        for (int level = triangle.size() - 1; level >= 0; level--) {
            for (int index = 0; index < triangle.get(level).size(); index++) {
                result[index] = Math.min(result[index], result[index + 1]) + triangle.get(level).get(index);
            }
        }
        return result[0];
    }
}
