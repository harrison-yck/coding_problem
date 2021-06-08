import datastructure.TreeNode;

import java.util.HashMap;
import java.util.Map;


/**
 * @author harrison
 */
public class ConstructBinaryTree {
    private int inorderIndex = 0;
    private int preorderIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, Integer.MIN_VALUE);
    }

    // Divide and Conquer
    private TreeNode build(int[] preorder, int[] inorder, int stop) {
        // base case
        if (preorderIndex >= preorder.length) return null;
        if (inorder[inorderIndex] == stop) {
            inorderIndex++;
            return null;
        }

        int rootVal = preorder[preorderIndex++]; // traversal as bfs
        TreeNode root = new TreeNode(rootVal);

        // root index as pivot (in inorder list) to divide left and right as sub-problems
        root.left = build(preorder, inorder, rootVal);
        root.right = build(preorder, inorder, stop);
        return root;
    }
}
