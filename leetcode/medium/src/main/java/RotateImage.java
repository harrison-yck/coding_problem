/**
 * @author harrison
 */
public class RotateImage {
    public int[][] rotateLBL(int[][] matrix) {
        int length = matrix.length;

        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - 1 - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - 1 - j][i]; // top-left = bottom-left
                matrix[length - 1 - j][i] = matrix[length - 1 - i][length - 1 - j]; // bottom-left = bottom-right
                matrix[length - 1 - i][length - 1 - j] = matrix[j][length - 1 - i]; // bottom-right = top-right
                matrix[j][length - 1 - i] = tmp; // top-right = top-left
            }
        }

        return matrix;
    }

    public int[][] rotateByInverseAndReverse(int[][] matrix) {
        transpose(matrix);
        reflect(matrix);
        return matrix;
    }

    private void transpose(int[][] matrix) {
        int length = matrix.length;

        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    private void reflect(int[][] matrix) {
        int length = matrix.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][length - 1 - j];
                matrix[i][length - 1 - j] = tmp;
            }
        }
    }
}
