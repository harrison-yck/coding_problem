import datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AverageLevelInBinaryTreeTest {
    private TreeNode root;

    @BeforeEach
    void init() {
        root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    }

    @Test
    void dfs() {
        assertThat(AverageLevelInBinaryTree.bfs(null)).isEqualTo(List.<Double>of());
        assertThat(AverageLevelInBinaryTree.bfs(root)).isEqualTo(List.of(3.0, 14.5, 11.0));
    }

    @Test
    void bfs() {
        assertThat(AverageLevelInBinaryTree.dfs(null)).isEqualTo(List.<Double>of());
        assertThat(AverageLevelInBinaryTree.dfs(root)).isEqualTo(List.of(3.0, 14.5, 11.0));
    }
}
