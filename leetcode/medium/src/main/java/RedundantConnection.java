import java.util.Arrays;
import java.util.Comparator;

/**
 * @author harrison
 */
public class RedundantConnection {
    public static void main(String[] args) {
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 3}};

        for (int[] link : edges) System.out.println(link[0] + " <- " + link[1]);

        int[] redundantConnection = findRedundantConnection(edges);

        System.out.println("-----------");
        System.out.println(redundantConnection[0] + " <- " + redundantConnection[1]);
    }

    public static int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[1001];
        Arrays.fill(parent, -1);

        for (int[] link : edges) {
            int fromRoot = find(parent, link[1]);
            int toRoot = find(parent, link[0]);

            if (fromRoot == toRoot) return link; // duplicated
            parent[fromRoot] = toRoot;
        }

        return null;
    }

    private static int find(int[] parent, int target) {
        while (parent[target] != target) {
            if (parent[target] == -1) parent[target] = target;
            else target = parent[target];
        }
        return parent[target];
    }
}
