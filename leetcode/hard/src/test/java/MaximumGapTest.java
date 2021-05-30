import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MaximumGapTest {

    @Test
    void maximumGapByBucket() {
        MaximumGap maximumGap = new MaximumGap();
        assertThat(maximumGap.maximumGapByBucket(new int[]{3, 6, 9, 1})).isEqualTo(3);
    }
}
