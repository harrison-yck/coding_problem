/**
 * @author harrison
 */
public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        boolean[] colHasZero = new boolean[matrix.length];
        boolean[] rowHasZero = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rowHasZero[i] = true;
                    colHasZero[j] = true;
                }
            }
        }

        for (int i = 0; i < rowHasZero.length; i++) {
            for (int j = 0; j < colHasZero.length; j++) {
                if (rowHasZero[i] || colHasZero[j]) matrix[i][j] = 0;
            }
        }
    }
}
