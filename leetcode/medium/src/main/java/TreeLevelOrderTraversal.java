import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author harrison
 */

/*
* 102. Binary Tree Level Order Traversal
* */
public class TreeLevelOrderTraversal {
    public static List<List<Integer>> recursiveLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        Map<Integer, List<Integer>> listInLevels = new HashMap<>();
        traversal(root, 0, listInLevels);
        return new ArrayList<>(listInLevels.values());
    }

    private static void traversal(TreeNode node, int level, Map<Integer, List<Integer>> listInLevels) {
        List<Integer> valuesInList = listInLevels.getOrDefault(level, new ArrayList<>());
        valuesInList.add(node.val);
        listInLevels.put(level, valuesInList);

        if (node.left != null) traversal(node.left, level + 1, listInLevels);
        if (node.right != null) traversal(node.right, level + 1, listInLevels);
    }

    public static List<List<Integer>> iterativeLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();

        List<List<Integer>> valuesInAllLevel = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // add root into queue

        while (!queue.isEmpty()) {
            int numOfNodes = queue.size();
            List<Integer> valuesInLevel = new ArrayList<>();

            for (int i = 0; i < numOfNodes; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left); // put left into queue
                if (queue.peek().right != null) queue.offer(queue.peek().right); // put right into queue
                valuesInLevel.add(queue.poll().val); // add current node value into list
            }
            valuesInAllLevel.add(valuesInLevel);
        }

        return valuesInAllLevel;
    }
}
