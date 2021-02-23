import java.util.List;

/**
 * @author harrison
 */
public class BrokenCalculator {
    public static int solve(int X, int Y) {
        if (X == Y) {
            return 0;
        } else if (X > Y) {
            return X - Y;
        } else {
            if (Y % 2 == 0) return 1 + solve(X, Y / 2);
            else return 1 + solve(X, Y + 1);
        }
    }
}
