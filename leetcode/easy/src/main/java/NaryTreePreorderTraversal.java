import datastructure.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author harrison
 */
public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
    }

    private void traversal(Node root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        for (Node node : root.children) traversal(node, result);
    }
}
