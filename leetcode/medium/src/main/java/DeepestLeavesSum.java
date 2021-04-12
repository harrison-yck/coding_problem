import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author harrison
 */
public class DeepestLeavesSum {
//    public int deepestLeavesSum(TreeNode root) {
//        Map<Integer, Integer> levelSum = new HashMap<>();
//        int maxDepth = dfs(root, 1, levelSum);
//        return levelSum.get(maxDepth);
//    }
//
//    private int dfs(TreeNode node, int level, Map<Integer, Integer> levelSum) {
//        if (node == null) return level - 1;
//
//        levelSum.put(level, levelSum.getOrDefault(level, 0) + node.val);
//        return Math.max(dfs(node.left, level + 1, levelSum), dfs(node.right, level + 1, levelSum));
//    }

    private int maxLevel = 0;
    private int sum = 0;

    public int deepestLeavesSum(TreeNode root) {
        if (root == null) return 0;
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode node, int level) {
        if (node == null) return;

        if (level > maxLevel) {
            sum = node.val;
            maxLevel = level;
        } else if (level == maxLevel) {
            sum += node.val;
        }

        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}
