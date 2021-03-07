import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinimumElementsAddToFormGivenSumTest {
    @Test
    void test() {
        assertThat(MinimumElementsAddToFormGivenSum.minElements(new int[]{1, -1, 1}, 3, -4)).isEqualTo(2);
        assertThat(MinimumElementsAddToFormGivenSum.minElements(new int[]{1, -10, 9, 1}, 100, 0)).isEqualTo(1);
    }
}
