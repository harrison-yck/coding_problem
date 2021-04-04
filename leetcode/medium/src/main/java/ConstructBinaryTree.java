import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;


/**
 * @author harrison
 */
public class ConstructBinaryTree {
    private int preorderIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderIndices = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) inorderIndices.put(inorder[i], i);

        return build(inorderIndices, preorder, 0, preorder.length - 1);
    }

    // Divide and Conquer
    private TreeNode build(Map<Integer, Integer> inorderIndices, int[] preorder, int left, int right) {
        // base case
        if (left > right) return null;

        int rootVal = preorder[preorderIndex++]; // traversal as bfs
        TreeNode root = new TreeNode(rootVal);

        // root index as pivot (in inorder list) to divide left and right as sub-problems
        root.left = build(inorderIndices, preorder, left, inorderIndices.get(rootVal) - 1);
        root.right = build(inorderIndices, preorder, inorderIndices.get(rootVal) + 1, right);
        return root;
    }
}
