import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class PacificAtlanticWaterFlow {
    public static List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new ArrayList<>();

        int numOfRow = matrix.length;
        int numOfCol = matrix[0].length;

        boolean[][] visitedFromPacific = new boolean[numOfRow][numOfCol];
        boolean[][] visitedFromAtlantic = new boolean[numOfRow][numOfCol];

        for (int i = 0; i < matrix.length; i++) {
            flood(i, 0, numOfRow, numOfCol, -1, matrix, visitedFromPacific);
            flood(i, numOfCol - 1, numOfRow, numOfCol, -1, matrix, visitedFromAtlantic);
        }

        for (int i = numOfCol - 1; i >= 0; i--) {
            flood(0, i, numOfRow, numOfCol, -1, matrix, visitedFromPacific);
            flood(numOfRow - 1, i, numOfRow, numOfCol, -1, matrix, visitedFromAtlantic);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numOfRow; i++) {
            for (int j = 0; j < numOfCol; j++) {
                if (visitedFromPacific[i][j] && visitedFromAtlantic[i][j]) result.add(List.of(i, j));
            }
        }

        return result;
    }

    private static void flood(int x, int y, int m, int n, int previous, int[][] matrix, boolean[][] reached) {
        if (x >= m || y >= n || x < 0 || y < 0) return;
        if (reached[x][y]) return;

        int current = matrix[x][y];
        if (current < previous) return;

        reached[x][y] = true;

        flood(x + 1, y, m, n, current, matrix, reached);
        flood(x, y + 1, m, n, current, matrix, reached);
        flood(x - 1, y, m, n, current, matrix, reached);
        flood(x, y - 1, m, n, current, matrix, reached);
    }
}
