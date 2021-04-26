import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author harrison
 */
public class FurthestBuildingCanReach {
    // TLE
//    public int furthestBuilding(int[] heights, int bricks, int ladders) {
//        return findFurthest(0, bricks, ladders, heights);
//    }
//
//    private int findFurthest(int distance, int bricks, int ladders, int[] heights) {
//        if (bricks < 0 || ladders < 0) return distance - 1;
//        else if (distance == heights.length - 1) return distance;
//
//        int diff = heights[distance + 1] - heights[distance];
//        if (diff > 0) {
//            if (bricks == 0 && ladders == 0) return distance;
//
//            int useBrick = findFurthest(distance + 1, bricks - diff, ladders, heights);
//            int useLadder = findFurthest(distance + 1, bricks, ladders - 1, heights);
//            return Math.max(useBrick, useLadder);
//        } else {
//            return findFurthest(distance + 1, bricks, ladders, heights);
//        }
//    }

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int length = heights.length;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i < length; i++) {
            int diff = heights[i] - heights[i - 1];

            if (diff > 0) pq.offer(diff);

            // we can use ladder to solve any jump
            // when jump more than ladder, when try to solve it with brick
            // if we can't solve with brick, we need to use ladders to solve the rest
            if (pq.size() > ladders) bricks -= pq.poll();
            if (bricks < 0) return i - 1;
        }

        return length - 1;
    }
}
