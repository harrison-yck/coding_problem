import datastructure.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeepestLeavesSumTest {
    @Test
    void test() {
        DeepestLeavesSum deepestLeavesSum = new DeepestLeavesSum();
        TreeNode tree = TreeNode.create(1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, null, null, 8);
        assertThat(deepestLeavesSum.deepestLeavesSum(tree)).isEqualTo(15);
    }
}
