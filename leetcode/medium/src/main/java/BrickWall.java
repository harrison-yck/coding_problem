import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author harrison
 */
public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> mem = new HashMap<>();
        for (List<Integer> rows : wall) {
            int rowSum = 0;
            for (int brickIndex = 0; brickIndex < rows.size() - 1; brickIndex++) {
                rowSum += rows.get(brickIndex);
                mem.merge(rowSum, 1, Integer::sum);
            }
        }

        int maxGap = 0;
        for (Integer numOfGap: mem.values()) maxGap = Math.max(maxGap, numOfGap);

        return wall.size() - maxGap;
    }
}
