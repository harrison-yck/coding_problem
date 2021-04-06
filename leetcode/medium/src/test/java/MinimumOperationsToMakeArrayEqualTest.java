import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinimumOperationsToMakeArrayEqualTest {
    @Test
    void test() {
        MinimumOperationsToMakeArrayEqual minimumOperationsToMakeArrayEqual = new MinimumOperationsToMakeArrayEqual();
        assertThat(minimumOperationsToMakeArrayEqual.minOperations(3)).isEqualTo(2);
        assertThat(minimumOperationsToMakeArrayEqual.minOperations(6)).isEqualTo(9);
    }
}
