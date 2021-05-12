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

    public void setZeroesOne(int[][] matrix) { // O(1) space
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean rowZero = false;
        boolean colZero = false;

        for (int i = 0; i < cols; i++)
            if (matrix[0][i] == 0) {
                rowZero = true;
                break;
            }

        for (int i = 0; i < rows; i++)
            if (matrix[i][0] == 0) {
                colZero = true;
                break;
            }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < matrix[0].length; i++) if (rowZero) matrix[0][i] = 0;
        for (int i = 0; i < matrix.length; i++) if (colZero) matrix[i][0] = 0;
    }
}
