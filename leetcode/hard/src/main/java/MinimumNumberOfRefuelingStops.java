import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author harrison
 */
public class MinimumNumberOfRefuelingStops {
    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        if (startFuel >= target) return 0;

        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int i = 0, n = stations.length, stopCount = 0, position = startFuel;
        while (position < target) {
            // append all fuels in stations that we can reach to queue, refill when necessary
            while (i < n && stations[i][0] <= position) queue.offer(stations[i++][1]);

            if (queue.isEmpty()) return -1;
            position += queue.poll();
            stopCount++;
        }
        return stopCount;
    }
}
