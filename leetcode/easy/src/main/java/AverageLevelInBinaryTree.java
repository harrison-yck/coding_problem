
import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author harrison
 */
public class AverageLevelInBinaryTree {
    public static List<Double> bfs(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Deque<TreeNode> nodes = new LinkedList<>();

        if (root == null) return result;

        nodes.add(root);
        while (!nodes.isEmpty()) {
            double sum = 0;
            int numOfNode = nodes.size();

            for (int i = 0; i < numOfNode; i++) {
                TreeNode node = nodes.poll();
                if (node.left != null) nodes.offer(node.left);
                if (node.right != null) nodes.offer(node.right);
                sum += node.val;
            }

            result.add(sum / numOfNode);
        }

        return result;
    }

    public static List<Double> dfs(TreeNode root) {
        List<Double> result = new ArrayList<>();

        Map<Integer, Double> sum = new HashMap<>();
        Map<Integer, Integer> nodesInLevels = new HashMap<>();

        if (root == null) return result;

        traverse(root, 0, sum, nodesInLevels);
        for (int i = 0; i < sum.size(); i++) result.add(sum.get(i) / nodesInLevels.get(i));

        return result;
    }

    private static void traverse(TreeNode node, int level, Map<Integer, Double> sum, Map<Integer, Integer> nodesInLevel) {
        if (node == null) return;

        sum.put(level, sum.getOrDefault(level, 0.0) + node.val);
        nodesInLevel.merge(level, 1, Integer::sum);

        traverse(node.left, level+1, sum, nodesInLevel);
        traverse(node.right, level+1, sum, nodesInLevel);
    }
}
