import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class CriticalConnectionsInNetwork {
    // tarjan algorithm
    // ref: https://www.geeksforgeeks.org/tarjan-algorithm-find-strongly-connected-components/
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<Integer>[] graph = buildGraph(n, connections);

        int[] low = new int[n];
        int[] disc = new int[n];

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) if (disc[i] == 0) dfs(i, disc, low, graph, result, i);
        return result;
    }

    // connection is not necessarily sorted, so build a sorted one
    private List<Integer>[] buildGraph(int n, List<List<Integer>> connections) {
        @SuppressWarnings("unchecked")
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (List<Integer> connection : connections) {
            int from = connection.get(0);
            int to = connection.get(1);
            graph[from].add(to);
            graph[to].add(from);
        }
        return graph;
    }

    private int time = 1;
    private void dfs(int u, int[] disc, int[] low, List<Integer>[] graph, List<List<Integer>> result, int last) {
        disc[u] = low[u] = ++time;

        for (int i = 0; i < graph[u].size(); i++) {
            int v = graph[u].get(i);

            if (v == last) continue; // parent vertex, ignore

            if (disc[v] == 0) {
                dfs(v, disc, low, graph, result, u);
                low[u] = Math.min(low[u], low[v]);

                if (low[v] > disc[u]) result.add(List.of(u, v)); // critical connection
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
