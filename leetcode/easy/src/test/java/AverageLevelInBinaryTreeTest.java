import datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AverageLevelInBinaryTreeTest {
    private TreeNode root;

    @BeforeEach
    void init() {
        root = TreeNode.create(3, 9, 20, 15,7);
    }

    @Test
    void dfs() {
        var averageLevelInBinaryTree = new AverageLevelInBinaryTree();
        assertThat(averageLevelInBinaryTree.bfs(null)).isEqualTo(List.<Double>of());
        assertThat(averageLevelInBinaryTree.bfs(root)).isEqualTo(List.of(3.0, 14.5, 11.0));
    }

    @Test
    void bfs() {
        var averageLevelInBinaryTree = new AverageLevelInBinaryTree();
        assertThat(averageLevelInBinaryTree.dfs(null)).isEqualTo(List.<Double>of());
        assertThat(averageLevelInBinaryTree.dfs(root)).isEqualTo(List.of(3.0, 14.5, 11.0));
    }
}
