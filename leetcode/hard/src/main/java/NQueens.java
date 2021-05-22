import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class NQueens {
    private List<List<String>> result;

    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';

        backtrack(board, 0);
        return result;
    }

    private void backtrack(char[][] board, int row) {
        // terminate condition
        if (row == board.length) {
            result.add(toList(board));
            return;
        }

        int n = board[row].length;
        for (int col = 0; col < n; col++) {
            if (!isValid(board, row, col)) continue;

            board[row][col] = 'Q';
            backtrack(board, row + 1);
            board[row][col] = '.';
        }
    }

    private List<String> toList(char[][] board) {
        List<String> result = new ArrayList<>();
        for (char[] chars : board) result.add(new String(chars));
        return result;
    }


    private boolean isValid(char[][] board, int row, int col) {
        int n = board.length;

        // check same row
        for (int i = 0; i < n; i++) if (board[i][col] == 'Q') return false;

        // check all top-left
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) if (board[i][j] == 'Q') return false;

        // check all top-right
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) if (board[i][j] == 'Q') return false;

        return true;
    }
}
