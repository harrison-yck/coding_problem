import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author harrison
 */
public class MaximumPerformanceOfATeam {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        PriorityQueue<Integer> speeds = new PriorityQueue<>(k);

        TeamMember[] teamMembers = new TeamMember[n];
        for (int i = 0; i < n; i++) teamMembers[i] = new TeamMember(speed[i], efficiency[i]);
        Arrays.sort(teamMembers, (a, b) -> b.efficiency - a.efficiency); // sorted by efficiency

        long maxPerformance = 0, speedSum = 0;
        for (TeamMember teamMember : teamMembers) {
            speeds.add(teamMember.speed);
            speedSum += teamMember.speed;

            if (speeds.size() > k) speedSum -= speeds.remove();

            maxPerformance = Math.max(maxPerformance, (speedSum * teamMember.efficiency));
        }

        return (int) (maxPerformance % ((long) 1e9 + 7));
    }

    private static class TeamMember {
        int speed;
        int efficiency;

        public TeamMember(int speed, int efficiency) {
            this.speed = speed;
            this.efficiency = efficiency;
        }
    }
}
