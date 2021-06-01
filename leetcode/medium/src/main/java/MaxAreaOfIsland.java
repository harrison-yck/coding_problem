/**
 * @author harrison
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                max = Math.max(max, floodFill(i, j ,grid));
            }
        }
        return max;
    }

    private int floodFill(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length) return 0;

        if (grid[i][j] == 1) {
            grid[i][j] = 0;

            int right = floodFill(i + 1, j, grid);
            int left = floodFill(i - 1, j, grid);
            int top = floodFill(i, j + 1, grid);
            int down = floodFill(i, j - 1, grid);

            return 1 + top + down + left + right;
        }

        return 0;
    }
}
