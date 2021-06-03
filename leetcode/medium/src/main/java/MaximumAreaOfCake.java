import java.util.Arrays;

/**
 * @author harrison
 */
public class MaximumAreaOfCake {
    private static final long MOD = (long) 1e9 + 7;

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(verticalCuts);
        Arrays.sort(horizontalCuts);

        long maxVertical = verticalCuts[0];
        for (int i = 1; i < verticalCuts.length; i++) maxVertical = Math.max(maxVertical, verticalCuts[i] - verticalCuts[i - 1]);
        maxVertical = Math.max(maxVertical, w - verticalCuts[verticalCuts.length - 1]);

        long maxHorizontal = horizontalCuts[0];
        for (int i = 1; i < horizontalCuts.length; i++) maxHorizontal = Math.max(maxHorizontal, horizontalCuts[i] - horizontalCuts[i - 1]);
        maxHorizontal = Math.max(maxHorizontal, h - horizontalCuts[horizontalCuts.length - 1]);

        return (int) ((maxVertical * maxHorizontal) % MOD);
    }
}
