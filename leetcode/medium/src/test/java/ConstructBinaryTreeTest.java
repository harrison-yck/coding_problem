import datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ConstructBinaryTreeTest {
    @Test
    void buildTree() {
        var tree = new ConstructBinaryTree();
        assertThat(tree.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7})).usingRecursiveComparison().isEqualTo(TreeNode.create(3, 9, 20, null, null, 15, 7));
    }
}
