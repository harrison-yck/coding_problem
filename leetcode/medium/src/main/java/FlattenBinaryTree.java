import datastructure.TreeNode;

/**
 * @author harrison
 */
public class FlattenBinaryTree {
    private TreeNode prev = null;

    public void postOrderRecur(TreeNode root) {
        if (root == null) return;

        postOrderRecur(root.right);
        postOrderRecur(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

    public void preOrderRecur(TreeNode root) {
        if (root == null) return;

        preOrderRecur(root.left);
        preOrderRecur(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;
        while (root.right != null) root = root.right;
        root.right = right;
    }

    public void preOrderIter(TreeNode root) {
        while (root != null) {
            if (root.left == null) {
                root = root.right;
            } else {
                TreeNode left = root.left;
                while (left.right != null) {
                    left = left.right;
                }
                left.right = root.right;
                root.right = root.left;
                root.left = null;
            }
        }
    }
}
