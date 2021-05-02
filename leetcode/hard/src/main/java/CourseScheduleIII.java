import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author harrison
 */
public class CourseScheduleIII {
    // MLE
//    public int scheduleCourse(int[][] courses) {
//        // handle tasks closer to deadline first
//        Arrays.sort(courses, Comparator.comparingInt(num -> num[1]));
//
//        int[][] dp = new int[courses.length][courses[courses.length - 1][1] + 1];
//        return dfs(courses, 0, 0, dp);
//    }
//
//    private int dfs(int[][] courses, int i, int currentTime, int[][] dp) {
//        if (i == courses.length) return 0;
//        if (dp[i][currentTime] != 0) return dp[i][currentTime];
//
//        int cost = courses[i][0];
//        int deadline = courses[i][1];
//
//        int take = 0;
//        if (currentTime + cost <= deadline) take = 1 + dfs(courses, i + 1, currentTime + cost, dp);
//        int notTake = dfs(courses, i + 1, currentTime, dp);
//        dp[i][currentTime] = Math.max(take, notTake);
//
//        return dp[i][currentTime];
//    }

    // slow
//    public int scheduleCourse(int[][] courses) {
//        Arrays.sort(courses, Comparator.comparingInt(num -> num[1]));
//
//        int time = 0;
//        int count = 0;
//        for (int i = 0; i < courses.length; i++) {
//            int cost = courses[i][0];
//            int deadline = courses[i][1];
//
//            if (time + cost <= deadline) {
//                time += cost;
//                count++;
//            } else {
//                int swapIndex = i;
//                for (int j = 0; j < i; j++) if (courses[j][0] > courses[swapIndex][0]) swapIndex = j; // find largest duration scheduled
//
//                if (courses[swapIndex][0] > cost) time += (cost - courses[swapIndex][0]);
//                courses[swapIndex][0] = -1; // not possible / swapped
//            }
//        }
//
//        return count;
//    }


    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));

        // use pq to find largest duration scheduled
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        int time = 0;
        for (int[] course : courses) {
            int cost = course[0];
            int deadline = course[1];

            if (time + cost <= deadline) {
                pq.offer(cost);
                time += cost;
            } else if (!pq.isEmpty() && pq.peek() > cost) {
                time += cost - pq.poll();
                pq.offer(cost);
            }
        }
        return pq.size();
    }
}
