import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class FlipBinaryTreeToPreorder {
    List<Integer> result = new ArrayList<>();
    int index = 0;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        return dfs(root, voyage) ? result : List.of(-1);
    }

    private boolean dfs(TreeNode node, int[] voyage) {
        if (node == null) return true;
        if (node.val != voyage[index++]) return false; // first node not equal or not equal after flapping

        if (node.left != null && node.left.val != voyage[index]) { // flap
            result.add(node.val);
            return dfs(node.right, voyage) && dfs(node.left, voyage);
        }

        return dfs(node.left, voyage) && dfs(node.right, voyage);
    }
}
