/**
 * @author harrison
 */
public class ReshapeMatrix {
    public static void main(String[] args) {
        matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length, col = mat[0].length;

        if (r * c != row * col) {
            return mat;
        }

        int totalColumn = mat[0].length;

        int[][] newMat = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            newMat[i / c][i % c] = mat[i / totalColumn][i % totalColumn];
        }

        return newMat;
    }
}
