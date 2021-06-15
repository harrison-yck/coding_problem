import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author harrison
 */
public class MatchsticksToSquare {
    public static boolean makesquare(int[] matchsticks) {
        if (matchsticks.length < 4) return false;

        int perimeter = 0;
        for (int len : matchsticks) perimeter += len;
        if (perimeter % 4 != 0) return false;

        Arrays.sort(matchsticks);

        return dfs(matchsticks, new int[4], perimeter / 4, matchsticks.length - 1);
    }

    private static boolean dfs(int[] sticks, int[] sides, int expectedSideLength, int i) {
        if (i < 0) return true;

        for (int j = 0; j < 4; j++) {
            boolean longerThanSide = sticks[i] + sides[j] > expectedSideLength;
            boolean duplicatedStick = j > 0 && sides[j] == sides[j - 1];

            if (longerThanSide || duplicatedStick) continue;

            sides[j] += sticks[i];
            if (dfs(sticks, sides, expectedSideLength, i - 1)) return true;
            sides[j] -= sticks[i];
        }

        return false;
    }
}
