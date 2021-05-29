/**
 * @author harrison
 */
public class NQueensII {
    int count = 0;

    public int totalNQueens(int n) {
        count = 0;
        boolean[] cols = new boolean[n];
        boolean[] diagonals = new boolean[n * 2];
        boolean[] antiDiagonals = new boolean[n * 2];

        backtrack(0, n, cols, diagonals, antiDiagonals);

        return count;
    }

    private void backtrack(int row, int n, boolean[] cols, boolean[] diagonals, boolean[] antiDiagonals) {
        if (row == n) count++;

        for (int col = 0; col < n; col++) {
            int diagonal = col - row + n;
            int antiDiagonal = col + row;

            if (cols[col] || diagonals[diagonal] || antiDiagonals[antiDiagonal]) continue;

            cols[col] = true; diagonals[diagonal] = true; antiDiagonals[antiDiagonal] = true;
            backtrack(row + 1, n, cols, diagonals, antiDiagonals);
            cols[col] = false; diagonals[diagonal] = false; antiDiagonals[antiDiagonal] = false;
        }
    }
}
