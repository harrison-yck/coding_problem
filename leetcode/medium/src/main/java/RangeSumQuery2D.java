/**
 * @author harrison
 */
public class RangeSumQuery2D {
    private final int[][] sumMatrix;

    public RangeSumQuery2D(int[][] matrix) {
        int x = matrix.length, y = matrix[0].length;
        sumMatrix = new int[x + 1][y + 1];

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                sumMatrix[i][j] = sumMatrix[i - 1][j] + sumMatrix[i][j - 1] - sumMatrix[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumMatrix[row2 + 1][col2 + 1] - sumMatrix[row2 + 1][col1] - sumMatrix[row1][col2 + 1] + sumMatrix[row1][col1];
    }
}
