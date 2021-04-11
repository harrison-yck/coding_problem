import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author harrison
 */
public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        Map<Integer, Integer> levelSum = new HashMap<>();
        int maxDepth = dfs(root, 1, levelSum);
        return levelSum.get(maxDepth);
    }

    private int dfs(TreeNode node, int level, Map<Integer, Integer> levelSum) {
        if (node == null) return level - 1;

        levelSum.put(level, levelSum.getOrDefault(level, 0) + node.val);
        return Math.max(dfs(node.left, level + 1, levelSum), dfs(node.right, level + 1, levelSum));
    }
}
