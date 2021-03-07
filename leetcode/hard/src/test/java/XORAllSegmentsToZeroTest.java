import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class XORAllSegmentsToZeroTest {
    @Test
    void test() {
        assertThat(XORAllSegmentsToZero.minChanges(new int[]{1,2,0,3,0}, 1)).isEqualTo(3);
        assertThat(XORAllSegmentsToZero.minChanges(new int[]{3,4,5,2,1,7,3,4,7}, 3)).isEqualTo(3);
        assertThat(XORAllSegmentsToZero.minChanges(new int[]{1,2,4,1,2,5,1,2,6}, 3)).isEqualTo(3);
    }
}
