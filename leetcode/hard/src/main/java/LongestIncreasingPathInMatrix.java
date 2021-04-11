/**
 * @author harrison
 */
public class LongestIncreasingPathInMatrix {
    private static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int longestIncreasingPath(int[][] matrix) {
        if (matrix.length == 0) return 0;

        int[][] dp = new int[matrix.length][matrix[0].length];

        int max = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                max = Math.max(max, findPath(i, j, matrix, dp));
            }
        }
        return max;
    }

    private int findPath(int i, int j, int[][] matrix, int[][] dp) {
        if (dp[i][j] != 0) return dp[i][j];

        int m = matrix.length, n = matrix[i].length;

        int max = 1;
        for (int[] direction: DIRECTIONS) {
            int x = i + direction[0], y = j + direction[1];
            if (x < 0 || y < 0 || x >= m || y >= n || matrix[x][y] <= matrix[i][j]) continue;

            max = Math.max(max, 1 + findPath(x, y, matrix, dp));
        }
        dp[i][j] = max;

        return dp[i][j];
    }
}
