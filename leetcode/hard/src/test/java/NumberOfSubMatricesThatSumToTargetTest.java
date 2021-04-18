import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfSubMatricesThatSumToTargetTest {
    @Test
    void numSubMatrixSumTarget() {
        NumberOfSubMatricesThatSumToTarget sum = new NumberOfSubMatricesThatSumToTarget();
        assertThat(sum.numSubMatrixSumTarget(new int[][]{{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, 0)).isEqualTo(4);
        assertThat(sum.numSubMatrixSumTarget(new int[][]{{1, -1}, {-1, 1}}, 0)).isEqualTo(5);
        assertThat(sum.numSubMatrixSumTarget(new int[][]{{904}}, 0)).isEqualTo(0);
    }
}
