import datastructure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TreeLevelOrderTraversalTest {
    @Test
    void levelOrder() {
        assertThat(TreeLevelOrderTraversal.recursiveLevelOrder(TreeNode.create(3, 9, 20, null, null, 15, 7))).isEqualTo(List.of(List.of(3), List.of(9, 20), List.of(15, 7)));
        assertThat(TreeLevelOrderTraversal.iterativeLevelOrder(TreeNode.create(3, 9, 20, null, null, 15, 7))).isEqualTo(List.of(List.of(3), List.of(9, 20), List.of(15, 7)));
    }
}
