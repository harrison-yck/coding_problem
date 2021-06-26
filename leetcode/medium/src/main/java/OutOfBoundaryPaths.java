/**
 * @author harrison
 */
public class OutOfBoundaryPaths {
    private static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        System.out.println(findPaths(1, 3, 3, 0, 1));
    }

    public static int findPaths(int m, int n, int N, int x, int y) {
        int[][][] dp = new int[m][n][N + 1];
        dfs(dp, m, n, N, x, y);
        return dp[x][y][N] % MOD;
    }

    private static int dfs(int[][][] dp, int m, int n, int N, int x, int y) {
        if (x < 0 || y < 0 || x >= m || y >= n) return 1;
        if (x - N >= 0 && y - N >= 0 && m - x > N && n - y > N) return 0; // not enough step to reach boundary
        if (dp[x][y][N] != 0) return dp[x][y][N];

        dp[x][y][N] = (dp[x][y][N] + dfs(dp, m, n, N - 1, x - 1, y)) % MOD;
        dp[x][y][N] = (dp[x][y][N] + dfs(dp, m, n, N - 1, x, y - 1)) % MOD;
        dp[x][y][N] = (dp[x][y][N] + dfs(dp, m, n, N - 1, x + 1, y)) % MOD;
        dp[x][y][N] = (dp[x][y][N] + dfs(dp, m, n, N - 1, x, y + 1)) % MOD;
        return dp[x][y][N];
    }
}
