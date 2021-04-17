import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SubarraySumEqualsKTest {
    @Test
    void test() {
        SubarraySumEqualsK subarraySumEqualsK = new SubarraySumEqualsK();
        assertThat(subarraySumEqualsK.subarraySum(new int[] {1, 1, 1}, 2)).isEqualTo(2);
        assertThat(subarraySumEqualsK.subarraySum(new int[] {1, 2, 3}, 3)).isEqualTo(2);
    }
}
