import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreesWithFactorsTest {
    @Test
    void numFactoredBinaryTrees() {
        assertThat(BinaryTreesWithFactors.numFactoredBinaryTrees(new int[]{2, 4})).isEqualTo(3);
        assertThat(BinaryTreesWithFactors.numFactoredBinaryTrees(new int[]{2, 4, 5, 10})).isEqualTo(7);
        assertThat(BinaryTreesWithFactors.numFactoredBinaryTrees(new int[]{18, 3, 6, 2})).isEqualTo(12);
    }
}
