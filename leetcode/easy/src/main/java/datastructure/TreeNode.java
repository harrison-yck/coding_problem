package datastructure;

/**
 * @author harrison
 */

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode create(Integer... nodeValues) {
        return create(nodeValues, 0);
    }

    private static TreeNode create(Integer[] values, Integer index) {
        if (index >= values.length || values[index] == null) return null;
        TreeNode node = new TreeNode(values[index]);
        node.left = create(values, index * 2 + 1);
        node.right = create(values, index * 2 + 2);
        return node;
    }
}
