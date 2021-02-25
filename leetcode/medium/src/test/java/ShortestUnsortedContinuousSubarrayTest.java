import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShortestUnsortedContinuousSubarrayTest {
    @Test
    void findUnsortedSubarray() {
        assertThat(ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[]{2,6,4,8,10,9,15})).isEqualTo(5);
        assertThat(ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[]{1,2,3,4})).isEqualTo(0);
        assertThat(ShortestUnsortedContinuousSubarray.findUnsortedSubarray(new int[]{1})).isEqualTo(0);
    }
}
