import datastructure.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FlipBinaryTreeToPreorderTest {
    @Test
    void flipMatchVoyage() {
        var flipBinaryTreeToPreorder = new FlipBinaryTreeToPreorder();
        assertThat(flipBinaryTreeToPreorder.flipMatchVoyage(TreeNode.create(1, 2), new int[]{2, 1})).isEqualTo(List.of(-1));
        assertThat(flipBinaryTreeToPreorder.flipMatchVoyage(TreeNode.create(1, 2, 3), new int[]{1, 3, 2})).isEqualTo(List.of(1));
        assertThat(flipBinaryTreeToPreorder.flipMatchVoyage(TreeNode.create(1, 2, 3), new int[]{1, 2, 3})).isEqualTo(List.of());
    }
}
