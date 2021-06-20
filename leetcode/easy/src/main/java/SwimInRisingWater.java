/**
 * @author harrison
 */
public class SwimInRisingWater {
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int swimInWater(int[][] grid) {
        int N = grid.length;
        int left = 0, right = N * N - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            boolean[][] visited = new boolean[N][N];

            if (reach(grid, 0, 0, mid, visited)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean reach(int[][] grid, int i, int j, int t, boolean[][] visited) {
        if (grid[i][j] > t) return false;

        int N = grid.length;
        if (i == N - 1 && j == N - 1) return true;

        visited[i][j] = true;

        for (int[] direction : directions) {
            int x = i + direction[0];
            int y = j + direction[1];

            if (x >= 0 && x < N && y >= 0 && y < N && !visited[x][y] && reach(grid, x, y, t, visited)) return true;
        }

        return false;
    }
}
